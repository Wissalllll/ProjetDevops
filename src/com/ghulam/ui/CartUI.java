package com.ghulam.ui;

import com.ghulam.bo.CartBO;
import com.ghulam.util.Factory;
import com.ghulam.util.Style;
import com.ghulam.util.TakeInput;

public class CartUI {
	private CartBO cartBO;
	private Style style;

	public CartUI() {
		cartBO = Factory.getCartBO();
		style = Factory.getStyle();
	}

	public void viewCart() {
		if (cartBO.isEmpty()) {
			System.out.println("   \u2716 La carte est vide");
		} else {
			cartBO.display();
			System.out.println();
			String option = TakeInput.takeString("Voulez vous modifiez la quantité? Y/N : ", "[YNyn]", "option",
					true);
			if (option.equalsIgnoreCase("Y")) {
				modify();
			}
		}
	}

	private void modify() {
		int index = TakeInput.takeInt(cartBO.getNextId() - 1, "Entrez le  SI.No du produit pour modifier la quantité : ",
				"Invalid SI.No", "SI.No");
		int quantity = TakeInput.takeInt(0, "Entrez la nouvelle quantité : ", "", "");
		cartBO.changeQuantity(index, quantity);
		style.successMsg("Changer avec succés");
	}

	public void removeCart() {
		if (cartBO.isEmpty()) {
			System.out.println("   \u2716 La carte est vide");
		} else {
			cartBO.display();
			System.out.println();
			String option = TakeInput.takeString("Voulez-vous supprimer la plage? Y/N : ", "[YNyn]", "option", true);
			if (Character.toUpperCase(option.charAt(0)) == 'Y') {
				int[] range = TakeInput.takeRange(cartBO.getNextId() - 1);
				cartBO.removeRange(range[0], range[1]);
			} else {
				int s = TakeInput.takeInt(cartBO.getNextId() - 1, "Entrez le SI.No pour supprime l`article : ",
						"Invalide SI.No", "SI.No");
				cartBO.remove(s);
			}
			style.successMsg("Supprimer avec succés");
		}
	}

	public void viewBill() {
		if (cartBO.isEmpty()) {
			System.out.println("   \u2716 La carte est vide");
		} else {
			style.printName(Factory.getShopName());
			style.printDateAndTime();
			cartBO.displayBill();
		}
		style.thanksMsg();
	}
}
