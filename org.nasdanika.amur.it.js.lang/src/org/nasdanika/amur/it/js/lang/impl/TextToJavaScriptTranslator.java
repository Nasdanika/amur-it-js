package org.nasdanika.amur.it.js.lang.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.nasdanika.amur.it.js.lang.JavaScript;
import org.nasdanika.amur.it.js.lang.LangFactory;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.Translator;

/**
 * Escapes text to JavaScript string and returns it.
 * @author Pavel
 *
 */
public class TextToJavaScriptTranslator implements Translator {

	private static final Set<String> SUPPORTED_TARGET_LANGUAGES;
	
	static {
		Set<String> stl = new HashSet<>();
		stl.add("html");
		stl.add("text");
		SUPPORTED_TARGET_LANGUAGES = Collections.unmodifiableSet(stl);
	}

	public TextToJavaScriptTranslator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Source translate(
			Source source, 
			String targetLanguageId,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			Collection<Runnable> undoCollector) throws Exception {
		JavaScript js = LangFactory.eINSTANCE.createJavaScript();
		TextSource ret = js.createSource(null);
		ret.setText("return \""+StringEscapeUtils.escapeEcmaScript(((TextSource) source).getText())+"\";");
		return ret;
	}

	@Override
	public Set<String> supportedTargetLanguages() {
		return SUPPORTED_TARGET_LANGUAGES;
	}

}
