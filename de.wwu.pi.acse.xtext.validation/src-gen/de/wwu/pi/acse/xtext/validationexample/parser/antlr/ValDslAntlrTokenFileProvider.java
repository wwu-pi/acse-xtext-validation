/*
 * generated by Xtext 2.9.2
 */
package de.wwu.pi.acse.xtext.validationexample.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ValDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/wwu/pi/acse/xtext/validationexample/parser/antlr/internal/InternalValDsl.tokens");
	}
}
