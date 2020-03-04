package PNotendurchsnitt;
/*
 * Name: LARS JOHNEN
 * Klasse: 19IT2
 * Datum: 08.11.2019
 * Zweck: zum rechnen des Notendurchschnitt
 */
import java.util.Scanner;

public class CNotendurchsnitt {
	static Scanner scan = new Scanner(System.in);
	static int N1, N2, N3, N4, N5;
	static float S;

	static int auswahl;
	static boolean wiederholung = true;

	public static void main(String[] args) {
		while (wiederholung = true) {
			Eingabe();
		}
	}

	private static void Verarbeitung() {
		switch (auswahl) {
		case 1:
			Noteneingabe();
			break;

		case 2:
			Notenausgabe();
			break;

		case 3:
			Rechnung();
			Ausgabe();
			break;

		default:
			break;
		}

	}

	private static void Notenausgabe() {
		clearconsole();
		System.out.println("1. Note = " + N1);
		System.out.println("1. Note = " + N2);
		System.out.println("1. Note = " + N3);
		System.out.println("1. Note = " + N4);
		System.out.println("1. Note = " + N5);
	}

	private static void Noteneingabe() {
		clearconsole();

		System.out.println("1. Note eingeben");
		N1 = scan.nextInt();

		System.out.println("2. Note eingeben");
		N2 = scan.nextInt();

		System.out.println("3. Note eingeben");
		N3 = scan.nextInt();

		System.out.println("4. Note eingeben");
		N4 = scan.nextInt();

		System.out.println("5. Note eingeben");
		N5 = scan.nextInt();

		clearconsole();
	}

	private static void clearconsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}

	private static void Eingabe() {
		System.out.println("Wählen sie eine Auswahl");
		System.out.println("[1] Noten eingabe");
		System.out.println("[2] Noten ausgabe");
		System.out.println("[3] Durchschnitt ausgeben");
		auswahl = scan.nextInt();
		Verarbeitung();
	}

	private static void Rechnung() {
		S = N1 + N2 + N3 + N4 + N5;
		S = S / 5;

	}

	private static void Ausgabe() {
		// Aufgabe 1/2
		/*
		 * if(S > 4.5) { System.out.println("Diese Arbeit muss genehmigt werden!");
		 * }else { System.out.println("Der Notendurchschnitt beträgt: "+S); }
		 */
		clearconsole();
		// Aufgabe 3
		if (1 <= S && S < 1.5) {
			System.out.println("Der Notendurchschnitt ist sehr gut!" + S);
		} else if (1.5 <= S && S < 2.5) {
			System.out.println("Der Notendurchschnitt ist gut!" + S);
		} else if (2.5 <= S && S < 3.5) {
			System.out.println("Der Notendurchschnitt ist befriedigend!" + S);
		} else if (3.5 <= S && S < 4.5) {
			System.out.println("Der Notendurchschnitt ist ausreichend!" + S);
		} else if (4.5 <= S && S < 5.5) {
			System.out.println("Der Notendurchschnitt ist mangelhaft!" + S);
		} else if (5.5 <= S && S < 6) {
			System.out.println("Der Notendurchschnitt ist ungenügend!" + S);
		}

	}
}
