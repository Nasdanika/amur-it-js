/**
 */
package org.nasdanika.amur.it.js.lang.impl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.nasdanika.amur.it.js.lang.HTML;
import org.nasdanika.amur.it.js.lang.LangPackage;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.impl.TextualFilerLanguageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HTMLImpl extends TextualFilerLanguageImpl implements HTML {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HTMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.HTML;
	}

	@Override
	public EList<String> mimeTypes() {
		return ECollections.singletonEList("text/html");
	}
	
	@Override
	public String defaultExtension() {
		return ".html";		
	}

	@Override
	public IFigure getTooltip(Source source) {
		String text = ((TextSource) source).getText();
		if (text!=null && text.trim().length()>0) {
			try {
				BufferedImage bi = new BufferedImage(300, 200, BufferedImage.TYPE_INT_ARGB);
				java.awt.Graphics gr = bi.getGraphics();
				JEditorPane htmlPane = new JEditorPane("text/html", text);
				htmlPane.setSize(300, 200);
				java.awt.Color transparent = new java.awt.Color(0, 0, 0, 0);
				htmlPane.setBackground(transparent);
				htmlPane.setEditable(false);
				htmlPane.paint(gr);
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
	
} //HTMLImpl
