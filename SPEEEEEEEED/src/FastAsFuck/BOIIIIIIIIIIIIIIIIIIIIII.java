package FastAsFuck;

import java.util.Scanner;

/*
 * Name: Lars Johnen
 * Datum: 19.02.2020
 * Zweck: Speedprogramming
 */

public class BOIIIIIIIIIIIIIIIIIIIIII {
	static int zahl, i = 0, auswahl;
	static String name = "";

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("╔════════════════════════╗");
			System.out.println("║ [1] Eingabe            ║");
			System.out.println("║ [2] Ausgabe for        ║");
			System.out.println("║ [3] Ausgabe while      ║");
			System.out.println("║ [4] Ausgabe do while   ║");
			System.out.println("║ [0] Ende               ║");
			System.out.println("╚════════════════════════╝");
			auswahl = scan.nextInt();
			clear();

			switch (auswahl) {
			case 1:
				Eingabe();
				break;
			case 2:
				Ausgabe1();
				break;
			case 3:
				Ausgabe2();
				break;
			case 4:
				Ausgabe3();
				break;

			default:
				break;
			}
		} while (auswahl != 0);
	}

	private static void clear() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}

	private static void Ausgabe3() {
		i = 1;
		do {
			System.out.println(i +" "+ name);
			i++;
		} while (i <= zahl);
	}

	private static void Ausgabe2() {
		i = 1;
		while (i <= zahl) {
			System.out.println(i +" "+ name);
			i++;
		}
	}

	private static void Ausgabe1() {
		for (int i = 1; i <= zahl; i++) {
			System.out.println(i +" "+ name);
		}
	}

	private static void Eingabe() {
		System.out.println("Geben sie einen Namen ein:");
		name = scan.next();

		do {
			System.out.println("Geben sie eine Zahl ein (1-15):");
			zahl = scan.nextInt();
		} while (zahl > 15 || zahl < 1);

	}
}
