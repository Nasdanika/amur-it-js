/**
 */
package org.nasdanika.amur.it.js.lang.impl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.AstRoot;
import org.nasdanika.amur.it.js.lang.JavaScript;
import org.nasdanika.amur.it.js.lang.LangPackage;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.impl.TextualFilerLanguageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaScriptImpl extends TextualFilerLanguageImpl implements JavaScript {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JavaScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.JAVA_SCRIPT;
	}
	
	@Override
	public EList<String> mimeTypes() {
		return ECollections.singletonEList("text/javascript");
	}
	
	@Override
	public String defaultExtension() {
		return ".js";
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostic, TextSource source, Map<Object, Object> context) {
		if (diagnostic!=null && source!=null && source.getText()!=null && source.getText().trim().length()>0) {
			try {
				Parser parser = new Parser();
				String sourceName = "snippet";
				if (source.eContainingFeature()!=null) {
					sourceName = source.eContainingFeature().getName();
				}
				String src = source.getText();
				CodeType codeType = (CodeType) context.get(CodeType.class);
				if (codeType==null) {
					codeType= CodeType.FUNCTION_BODY;
				}
				if (CodeType.FUNCTION_BODY.equals(codeType)) {
					src = "(function() { "+src+" })"; // To suppress complains about return.
				}
				parser.parse(src, sourceName, 1);
			} catch (Exception e) {
//				e.printStackTrace();
				
				diagnostic.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 JavaScript.class.getName(),
					 0,
					 e.toString(),
					 new Object [] { source }));
								
				return false;
			}
			
		}
		return super.validate(diagnostic, source, context);
	}
	
	@Override
	public boolean isBlank(TextSource source) {
		if (super.isBlank(source)) {
			return true;
		}
		
		try {
			Parser parser = new Parser();
			AstRoot rootAst = parser.parse(source.getText(), "snippet", 1);
			return !rootAst.hasChildren();
		} catch (Exception e) {
//			System.err.println("Source: "+source.getText());
//			e.printStackTrace();
			return false; // There is something which throws and error -> not blank.
		}
	}		

	@Override
	public IFigure getTooltip(Source source) {
		String text = ((TextSource) source).getText();
		if (text!=null && text.trim().length()>0) {
			try {
				BufferedImage bi = new BufferedImage(300, 200, BufferedImage.TYPE_INT_ARGB);
				java.awt.Graphics gr = bi.getGraphics();
				
//				JPanel cp = new JPanel(new BorderLayout());
//
//				RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
//				textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
//				textArea.setCodeFoldingEnabled(true);
//				textArea.setAntiAliasingEnabled(true);
//				RTextScrollPane sp = new RTextScrollPane(textArea);
//				sp.setFoldIndicatorEnabled(true);
//				cp.add(sp);
//				cp.setSize(300, 200);
//				textArea.paint(gr);
				
				JEditorPane htmlPane = new JEditorPane("text", text);
				htmlPane.setSize(300, 200);
				java.awt.Color transparent = new java.awt.Color(0, 0, 0, 0);
				htmlPane.setBackground(transparent);
				htmlPane.setEditable(false);
				htmlPane.paint(gr);
				
				// ---
//				FileOutputStream fos = new FileOutputStream("C:\\_temp\\tooltip.png");
//				ImageIO.write(bi, "PNG", fos);
//				fos.close();
				// ---
				
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(bi, "PNG", baos);
				baos.close();
				final byte[] imageData = baos.toByteArray();
				return new ImageFigure(new Image(Display.getCurrent(), new ByteArrayInputStream(imageData)));			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
} //JavaScriptImpl
