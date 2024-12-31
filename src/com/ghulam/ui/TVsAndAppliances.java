package com.ghulam.ui;

import com.ghulam.bo.ProductBO;
import com.ghulam.util.Factory;
import com.ghulam.util.TakeInput;

public class TVsAndAppliances implements UICategory {
	@Override
	public void category() {
		String categories[] = { "Télévision", "Machines à laver", "Réfrigérateurs", "Climatiseurs", "Micro-ondes" };
		Factory.getStyle().printMenu("HOME APPLIANCES", categories, false);
		int choice = TakeInput.takeChoice(categories.length);
		ProductBO productBO = Factory.getProductBO();
		switch (choice) {
		case 1:
			UI.printSubCategory(productBO.getTvs(), "Television");
			break;
		case 2:
			UI.printSubCategory(productBO.getwMachines(), "Machines à laver");
			break;
		case 3:
			UI.printSubCategory(productBO.getRefrigerator(), "Réfrigérateurs");
			break;
		case 4:
			UI.printSubCategory(productBO.getAirConditioner(), "Climatiseurs");
			break;
		case 5:
			UI.printSubCategory(productBO.getMicrowaves(), "Micro-ondes");
			break;
		}
	}
}
