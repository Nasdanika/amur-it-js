package org.nasdanika.amur.it.js.provider.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nasdanika.amur.it.js.Parameter;

import org.nasdanika.common.Activator;

public class ParametersDialog extends org.eclipse.jface.dialogs.Dialog {

	private String title;
	private ParametersComposite parametersComposite;
	private EList<Parameter> value;
	
	public ParametersDialog(
			Shell parentShell, 
			String title, 
			EList<Parameter> value) {
		super(parentShell);		
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.value = value;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		parent.getShell().setImage(Activator.getImageDescriptor("icons/params.png").createImage());
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		parametersComposite = new ParametersComposite(root, SWT.NULL, value);
		root.layout();
		return root;
	}
	
	public EList<Parameter> getValue() {
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
			value = parametersComposite.getValue();
		}
		super.buttonPressed(buttonId);
	}
	
}
