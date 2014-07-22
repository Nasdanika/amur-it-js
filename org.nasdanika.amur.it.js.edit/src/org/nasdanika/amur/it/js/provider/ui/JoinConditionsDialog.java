package org.nasdanika.amur.it.js.provider.ui;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nasdanika.amur.it.js.JoinEntry;

import org.nasdanika.common.Activator;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class JoinConditionsDialog extends org.eclipse.jface.dialogs.Dialog {

	private String title;
	private JoinConditionsComposite joinConditionsComposite;
	private List<JoinEntry> value;
	private AdapterFactory adapterFactory;
	private CompletionProviderFactory completionProviderFactory;
	
	public JoinConditionsDialog(
			Shell parentShell, 
			String title, 
			AdapterFactory adapterFactory,
			CompletionProviderFactory completionProviderFactory,
			List<JoinEntry> value) {
		super(parentShell);		
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.adapterFactory = adapterFactory;
		this.completionProviderFactory = completionProviderFactory;
		this.value = value;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		parent.getShell().setImage(Activator.getImageDescriptor("icons/led/funnel.png").createImage());
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		joinConditionsComposite = new JoinConditionsComposite(root, SWT.NULL, adapterFactory, completionProviderFactory, value);
		root.layout();
		return root;
	}
	
	public List<JoinEntry> getValue() {
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
			value = joinConditionsComposite.getValue();
		}
		super.buttonPressed(buttonId);
	}
	
}
