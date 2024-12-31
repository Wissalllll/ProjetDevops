package com.ghulam.ui;

public class UIFactory {
	public static UICategory getUI(String s) {
		if (s.equalsIgnoreCase("Électroniques")) {
			return new Electronics();
		} else if (s.equalsIgnoreCase("TVs & électroménagers")) {
			return new TVsAndAppliances();
		} else if (s.equalsIgnoreCase("Hommes")) {
			return new Men();
		} else if (s.equalsIgnoreCase("Femmes")) {
			return new Women();
		} else if (s.equalsIgnoreCase("Livres")) {
			return new EBooks();
		}
		return null;
	}
}
