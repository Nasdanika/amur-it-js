package org.nasdanika.amur.it.js.provider.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.nasdanika.amur.it.js.Cloning;
import org.nasdanika.amur.it.js.JsFactory;
import org.nasdanika.amur.it.js.Parameter;

class ParametersComposite extends Composite {
	private Table parametersTable;
	private Button upButton;
	private Button deleteButton;
	private Button downButton;
	private Button addButton;
	
	private List<TableEditor[]> tableEditors = new ArrayList<TableEditor[]>();
	
	public ParametersComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style,
			EList<Parameter> value) {
		
		super(parent, style);

		GridLayout thisLayout = new GridLayout();
		thisLayout.numColumns = 4;
		this.setLayout(thisLayout);

		GridData parametersTableLData = new GridData();
		parametersTableLData.horizontalSpan = 4;
		parametersTableLData.verticalAlignment = GridData.FILL;
		parametersTableLData.grabExcessVerticalSpace = true;
		parametersTableLData.horizontalAlignment = GridData.FILL;
		parametersTableLData.grabExcessHorizontalSpace = true;
		parametersTableLData.heightHint = 200;
				
		parametersTable = new Table(this, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		parametersTable.setLayoutData(parametersTableLData);
		
		parametersTable.setLinesVisible(true);
		parametersTable.setHeaderVisible(true);
		
		final TableColumn nameColumn = new TableColumn(parametersTable, SWT.NONE);
		nameColumn.setWidth(150);
		nameColumn.setText("Name");

		final TableColumn tokenColumn = new TableColumn(parametersTable, SWT.NONE);
		tokenColumn.setWidth(50);
		tokenColumn.setText("Token");
		
		final TableColumn cloneColumn = new TableColumn(parametersTable, SWT.NONE);
		cloneColumn.setWidth(70);
		cloneColumn.setText("Clone");
		
		final TableColumn descriptionColumn = new TableColumn(parametersTable, SWT.NONE);
		descriptionColumn.setWidth(250);
		descriptionColumn.setText("Description");
				
		parametersTable.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				super.controlResized(e);
				descriptionColumn.setWidth(parametersTable.getBounds().width-10-cloneColumn.getWidth()-tokenColumn.getWidth()-nameColumn.getWidth());
			}
		});
		
		addButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData addButtonLData = new GridData();
		addButton.setLayoutData(addButtonLData);
		addButton.setText("Add");
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addRow("arg"+tableEditors.size(), false, Cloning.NONE, "", -1);
			}
		});

		deleteButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData deleteButtonLData = new GridData();
		deleteButton.setLayoutData(deleteButtonLData);
		deleteButton.setText("Delete");
		deleteButton.setEnabled(false);
		deleteButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (MessageDialog.openConfirm(getShell(), "Delete parameter", "Delete parameter?")) {
					int[] selectionIndices = parametersTable.getSelectionIndices();
					parametersTable.remove(selectionIndices);
					parametersTable.notifyListeners(SWT.MouseDown, new Event()); // easy way to re-layout editors.
					deleteButton.setEnabled(parametersTable.getSelectionCount()>0);
				}
			}
		});
		
		parametersTable.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteButton.setEnabled(parametersTable.getSelectionCount()>0);
				upButton.setEnabled(parametersTable.getSelectionCount()>0 && parametersTable.getSelectionIndex()>0);
				downButton.setEnabled(parametersTable.getSelectionCount()>0 && parametersTable.getSelectionIndex()<parametersTable.getItemCount()-1);				
			}
		});
		
		upButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData upButtonLData = new GridData();
		upButton.setLayoutData(upButtonLData);
		upButton.setText("Move Up");
		upButton.setEnabled(false);
		
		upButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int idx = parametersTable.getSelectionIndex();
				TableEditor[] te1 = itemEditors(parametersTable.getItem(idx));
				TableEditor[] te2 = itemEditors(parametersTable.getItem(idx-1));				
				swap(te1, te2);
				parametersTable.setSelection(idx-1);
			}
			
		}); 

		downButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData downButtonLData = new GridData();
		downButton.setLayoutData(downButtonLData);
		downButton.setText("Move Down");
		downButton.setEnabled(false);
		
		downButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int idx = parametersTable.getSelectionIndex();
				TableEditor[] te1 = itemEditors(parametersTable.getItem(idx));
				TableEditor[] te2 = itemEditors(parametersTable.getItem(idx+1));				
				swap(te1, te2);
				parametersTable.setSelection(idx+1);
			}

		}); 
		
		if (value!=null) {
			for (Parameter p: value) {
				addRow(p.getName(), p.isToken(), p.getCloning(), p.getDescription(), -1);
			}
		}
		
		this.layout();
	}
	
	private static void swap(TableEditor[] te1, TableEditor[] te2) {
		String name = ((Text) te1[0].getEditor()).getText();
		((Text) te1[0].getEditor()).setText(((Text) te2[0].getEditor()).getText());
		((Text) te2[0].getEditor()).setText(name);
		
		boolean isToken = ((Button) te1[1].getEditor()).getSelection();
		((Button) te1[1].getEditor()).setSelection(((Button) te2[1].getEditor()).getSelection());
		((Button) te2[1].getEditor()).setSelection(isToken);

		int clone = ((Combo) te1[2].getEditor()).getSelectionIndex();
		((Combo) te1[2].getEditor()).select(((Combo) te2[2].getEditor()).getSelectionIndex());
		((Combo) te2[2].getEditor()).select(clone);
		
		String description = ((Text) te1[3].getEditor()).getText();
		((Text) te1[3].getEditor()).setText(((Text) te2[0].getEditor()).getText());
		((Text) te2[3].getEditor()).setText(description);		
	}
	
	private void addRow(String name, boolean isToken, Cloning clone, String description, int idx) {
		TableItem row = idx==-1 ? new TableItem(parametersTable, SWT.BORDER) : new TableItem(parametersTable, SWT.BORDER, idx);
		
		final TableEditor nameEditor = new TableEditor(parametersTable);
		final Text nameText = new Text(parametersTable, SWT.BORDER);
		
		if (name!=null) {
			nameText.setText(name);
		}
		nameEditor.grabHorizontal = true;
		nameEditor.setEditor(nameText, row, 0);
		
		final TableEditor tokenEditor = new TableEditor(parametersTable);
		final Button tokenButton = new Button(parametersTable, SWT.CHECK);
		tokenButton.pack();
		tokenButton.setSelection(isToken);		
		tokenEditor.minimumWidth = tokenButton.getSize().x;
		tokenEditor.horizontalAlignment = SWT.CENTER;
		tokenEditor.setEditor(tokenButton, row, 1);
				    
		final TableEditor cloneEditor = new TableEditor(parametersTable);
		cloneEditor.grabHorizontal = true;
		cloneEditor.grabVertical = true;
		final Combo cloneCombo = new Combo(parametersTable, SWT.BORDER);
		for (Cloning c: Cloning.values()) {
			cloneCombo.add(c.getName());
		}
		if (clone!=null) {
			cloneCombo.select(clone.ordinal());
		}
		cloneEditor.setEditor(cloneCombo, row, 2);

		final TableEditor descriptionEditor = new TableEditor(parametersTable);
		final Text descriptionText = new Text(parametersTable, SWT.BORDER);
		
		if (description!=null) {
			descriptionText.setText(description);
		}
		descriptionEditor.grabHorizontal = true;
		descriptionEditor.setEditor(descriptionText, row, 3);		
		
		row.addDisposeListener(new DisposeListener() {
			
			@Override
			public void widgetDisposed(DisposeEvent e) {
				nameEditor.dispose();
				nameText.dispose();
				
				tokenEditor.dispose();
				tokenButton.dispose();
				
				cloneEditor.dispose();
				cloneCombo.dispose();
				
				descriptionEditor.dispose();
				descriptionText.dispose();
				
				Iterator<TableEditor[]> rit = tableEditors.iterator();
				while (rit.hasNext()) {
					TableEditor[] r = rit.next();
					if (r[0] == nameEditor) {
						rit.remove();
						break;
					}
				}
				
			}
		});
		
		tableEditors.add(new TableEditor[] {nameEditor, tokenEditor, cloneEditor, descriptionEditor});
	}
	
	private TableEditor[] itemEditors(TableItem item) {
		for (TableEditor[] te: tableEditors) {
			if (te[0].getItem()==item) {
				return te;
			}
		}		
		return null;
	}
	
	public EList<Parameter> getValue() {
		EList<Parameter> ret = new BasicEList<>();
		for (TableEditor[] te: tableEditors) {
			Parameter p = JsFactory.eINSTANCE.createParameter();
			p.setName(((Text) te[0].getEditor()).getText());
			p.setToken(((Button) te[1].getEditor()).getSelection());
			p.setCloning(Cloning.values()[((Combo) te[2].getEditor()).getSelectionIndex()]);
			p.setDescription(((Text) te[3].getEditor()).getText());
			ret.add(p);
		}
		
		return ret;
	}
	
}
