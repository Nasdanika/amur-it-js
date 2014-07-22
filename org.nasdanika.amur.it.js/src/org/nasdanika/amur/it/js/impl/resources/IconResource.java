package org.nasdanika.amur.it.js.impl.resources;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public enum IconResource {
	
	Call("Call.gif"),
	Dispatch(null),
	Event("events.png"),
	Function("function.png"),
	Parameter("params.png"),
	Publish(null),
	Reference("Reference.gif"),
	Right("arrow_right.png"),
	ScheduledTransition("ScheduledTransition.gif"),
	Target("Target.png"),
	Transition("Transition.gif"),
	Up("up.png"),
	Variable("var.png");
	
	private String iconName;
	
	private Icon icon;

	IconResource(String iconName) {
		this.iconName = iconName;
	}
	
	public Icon getIcon() {
		if (icon==null) {
			if (iconName!=null) {
				Bundle bundle = Platform.getBundle("org.nasdanika.amur.it.js");
				if (bundle==null) {
					System.err.println("[WARNING] Bundle not found: org.nasdanika.amur.it.js");
				} else {					
					URL iRes = bundle.getResource("icons/"+iconName);
					if (iRes==null) {
						System.err.println("[WARNING] Icon resource does not exist: "+iconName);
					} else {
						icon = new ImageIcon(iRes);				
					}
				}
			}			
		}
		return icon;
	}

}
