package Pswitchcase;

import java.util.Scanner;

public class Cswitchcase {
	static Scanner scan = new Scanner(System.in);
	static String SZahl,SPart1,SPart2;
	static int IZahl,ZPart1,ZPart2;
	static boolean fehler = false;
	
	public static void main(String[] args) {
		eingabe();
		umwandlung();
		ausgabe();
	}
	private static void eingabe() {
		IZahl = scan.nextInt();
	}

	private static void umwandlung() {
		switch (IZahl) {
		case 1:
			SZahl = "Eins";
			break;
		case 2:
			SZahl = "Zwei";
			break;
		case 3:
			SZahl = "Drei";
			break;
		case 4:
			SZahl = "Vier";
			break;
		case 5:
			SZahl = "Fünf";
			break;
		case 6:
			SZahl = "Sechs";
			break;
		case 7:
			SZahl = "Sieben";
			break;
		case 8:
			SZahl = "Acht";
			break;
		case 9:
			SZahl = "Neun";
			break;
		case 10:
			SZahl = "Zehn";
			break;
		case 11:
			SZahl = "Elf";
			break;
		case 12:
			SZahl = "Zwölf";
			break;

		default:
			ZPart1 = IZahl / 10;
			ZPart2 = IZahl % 10;
			if(IZahl <=99) {
				switch (ZPart1) {
				case 1:
					SPart2 = "zehn";
					break;
				case 2:
					SPart2 = "zwanzig";
					break;
				case 3:
					SPart2 = "dreißig";
					break;
				case 4:
					SPart2 = "vierzig";
					break;
				case 5:
					SPart2 = "fünfzig";
					break;
				case 6:
					SPart2 = "sechszig";
					break;
				case 7:
					SPart2 = "siebzig";
					break;
				case 8:
					SPart2 = "achtzig";
					break;
				case 9:
					SPart2 = "neunzig";
					break;

				default:
					break;
				}
				switch (ZPart2) {
				case 1:
					SPart1 = "Eins";
					break;
				case 2:
					SPart1 = "Zwei";
					break;
				case 3:
					SPart1 = "Drei";
					break;
				case 4:
					SPart1 = "Vier";
					break;
				case 5:
					SPart1 = "Fünf";
					break;
				case 6:
					SPart1 = "Sechs";
					break;
				case 7:
					SPart1 = "Sieben";
					break;
				case 8:
					SPart1 = "Acht";
					break;
				case 9:
					SPart1 = "Neun";
					break;
				}
			}else {
				fehler = true;
			}
		}
	}

	private static void ausgabe() {
		if(fehler == true) {
			System.out.println("Fehler! Bitte Zahl zwischen 1-99 eingeben!");
		}else if(IZahl == 17){
			System.out.println("Siebzehn");
		}else if(SPart2 == "zehn"){
			System.out.println(SPart1+SPart2);
		}else if(SZahl == null){
			System.out.println(SPart1+"und"+SPart2);
		}else {
			System.out.println(SZahl);
		}
	}

}
