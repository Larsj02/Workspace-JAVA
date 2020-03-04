package PMain;

import java.util.ArrayList;
import java.util.Scanner;

import PDeziZu.ZuBinär;
import PDeziZu.ZuHexa;
import PDeziZu.ZuOktal;
import PDeziZu.ZuVierer;
import PZuDezi.VonBinär;
import PZuDezi.VonHexa;
import PZuDezi.VonOktal;
import PZuDezi.VonVierer;

public class Cmain {
	
	public static String AusZS, ZuZS, AnzeigeZS, EingabeZahl, teil, SummeS,auswahl;
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<String> gültig = new ArrayList<String>();
	public static boolean prüfer;

	public static void main(String[] args) {
		do {
			ClearConsole();
			//Menü
			System.out.println("╔════════════════════════════════════════╗");
			System.out.println("║   Aus welchem System ist ihre Zahl?    ║");
			System.out.println("║[1] BIN [2] 4er [3] OCT [4] HEX [5] DEC ║");
			System.out.println("╠════════════════════════════════════════╣");
			System.out.println("║             Eingabe (1-5):             ║");
			
			//Prüfe ob der Wert richtig ist
			do {
				AusZS = scan.next();
			} while (!(Integer.valueOf(AusZS) > 0 && Integer.valueOf(AusZS) <= 5));
			ClearConsole();
			
			//Ändere Die Information der Anzeige und lege die gültigen zahlen fest
			switch (AusZS) {
			case "1":
				AnzeigeZS = "BIN";
				gültig.add("0");
				gültig.add("1");
				break;
			case "2":
				AnzeigeZS = "4er";
				gültig.add("0");
				gültig.add("1");
				gültig.add("2");
				gültig.add("3");
				break;
			case "3":
				AnzeigeZS = "OCT";
				gültig.add("0");
				gültig.add("1");
				gültig.add("2");
				gültig.add("3");
				gültig.add("4");
				gültig.add("5");
				gültig.add("6");
				gültig.add("7");
				break;
			case "4":
				AnzeigeZS = "HEX";
				gültig.add("0");
				gültig.add("1");
				gültig.add("2");
				gültig.add("3");
				gültig.add("4");
				gültig.add("5");
				gültig.add("6");
				gültig.add("7");
				gültig.add("8");
				gültig.add("9");
				gültig.add("A");
				gültig.add("B");
				gültig.add("C");
				gültig.add("D");
				gültig.add("E");
				gültig.add("F");
				break;
			case "5":
				AnzeigeZS = "DEC";
				gültig.add("0");
				gültig.add("1");
				gültig.add("2");
				gültig.add("3");
				gültig.add("4");
				gültig.add("5");
				gültig.add("6");
				gültig.add("7");
				gültig.add("8");
				gültig.add("9");
				break;
			}
			
			//Menü + Anzeige der ersten Auswahl
			System.out.println("╔════════════════════════════════════════╗");
			System.out.println("║   Aus welchem System ist ihre Zahl?    ║");
			System.out.println("║                  "+AnzeigeZS+"                   ║");
			System.out.println("╠════════════════════════════════════════╣");
			System.out.println("║   In welches System soll ihre Zahl?    ║");
			System.out.println("║[1] BIN [2] 4er [3] OCT [4] HEX [5] DEC ║");
			System.out.println("╠════════════════════════════════════════╣");
			System.out.println("║             Eingabe (1-5):             ║");
			
			//Prüfe ob der Wert richtig ist
			do {
				ZuZS = scan.next();
			} while (!(Integer.valueOf(ZuZS) > 0 && Integer.valueOf(ZuZS) <= 5));
			
			//Ändere Die Information der Anzeige
			switch (ZuZS) {
			case "1":
				AnzeigeZS = AnzeigeZS + " >> BIN";
				break;
			case "2":
				AnzeigeZS = AnzeigeZS + " >> 4er";
				break;
			case "3":
				AnzeigeZS = AnzeigeZS + " >> OCT";
				break;
			case "4":
				AnzeigeZS = AnzeigeZS + " >> HEX";
				break;
			case "5":
				AnzeigeZS = AnzeigeZS + " >> DEC";
				break;
			}
			
			//Frage den user nach der Zahl und Überprüfe Sie
			do {
				ClearConsole();
				System.out.println("╔════════════════════════════════════════╗");
				System.out.println("║           Auswahl: "+AnzeigeZS+"          ║");
				System.out.println("╠════════════════════════════════════════╣");
				System.out.println("║    Geben sie eine gültige Zahl ein:    ║");
				EingabeZahl = scan.next();
				prüfer = true;
				for (int i = 0; i < EingabeZahl.length(); i++) {
					teil = EingabeZahl.substring(EingabeZahl.length() - i - 1, EingabeZahl.length() - i);
					if(CheckArray(teil) == true && prüfer == true) {
						prüfer = true;
					}else {
						prüfer = false;
					}
				}
			} while (prüfer == false);
			
			//Wandel die Zahl um
			switch (AusZS) {
			case "1":
				VonBinär.main(EingabeZahl);
				break;
			case "2":
				VonVierer.main(EingabeZahl);
				break;
			case "3":
				VonOktal.main(EingabeZahl);
				break;
			case "4":
				VonHexa.main(EingabeZahl);
				break;
			case "5":
				SummeS = EingabeZahl;
				break;
			case "6":
				SummeS = EingabeZahl;
				break;
			default:
				break;
			}
			switch (ZuZS) {
			case "1":
				ZuBinär.main(SummeS);
				break;
			case "2":
				ZuVierer.main(SummeS);
				break;
			case "3":
				ZuOktal.main(SummeS);
				break;
			case "4":
				ZuHexa.main(SummeS);
				break;
			default:
				break;
			}
			
			//Schreibe den Kasten + Ergebnis und frage den User ob es weiter gehen soll
			SummenKasten();
			System.out.println("╔════════════════════════════════════════╗");
			System.out.println("║       [1] Fortfahren [0] Beenden       ║");
			System.out.println("╚════════════════════════════════════════╝");
			auswahl = scan.next();
		} while (Integer.valueOf(auswahl) != 0);
		scan.close();
	}
	
	public static void ClearConsole(){
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	public static void ClearArray() {
		for (int i = 0; i < gültig.size(); i++) {
			gültig.remove(i);
		}
	}
	public static boolean CheckArray(String zahl) {
		for (int i = 0; i < gültig.size(); i++) {
			if(gültig.get(i).equalsIgnoreCase(zahl)) {
				return true;
			}
		}
		return false;
	}
	
	public static void SummenKasten() {
		ClearConsole();
		System.out.println("Eingabe: "+EingabeZahl);
		int länge = SummeS.length();
		System.out.print("╔");
		for (int i = 0; i < länge+20; i++) {
			System.out.print("═");
		}
		System.out.println("╗");
		
		System.out.print("║");
		for (int i = 0; i < länge/2+5; i++) {
			System.out.print(" ");
		}
		System.out.print(AnzeigeZS);
		for (int i = 0; i < länge - länge/2+5; i++) {
			System.out.print(" ");
		}
		System.out.println("║");
		
		System.out.print("╠");
		for (int i = 0; i < länge+20; i++) {
			System.out.print("═");
		}
		System.out.println("╣");
		
		System.out.println("║ Das Ergebnis ist: "+SummeS+" ║");
		
		System.out.print("╚");
		for (int i = 0; i < länge+20; i++) {
			System.out.print("═");
		}
		System.out.println("╝");
	}

}
