/*
 * Name: Lars Johnen
 * Klasse: 19IT2
 * Datum: 13.11.2019
 * Zweck: addierung und multiplikation von 2 eingegeben Zahlen
 */

package PSp_P;

import java.util.Scanner;

public class CSp {

	static Scanner scan = new Scanner(System.in);
	static int Z1, Z2, Z3, auswahl;

	public static void main(String[] args) {
		auswahl(); //geht zu "auswahl" Z.21-45
	}

	private static void auswahl() {
		System.out.println("Möchten Sie");		//Konsolen Ausgabe
		System.out.println("[1] + Berechnung");	//Zeigt eine Auswahl
		System.out.println("[2] - Berechnung");	//Was der  User machen
		System.out.println("");					//
		System.out.println("Ihre Eingabe:");	//<-Damit der User weiß dass er was schreiben soll
		auswahl = scan.nextInt();				//Nimmt den nächsten Int als Auswahl
		
		switch (auswahl) {	//guckt was auswahl ist
		case 1:				//wenn auswahl = 1 ist wird das gemacht
			eingabe();
			berechnung();
			ausgabe();
			break;			//bis hier
		case 2:				//wenn auswahl = 2 ist wird das gemacht
			eingabe2();
			berechnung2();
			ausgabe2();
			break;			//bis hier

		default:			//ansonsten wird nichts gemacht (auswahl != 1 oder 2)
			break;
		}

	}

	private static void eingabe2() {//Zahlen eingabe für subtraktion
		System.out.println("Zahl 1 angeben:");	
		Z1 = scan.nextInt();

		System.out.println("Zahl 2 angeben:");
		Z2 = scan.nextInt();

		scan.close();
	}

	private static void berechnung2() {//rechnet die Subtraktion
		Z3 = Z1 - Z2;

	}

	private static void ausgabe2() {//Gibt das ergebnis der Subtraktion aus
		System.out.println("Das Ergebnis von " + Z1 + " - " + Z2 + " ist " + Z3);

	}

	private static void eingabe() {//Zahlen eingabe für addition
		System.out.println("Zahl 1 angeben:");
		Z1 = scan.nextInt();

		System.out.println("Zahl 2 angeben:");
		Z2 = scan.nextInt();

		scan.close();
	}

	private static void berechnung() {//rechnet die addition
		Z3 = Z1 + Z2;

	}

	private static void ausgabe() {//Gibt das ergebnis der addition aus
		System.out.println("Das Ergebnis von " + Z1 + " + " + Z2 + " ist " + Z3);

	}

}
