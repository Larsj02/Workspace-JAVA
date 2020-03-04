package PMenue;

import java.util.Scanner;

public class CMenue {
	
	static int eingabe,wiederholung,i;
	static String text;
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Eingabe();
	}

	private static void Eingabe() {
		do {
			System.out.println("Was wollen sie machen?");
			System.out.println("");
			System.out.println("[1] Text eingeben.");
			System.out.println("[2] Anzahl der Wiederholungen eingeben.");
			System.out.println("[3] Text Wiederholt Ausgeben.");
			System.out.println("");
			System.out.println("[0] Beenden.");
			System.out.println("Ihre Eingabe:");
			
			eingabe = scan.nextInt();
			
			switch (eingabe) {
			case 1:
				TextEingabe();
				break;
			case 2:
				WiederholungsEingabe();
				break;
			case 3:
				TextAusgabe();
				break;
			case 0:
				
				break;
			}
		}while(eingabe != 0);
	}

	private static void TextAusgabe() {
		do {
			i++;
			System.out.println(text);
		} while (wiederholung > i);
	}

	private static void WiederholungsEingabe() {
		System.out.println("Momentan liegt die Wiederholung bei: "+wiederholung);
		System.out.println("Bitte geben sie eine Zahl ein:");
		
		wiederholung = scan.nextInt();
	}

	private static void TextEingabe() {
		if(text != null) {
			System.out.println("Ihr momentaner Text ist: '"+text+"'");
			System.out.println("Bitte geben sie einen Text ein:");
		}else {
			System.out.println("Sie haben momentan noch keinen Text eingegeben");
			System.out.println("Bitte geben sie einen Text ein:");
		}
		text = scan.next();
	}

}
