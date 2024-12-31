package com.ghulam.ui;

import com.ghulam.bo.ProductBO;
import com.ghulam.util.Factory;
import com.ghulam.util.TakeInput;

public class Electronics implements UICategory {

	@Override
	public void category() {
		String categories[] = { "Ordinateurs portables", "Mobiles", "Écouteurs", "Camera" };
		Factory.getStyle().printMenu("ELECTRONICS", categories, false);
		int choice = TakeInput.takeChoice(categories.length);
		ProductBO productBO = Factory.getProductBO();
		switch (choice) {
		case 1:
			UI.printSubCategory(productBO.getLaptops(), "Ordinateurs portables");
			break;
		case 2:
			UI.printSubCategory(productBO.getMobiles(), "Mobiles");
			break;
		case 3:
			UI.printSubCategory(productBO.getHeadphones(), "Écouteurs");
			break;
		case 4:
			UI.printSubCategory(productBO.getCamera(), "Caméra");
			break;
		}
	}
}
