package com.github.gawkat.game.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Gawkat
 *
 */
public class Local {

	private static Locale locale;
	private static ResourceBundle ids;

	public static String get(String id) {
		return ids.getString(id);
	}

	public static void setLocale(String language, String region) {
		locale = new Locale(language, region);
		ids = ResourceBundle.getBundle("lang", locale);
	}

	// Default language is English, US variant.
	// Is overwritten if other language is selected.
	public static void initLocale() {
		setLocale("en", "US");
	}

}
