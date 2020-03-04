package PMAIN;

import java.util.Scanner;

public class CMAIN {

	static Scanner scan = new Scanner(System.in);
	static char auswahl;
	static float erg, zahl1, zahl2;

	public static void main(String[] args) {
		do {
			Menue();
		} while (auswahl != 0 || auswahl !='e');
	}

	private static void Menue() {
		System.out.println("Was möchten Sie Rechnen?");
		System.out.println("[+] Addieren");
		System.out.println("[-] Subtrahieren");
		System.out.println("[*] Multiplizieren");
		System.out.println("[/] Dividieren");
		System.out.println("[0] Beenden");
		System.out.println("eingabe:");

		do {
			auswahl = scan.next().charAt(0);
		} while (auswahl != '+' ||auswahl != '-' ||auswahl != '*' ||auswahl != '/' || auswahl != 0 || auswahl !='e');

		Eingabe();
		switch (auswahl) {
		case '+':
			erg = Plus(zahl1, zahl2);
			break;
		case '-':
			erg = Minus(zahl1, zahl2);
			break;
		case '*':
			erg = Mal(zahl1, zahl2);
			break;
		case '/':
			erg = Geteilt(zahl1, zahl2);
			break;

		default:
			break;
		}
		Ausgabe();
	}

	private static void Ausgabe() {
		clear();
		System.out.println("Das Ergebnis ist: " + erg);
	}

	private static void Eingabe() {
		System.out.println("Bitte geben sie Die erste Zahl ein:");
		zahl1 = scan.nextFloat();
		System.out.println("Bitte geben sie Die zweite Zahl ein:");
		zahl2 = scan.nextFloat();
	}

	private static float Plus(float z1, float z2) {
		return z1 + z2;
	}

	private static float Minus(float z1, float z2) {
		return z1 - z2;
	}

	private static float Mal(float z1, float z2) {
		return z1 * z2;
	}

	private static float Geteilt(float z1, float z2) {
		return z1 / z2;
	}

	private static void clear() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}

}
