package PCodeknacker;

import java.util.Date;
import java.util.Scanner;

public class CLarsbruteforce {

	static Scanner scan = new Scanner(System.in);
	static String Code;
	static StringBuilder string = new StringBuilder("");
	static int min = 32, max = 127,zähler;
	static Date anfang;

	public static void loop(int index) {
		for (int i = min; i < max; i++) {
			string.setCharAt(index, (char) i);
			if (index < string.length() - 1)
				loop(index + 1);
				zähler++;
			if (string.toString().equals(Code)) {
				long diff = new Date().getTime() - anfang.getTime();

				long diffSeconds = diff / 1000 % 60;
				long diffMinutes = diff / (60 * 1000) % 60;
				long diffHours = diff / (60 * 60 * 1000) % 24;
				long diffDays = diff / (24 * 60 * 60 * 1000);
				String zeit = diffDays+"Tage, "+diffHours+"Stunden, "+diffMinutes+"Minuten, "+diffSeconds+"Sekunden";
				long kps = zähler/(diff / 1000);
				System.err.println("Passwort gefunden: '" + string+"', hat "+zähler+" Versuche gebraucht! in "+zeit+"("+kps+"/sekunde)");
				scan.close();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Geben sie ein Passwort zum knacken ein:");
		Code = scan.next();
		anfang = new Date();
		while (true) {
			string.append((char) min);

			for (int i = 0; i < string.length() - 1; i++) {
				for (int j = min; j < max; j++) {
					string.setCharAt(i, (char) j);
					loop(i + 1);
				}
			}
		}
	}

}
