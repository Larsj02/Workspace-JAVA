package PDoWhile;

import java.util.Scanner;

public class CDoWhile {
	static Scanner scan = new Scanner(System.in);
	static int z, auswahl, anzahl, AZ, EZ, schritte;
	static String name;
	static boolean wiederholung = true;

	public static void main(String[] args) {
		while (wiederholung == true) {
			auswahl();
		}
	}

	private static void auswahl() {
		z = 0;
		System.out.println("Wollen Sie:");
		System.out.println("╔[1] Ausgabe");
		System.out.println("╠[2] Texteingabe");
		System.out.println("╠[3] Anfangs Zahl");
		System.out.println("╠[4] End Zahl");
		System.out.println("║");
		System.out.println("╚[0] Ende");
		auswahl = scan.nextInt();
		switch (auswahl) {
		case 1:
			Ausgabe();
			break;
		case 2:
			Texteingabe();
			break;
		case 3:
			anfangszahl();
			break;
		case 4:
			endzahl();
			break;
		case 0:
			wiederholung = false;
			break;

		default:
			break;
		}
	}

	private static void anfangszahl() {
		schritte = EZ - AZ;
		System.out.println("Ihre momentane Anfangszahl ist = " + AZ + " (" + schritte + " Schritte Bis " + EZ + ")");
		System.out.println("Von wo wollen Sie anfangen zu zählen");
		AZ = scan.nextInt();
	}

	private static void endzahl() {
		schritte = EZ - AZ;
		System.out.println("Ihre momentane Endzahl ist = " + EZ + " (" + schritte + " Schritte Bis " + AZ + ")");
		System.out.println("Bis wo hin wollen Sie zählen?");
		EZ = scan.nextInt();
	}

	private static void Texteingabe() {
		System.out.println("Ihr momentaner Text ist : " + name);
		System.out.println("Welchen Text Wollen Sie ausgeben?");
		name = scan.next();
	}

	private static void Ausgabe() {
		System.out.println("");
		System.out.println("TEXT:");
		if (name == null) {
			System.out.println("Geben sie zuerst einen Text ein!");
		} else {
			z = AZ;
			do {
				z++;
				System.out.println(name);
			} while (z < EZ);
		}
		System.out.println("");
		System.out.println("");
	}

}
