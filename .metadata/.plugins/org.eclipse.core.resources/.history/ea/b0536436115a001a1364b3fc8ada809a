package PQuersuhme;

import java.util.Scanner;

public class CKwersumme {

	static Scanner scan = new Scanner(System.in);
	static String eingabe;

	static boolean zahlprüfer = true;

	public static void main(String[] args) {
		do {
			do {
				try {
					System.out.println("");
					System.out.println("Geben sie eine Zahl zum rechnen der Quersumme ein:");
					eingabe = scan.next();
					Integer.valueOf(eingabe);
					zahlprüfer = true;
					clearconsole();
				} catch (Exception e) {
					zahlprüfer = false;
				}
			} while (zahlprüfer == false);
			System.out.println("Die Quersumme von " + eingabe + " ist:" + QSvonZ(eingabe));
		} while (true);
	}

	static int QSvonZ(String zahl) {
		int Summe = 0;
		for (int i = 0; i < zahl.length(); i++) {
			String teil = zahl.substring(zahl.length() - i - 1, zahl.length() - i);
			int teilZahl = Integer.valueOf(teil);
			Summe = Summe + teilZahl;
		}
		return Summe;
	}

	static void clearconsole() {
		for (int i = 0; i < 25; i++) {
			System.out.println("");
		}
	}

}
