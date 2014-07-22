package org.nasdanika.amur.it.js.lang.impl;

import java.io.File;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.nasdanika.amur.it.js.lang.HTML;
import org.nasdanika.amur.it.js.lang.JavaScript;
import org.nasdanika.amur.it.js.lang.Text;
import org.nasdanika.common.HtmlRenderer;
import org.nasdanika.common.ImageManager;

import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.TextSource;

public class TextSourceHtmlRenderer implements HtmlRenderer<TextSource> {

	@Override
	public String renderHtml(
			TextSource obj, 
			File resourceContainer,
			ImageManager imageManager, 
			AdapterFactory adapterFactory,
			Map<Object, Object> context)
			throws Exception {
		if (obj.isBlank()) {
			return "";
		}
		StringBuilder sb = new StringBuilder("<table width='100%' class='standard' border='0' cellspacing='1' cellpadding='3'>");
		if (obj.getLanguage()!=null) {
			sb.append("<tr class='standard'><th colspan='2' class='standard'>");
			sb.append(genLangLabel(obj.getLanguage(), adapterFactory, imageManager));
			sb.append("</th></tr>");
		}
		if (obj.getText()!=null && obj.getText().trim().length()>0) {
			sb.append("<tr class='standard'><td colspan='2' class='standard'>");
			if (obj.getLanguage() instanceof HTML) {
		    	String markup = obj.getText();
		    	String rl = markup.toLowerCase();
		    	int boidx = rl.indexOf("<body>");
		    	if (boidx==-1) {
		    		return markup;
		    	}
		    	int bcidx = rl.lastIndexOf("</body>");
		    	if (bcidx>boidx) {
		    		sb.append(markup.substring(boidx+"<body>".length(), bcidx));
		    	} else {
		    		sb.append(markup);
		    	}				
			} else {
				sb.append("<pre>");
				sb.append(StringEscapeUtils.escapeHtml4(obj.getText()));				
				sb.append("</pre>");
			}
			sb.append("</td></tr>");			
		}
		sb.append("</table>");
		return sb.toString();
	}
	
    private String genLangLabel(Language<?> lang, AdapterFactory adapterFactory, ImageManager imageManager) throws Exception {
    	if (adapterFactory!=null) {
    		Object adapter = adapterFactory.adapt(lang, IItemLabelProvider.class);
    		if (adapter instanceof IItemLabelProvider) {
    			Object imageObject = ((IItemLabelProvider) adapter).getImage(lang);
    	    	StringBuilder sb = new StringBuilder();
    			if (imageObject!=null) {
    				String imagePath = imageManager.saveImage(imageObject, lang.eClass().getName());
    				if (imagePath!=null) {
	    				sb.append("<img src=\""+imagePath+"\" border=\"0\"> ");
    				}
    			}
    			
    			String text = ((IItemLabelProvider) adapter).getText(lang);
    			if (text==null) {
    				text = lang.getName();
    			}
    			
    			if (text!=null) {
    				sb.append(StringEscapeUtils.escapeHtml4(text));
    			}
    			
    			return sb.toString();
    		}
    	} 
    	return lang.getName()==null ? "" : StringEscapeUtils.escapeHtml4(lang.getName());
    }    
	

	@Override
	public boolean accept(TextSource candidate) {
		return candidate.getLanguage() instanceof HTML || candidate.getLanguage() instanceof JavaScript || candidate.getLanguage() instanceof Text;
	}

	@Override
	public Class<TextSource> getRendereeType() {
		return TextSource.class;
	}
	
	@Override
	public int compareTo(HtmlRenderer<TextSource> o) {
		return equals(o) ? 0 : 1; // Least specific.
	}

}
