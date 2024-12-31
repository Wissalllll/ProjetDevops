package com.ghulam.ui;

import com.ghulam.bo.ProductBO;
import com.ghulam.util.Factory;
import com.ghulam.util.TakeInput;

public class EBooks implements UICategory {
	@Override
	public void category() {
		String categories[] = { "Romans", "Livres de fiction", "Livres éléctroniques" };
		Factory.getStyle().printMenu("Livres", categories, false);
		int choice = TakeInput.takeChoice(categories.length);
		ProductBO productBO = Factory.getProductBO();
		switch (choice) {
		case 1:
			UI.printSubCategory(productBO.getNovelBooks(), "Romans");
			break;
		case 2:
			UI.printSubCategory(productBO.getFictionBooks(), "Livres de fiction");
			break;
		case 3:
			UI.printSubCategory(productBO.getEBooks(), "Livres éléctroniques");
			break;
		}
	}
}