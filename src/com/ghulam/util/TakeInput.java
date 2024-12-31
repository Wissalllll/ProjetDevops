package com.ghulam.util;

import java.util.Scanner;

import com.ghulam.ui.CartUI;

public class TakeInput {
	private static Scanner sc = new Scanner(System.in);

	public static String takeString(String msg, String regex, String errorMsg, boolean isStyle) {
		if (isStyle) {
			Factory.getStyle().printStyle(msg);
		} else {
			System.out.print(msg);
		}
		String s = sc.nextLine();
		while (!s.matches(regex)) {
			errorMsg = " 😞😞😞 DSL invalide !! \n\n   \u21AA SVP retaper " + errorMsg + " : ";
			if (isStyle) {
				Factory.getStyle().printStyle(errorMsg);
			} else {
				System.out.print(errorMsg);
			}
			s = sc.nextLine();
		}
		return s;
	}

	public static int takeInput(int length, String msg, String errorMsg, String forWhat) {
		System.out.println();
		Factory.getStyle().printStyle(msg);
		int choice = getInt(forWhat);
		while ((choice > length && choice != 9) || choice == 0) {
			if (choice == 0) {
				Factory.getStyle().printStyle("Voulez-vous facturer (Yes/No)?: ");
				if (Character.toUpperCase(sc.nextLine().charAt(0)) == 'Y') {
					new CartUI().viewBill();
				}
				System.exit(0);
			}
			printError(errorMsg, forWhat);
			choice = getInt(forWhat);
		}
		return choice;
	}

	public static int takeChoice(int length) {
		return takeInput(length, "Selectionnez un choix : ", "Choix invalide", "Votre choix ");
	}

	public static int takeInt(int length, String msg, String errorMsg, String forWhat) {
		System.out.println();
		Factory.getStyle().printStyle(msg);
		int n = getInt(forWhat);
		while (length != 0) {
			if (length >= n) {
				break;
			}
			printError(errorMsg, forWhat);
			n = getInt(forWhat);
		}
		return n;
	}

	public static int[] takeRange(int range) {
		Factory.getStyle().printStyle("Entrez le SI.No d`article à supprimer : ");
		int arr[] = { takeInt(range, "De :  ", "Invalide SI.No", "SI.No"),
				takeInt(range, "A : ", "Invalide SI.No", "SI.No") };
		return arr;
	}

	private static int getInt(String s) {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				printError("Tapez que des nombres", s);
			}
		}
	}

	private static void printError(String error, String forWhat) {
		System.out.print("\t😞😞😞 DSL \u2757\u2757\u2757 " + error + "\n\n   \u21AA Re-entrez " + forWhat + ": ");
	}
}