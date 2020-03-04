package PTicTacToe;

import java.util.Scanner;

public class CP1vsP2 {

	static String f1 = "F1";
	static String f2 = "F2";
	static String f3 = "F3";
	static String f4 = "F4";
	static String f5 = "F5";
	static String f6 = "F6";
	static String f7 = "F7";
	static String f8 = "F8";
	static String f9 = "F9";
	static String eingabenummer;
	static String spielerzeichen;
	static String letzter;

	static Scanner feldeingabe = new Scanner(System.in);

	static boolean loop = true;

	public static void main(String[] args) {
		while (loop == true) {
			eingabe();
		}
	}

	private static void eingabe() {
		if (CSpielmenue.auswahl == 1) {
			if (letzter == "x") {
				clearconsole();
				spielerzeichen = "o";
			} else {
				clearconsole();
				spielerzeichen = "x";
			}
			System.out.println("welches Feld wollen Sie setzten ? (" + spielerzeichen.toUpperCase() + ")");
			System.out.println("");
			System.out.println(f1 + "|" + f2 + "|" + f3);
			System.out.println(f4 + "|" + f5 + "|" + f6);
			System.out.println(f7 + "|" + f8 + "|" + f9);

			eingabenummer = feldeingabe.next().toLowerCase();
			CVerarbeitung.main(null);
			clearconsole();
			CGewinnersuche.main(null);
			letzter = spielerzeichen;
		}else if(CSpielmenue.auswahl == 2) {
			
		}
	}

	private static void clearconsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}

}
