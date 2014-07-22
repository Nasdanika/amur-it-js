package org.nasdanika.amur.it.js.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.nasdanika.amur.it.js.Cloning;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.common.Activator;
import org.nasdanika.common.HtmlRenderer;
import org.nasdanika.common.ImageManager;

@SuppressWarnings("rawtypes")
public class ParametersListHtmlRenderer implements HtmlRenderer<List> {

	@SuppressWarnings("unchecked")
	@Override
	public String renderHtml(
			List obj, 
			File resourceContainer,
			ImageManager imageManager, 
			AdapterFactory adapterFactory,
			Map<Object, Object> context) throws Exception {
		StringBuilder ret = new StringBuilder();
		ret.append("<table class='standard' cellspacing='1' cellpadding='3' border='0'>");
		ret.append("<tr class='standard'><th class='standard'>Name</td><th class='standard'>Clone</td><th class='standard'>Token</td><th class='standard'>Description</td></tr>");
		for (Parameter prm: (List<Parameter>) obj) {
			ret.append("<tr class='standard'>");
			
			ret.append("<td class='standard'>");
			ret.append(StringEscapeUtils.escapeHtml4(prm.getName()));
			ret.append("</td>");
			
			ret.append("<td class='standard' align='center'>");
			if (!Cloning.NONE.equals(prm.getCloning())) {
				ret.append(prm.getCloning());
			}
			ret.append("</td>");
			
			ret.append("<td class='standard' align='center'>");
			if (prm.isToken()) {
				ret.append("<img src='");
				ret.append(imageManager.saveImage(Activator.getImageDescriptor("icons/essen/16x16/check.png"), "check"));
				ret.append("'>");
			}
			ret.append("</td>");
			
			ret.append("<td class='standard'>");
			if (prm.getDescription()!=null) {
				ret.append(StringEscapeUtils.escapeHtml4(prm.getDescription()));
			}
			ret.append("</td>");
			
			ret.append("</tr>");
		}
		
		ret.append("</table>");
		return ret.toString();
	}

	@Override
	public boolean accept(List candidate) {
		return !candidate.isEmpty() && candidate.get(0) instanceof Parameter;
	}

	@Override
	public Class<List> getRendereeType() {
		return List.class;
	}

	@Override
	public int compareTo(HtmlRenderer<List> o) {
		return hashCode() - o.hashCode();
	}

}
