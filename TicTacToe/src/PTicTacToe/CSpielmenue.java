package PTicTacToe;

import java.util.Scanner;

public class CSpielmenue {
	
	static Scanner scan = new Scanner(System.in);
	static int auswahl;
	
	static boolean loop = true;
	
	public static void main(String[] args) {
		while (loop == true) {
			menueauswahl();
		}
	}

	private static void menueauswahl() {
		System.out.println("Was möchten Sie Spielen?");
		System.out.println("");
		System.out.println("[1] Spieler1 gegen Spieler2");
		System.out.println("[2] Sie gegen den Computer");
		System.out.println("");
		System.out.println("[3] Beenden");
		
		auswahl = scan.nextInt();
		
		switch (auswahl) {
		case 1:
			CP1vsP2.main(null);
			break;
		case 2:
			CP1vsP2.main(null);
			break;
		case 3:
			loop = false;
			break;
		default:
			break;
		}
	}

}
