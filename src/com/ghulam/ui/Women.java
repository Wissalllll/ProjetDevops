package com.ghulam.ui;

import com.ghulam.bo.ProductBO;
import com.ghulam.util.Factory;
import com.ghulam.util.TakeInput;

public class Women implements UICategory {

	@Override
	public void category() {
		String categories[] = { "Caftan ", "Robes", "Vêtements de sport" };
		Factory.getStyle().printMenu("Femmes", categories, false);
		int choice = TakeInput.takeChoice(categories.length);
		ProductBO productBO = Factory.getProductBO();
		switch (choice) {
		case 1:
			UI.printSubCategory(productBO.getSareeList(), "Caftan");
			break;
		case 2:
			UI.printSubCategory(productBO.getKurtas(), "Robes");
			break;
		case 3:
			UI.printSubCategory(productBO.getLc(), "Vêtements de sport");
			break;
		}
	}
}
