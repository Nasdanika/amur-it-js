package org.nasdanika.amur.it.js.provider.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.nasdanika.amur.it.js.JoinEntry;
import org.nasdanika.amur.it.js.JsFactory;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

class JoinConditionsComposite extends Composite {
	private Table conditionsTable;
	private Button upButton;
	private Button deleteButton;
	private Button downButton;
	private Button addButton;
	private List<JoinEntry> ret;
	
	private List<TableEditor[]> tableEditors = new ArrayList<TableEditor[]>();
	private AdapterFactory adapterFactory;
	private CompletionProviderFactory completionProviderFactory;
	
	public JoinConditionsComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style,
			final AdapterFactory adapterFactory,
			final CompletionProviderFactory completionProviderFactory,
			List<JoinEntry> value) {
		
		super(parent, style);
		this.adapterFactory = adapterFactory;
		this.completionProviderFactory = completionProviderFactory;
		if (value instanceof EObject) {
			this.ret = (List<JoinEntry>) EcoreUtil.copy((EObject) value);
		} else {
			this.ret = new BasicEList<JoinEntry>();
		}
		
		GridLayout thisLayout = new GridLayout();
		thisLayout.numColumns = 4;
		this.setLayout(thisLayout);
		
		// TODO - Port drop-down - different conditions for different ports.

		GridData conditionsTableLData = new GridData();
		conditionsTableLData.horizontalSpan = 4;
		conditionsTableLData.verticalAlignment = GridData.FILL;
		conditionsTableLData.grabExcessVerticalSpace = true;
		conditionsTableLData.horizontalAlignment = GridData.FILL;
		conditionsTableLData.grabExcessHorizontalSpace = true;
		conditionsTableLData.heightHint = 200;
		conditionsTableLData.widthHint = 435;
				
		conditionsTable = new Table(this, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		conditionsTable.setLayoutData(conditionsTableLData);
		
		conditionsTable.setLinesVisible(true);
		conditionsTable.setHeaderVisible(true);
		
		final TableColumn previewColumn = new TableColumn(conditionsTable, SWT.NONE);
		previewColumn.setWidth(400);
		previewColumn.setText("Condition");

		final TableColumn editButtonColumn = new TableColumn(conditionsTable, SWT.NONE);
		editButtonColumn.setWidth(35);
		editButtonColumn.setText("Edit");
		
		conditionsTable.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				super.controlResized(e);
				previewColumn.setWidth(conditionsTable.getBounds().width-10-editButtonColumn.getWidth());
			}
		});
		
		addButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData addButtonLData = new GridData();
		addButton.setLayoutData(addButtonLData);
		addButton.setText("Add");
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addRow(null, -1);
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
					int[] selectionIndices = conditionsTable.getSelectionIndices();
					conditionsTable.remove(selectionIndices);
					conditionsTable.notifyListeners(SWT.MouseDown, new Event()); // easy way to re-layout editors.
					deleteButton.setEnabled(conditionsTable.getSelectionCount()>0);
				}
			}
		});
		
		conditionsTable.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteButton.setEnabled(conditionsTable.getSelectionCount()>0);
				upButton.setEnabled(conditionsTable.getSelectionCount()>0 && conditionsTable.getSelectionIndex()>0);
				downButton.setEnabled(conditionsTable.getSelectionCount()>0 && conditionsTable.getSelectionIndex()<conditionsTable.getItemCount()-1);				
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
				int idx = conditionsTable.getSelectionIndex();
				TableEditor[] te1 = itemEditors(conditionsTable.getItem(idx));
				TableEditor[] te2 = itemEditors(conditionsTable.getItem(idx-1));				
				swap(te1, te2);
				conditionsTable.setSelection(idx-1);
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
				int idx = conditionsTable.getSelectionIndex();
				TableEditor[] te1 = itemEditors(conditionsTable.getItem(idx));
				TableEditor[] te2 = itemEditors(conditionsTable.getItem(idx+1));				
				swap(te1, te2);
				conditionsTable.setSelection(idx+1);
			}

		}); 
		
		if (value!=null && !value.isEmpty()) {
			JoinEntry je = value.get(0); // TODO - get from currently selected port in the combo.
			for (Source s: je.getConditions()) {
				addRow(s, -1);
			}
		}
		
		this.layout();
	}
	
	private static void swap(TableEditor[] te1, TableEditor[] te2) {
		String name = ((Text) te1[0].getEditor()).getText();
		((Text) te1[0].getEditor()).setText(((Text) te2[0].getEditor()).getText());
		((Text) te2[0].getEditor()).setText(name);
		
		Object data = te1[1].getEditor().getData();
		te1[1].getEditor().setData(te2[1].getEditor().getData());
		te2[1].getEditor().setData(data);
	}
	
	private String sourceLabel(Source source) {
		if (source==null) {
			return "";
		} 
		
		IItemLabelProvider labelProvider = adapterFactory==null ? null : (IItemLabelProvider) adapterFactory.adapt(source, IItemLabelProvider.class);
		if (labelProvider==null) {
			StringBuilder tBuilder = new StringBuilder();
			if (source.getLanguage()!=null) {
				tBuilder.append("["+source.getLanguage().getName()+"] ");
			}
			if (source instanceof TextSource) {
				tBuilder.append(((TextSource) source).getText());
			} else {
				tBuilder.append("...");
			}
			return tBuilder.toString();
		}
		
		return labelProvider.getText(source);
	}
	
	private void addRow(Source source, int idx) {
		TableItem row = idx==-1 ? new TableItem(conditionsTable, SWT.BORDER) : new TableItem(conditionsTable, SWT.BORDER, idx);
		
		final TableEditor previewEditor = new TableEditor(conditionsTable);
		final Text previewText = new Text(conditionsTable, SWT.BORDER);
		
		previewText.setText(sourceLabel(source));
		previewText.setEditable(false);
		previewEditor.grabHorizontal = true;
		previewEditor.setEditor(previewText, row, 0);
		
		final TableEditor sourceButtonEditor = new TableEditor(conditionsTable);
		final Button sourceEditButton = new Button(conditionsTable, SWT.PUSH | SWT.CENTER);
		sourceEditButton.setText("...");
		sourceEditButton.pack();
		sourceEditButton.setData(source);
		sourceEditButton.addSelectionListener(new SelectionAdapter() {
			
		@Override
			public void widgetSelected(SelectionEvent e) {			
				SourceDialog d = new SourceDialog(
						getShell(),
						"Handler",
						(Source) sourceEditButton.getData(),
						adapterFactory, 
						completionProviderFactory);
				if (d.open()==Window.OK) {
					Source newValue = d.getValue();
					sourceEditButton.setData(newValue);
					previewText.setText(sourceLabel(newValue));
				}
			}
			
		});
		
		sourceButtonEditor.minimumWidth = sourceEditButton.getSize().x;
		sourceButtonEditor.setEditor(sourceEditButton, row, 1);				
		
		row.addDisposeListener(new DisposeListener() {
			
			@Override
			public void widgetDisposed(DisposeEvent e) {
				previewEditor.dispose();
				previewText.dispose();
				
				sourceButtonEditor.dispose();
				sourceEditButton.dispose();
				
				Iterator<TableEditor[]> rit = tableEditors.iterator();
				while (rit.hasNext()) {
					TableEditor[] r = rit.next();
					if (r[0] == previewEditor) {
						rit.remove();
						break;
					}
				}
				
			}
		});
		
		tableEditors.add(new TableEditor[] {previewEditor, sourceButtonEditor});
	}
	
	private TableEditor[] itemEditors(TableItem item) {
		for (TableEditor[] te: tableEditors) {
			if (te[0].getItem()==item) {
				return te;
			}
		}		
		return null;
	}
	
	public List<JoinEntry> getValue() {
		ret.clear();
		JoinEntry je = JsFactory.eINSTANCE.createJoinEntry();
		je.setPort("");
		for (TableEditor[] te: tableEditors) {
			je.getConditions().add((Source) te[1].getEditor().getData());
		}
		ret.add(je);
		return ret;
	}
	
}
