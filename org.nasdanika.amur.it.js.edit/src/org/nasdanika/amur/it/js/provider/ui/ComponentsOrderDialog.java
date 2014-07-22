package org.nasdanika.amur.it.js.provider.ui;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import org.nasdanika.amur.Component;
import org.nasdanika.common.Activator;

public class ComponentsOrderDialog extends org.eclipse.jface.dialogs.Dialog {

	private String title;
	private ComponentsOrderComposite componentsOrderComposite;
	private EList<Component> value;
	private boolean inboundConnections;
	private List<Component> allComponents;
	private AdapterFactory adapterFactory;
	
	public ComponentsOrderDialog(
			Shell parentShell, 
			String title, 
			EList<Component> value,
			List<Component> allComponents,
			AdapterFactory adapterFactory,			
			boolean inboundConnections) {
		super(parentShell);		
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.value = value;
		this.allComponents = allComponents;
		this.adapterFactory = adapterFactory;
		this.inboundConnections = inboundConnections;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		parent.getShell().setImage(Activator.getImageDescriptor("icons/fugue/icons/edit-list-order.png").createImage());
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		componentsOrderComposite = new ComponentsOrderComposite(root, SWT.NULL, value, allComponents, adapterFactory, inboundConnections);
		root.layout();
		return root;
	}
	
	public EList<Component> getValue() {
		return value;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title!=null) {
			newShell.setText(title);
		}
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId==IDialogConstants.OK_ID) {
			value = componentsOrderComposite.getValue();
		}
		super.buttonPressed(buttonId);
	}
	
}
