package PGrammprüfung;

import java.util.Scanner;

public class CGrammprüfung {
	static double gramm, durchlauf;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
				"Ihre gewongene Zahl sollte einen Wert innerhalb 50-55g haben ansonnsten ist das Stück nach maximal 3 Versuchen ungültig!");
		while (durchlauf < 3) {
			System.out.println("Gebe sie eine Gramm Zahl ein:");
			gramm = scan.nextDouble();

			if (gramm < 50 || gramm > 55) {
				durchlauf++;
				if (durchlauf != 3) {
					System.out.println("Bitte erneut eingeben " + gramm + "g sind zu viel/wenig!");
				}
			} else {
				durchlauf = 3;
				System.out.println("Perfect!");
			}
		}
		if (gramm < 50 || gramm > 55) {
			System.out.println("Okay Boomer Du hast es nicht geschafft in 3 Versuchen eine richtige Zahl einzugeben!");
		}
	}

}
