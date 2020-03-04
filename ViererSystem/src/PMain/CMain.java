package PMain;

import java.util.ArrayList;
import java.util.Scanner;

public class CMain {

	static int summe = 0;
	static int potenz = 1;
	static int zahl, z_teil, teilsumme, auswahl,full,erweitert;
	static double kZahl,gZahl,x;
	static String teil,hzahl,summeS;
	static boolean fehler,inmode;
	
	static ArrayList<String> gültig = new ArrayList<String>();

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			fehler = false;
			summe = 0;
			summeS="";
			potenz = 1;
			ClearArray();
			System.out.println("╔════════════════════════════════════════╗");
			System.out.println("║Bitte Übersetzung eingeben:             ║");
			System.out.println("╠═══════════════════╦════════════════════╣");
			System.out.println("╟─[1] 2er >> Dezi   ╟─[5] Dezi >> 2er    ║");
			System.out.println("╟─[2] 4er >> Dezi   ╟─[6] Dezi >> 4er    ║");
			System.out.println("╟─[3] 8er >> Dezi   ╟─[7] Dezi >> 8er    ║");
			System.out.println("╟─[4] 16er >> Dezi  ╟─[8] Dezi >> 16er   ║");
			System.out.println("╠═══════════════════╬════════════════════╣");
			System.out.println("╟─[9] Erweitert     ╟─[0] Schließen      ║");
			System.out.println("╚═══════════════════╩════════════════════╝");
			
			auswahl = scan.nextInt();
			clear();
			
			switch (auswahl) {
			case 1:
				inmode = false;
				gültig.add("0");
				gültig.add("1");
				System.out.println("Bitte geben sie eine Zahl des 2er Systems ein um sie ins Dezimal System zu übersetzten:");
				Binärystem(scan.nextInt());
				break;
			case 2:
				inmode = false;
				gültig.add("0");
				gültig.add("1");
				gültig.add("2");
				gültig.add("3");
				System.out.println("Bitte geben sie eine Zahl des 4er Systems ein um sie ins Dezimal System zu übersetzten:");
				Viererystem(scan.nextInt());
				break;
			case 3:
				inmode = false;
				gültig.add("0");
				gültig.add("1");
				gültig.add("2");
				gültig.add("3");
				gültig.add("4");
				gültig.add("5");
				gültig.add("6");
				gültig.add("7");
				System.out.println("Bitte geben sie eine Zahl des 8er Systems ein um sie ins Dezimal System zu übersetzten:");
				octalsystem(scan.nextInt());
				break;
			case 4:
				inmode = false;
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
				System.out.println("Bitte geben sie eine Zahl des 16er Systems ein um sie ins Dezimal System zu übersetzten:");
				hexasystem(scan.next());
				break;
			case 5:
				inmode = true;
				System.out.println("Bitte geben sie eine Zahl des Dezimal Systems ein um sie ins Binär System zu übersetzten:");
				inBinär(scan.nextInt());
					break;
			case 6:
				inmode = true;
				System.out.println("Bitte geben sie eine Zahl des Dezimal Systems ein um sie ins Vierer System zu übersetzten:");
				inVierer(scan.nextInt());
				break;
			case 7:
				inmode = true;
				System.out.println("Bitte geben sie eine Zahl des Dezimal Systems ein um sie ins Octa System zu übersetzten:");
				inOcta(scan.nextInt());
				break;
			case 8:
				inmode = true;
				System.out.println("Bitte geben sie eine Zahl des Dezimal Systems ein um sie ins Hexa System zu übersetzten:");
				inHexa(scan.nextInt());
				break;
			case 9:
				inmode = true;
				erweitertAUS();
				break;
			case 0:
				
				break;
			}
			if(fehler==false) {
				if(inmode == false) {
					clear();
					System.out.println("╔════════════════════════════════════════╗");
					System.out.println("║ Im 10er System: " + summe);
					System.out.println("╚════════════════════════════════════════╝");
				}
			}else {
				
			}
		} while (auswahl > 0);
	}
	
	private static void erweitertAUS() {
		System.out.println("Aus welchem System ist ihre Zahl?");
		System.out.println("[1] 2er");
		System.out.println("[2] 4er");
		System.out.println("[3] 8er");
		System.out.println("[4] 16er");
		erweitert = scan.nextInt();
		erweitertIN();
	}
	
	private static void erweitertIN() {
		System.out.println("In welches System soll ihre Zahl?");
		System.out.println("[1] 2er");
		System.out.println("[2] 4er");
		System.out.println("[3] 8er");
		System.out.println("[4] 16er");
		auswahl = scan.nextInt();
		
		System.out.println("Geben sie ihre Zahl ein:");
		switch (erweitert) {
		case 1:
			gültig.add("0");
			gültig.add("1");
			Binärystem(scan.nextInt());
			break;
		case 2:
			gültig.add("0");
			gültig.add("1");
			gültig.add("2");
			gültig.add("3");
			Viererystem(scan.nextInt());
			break;
		case 3:
			gültig.add("0");
			gültig.add("1");
			gültig.add("2");
			gültig.add("3");
			gültig.add("4");
			gültig.add("5");
			gültig.add("6");
			gültig.add("7");
			octalsystem(scan.nextInt());
			break;
		case 4:
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
			hexasystem(scan.next());
			break;
		default:
			break;
		}
		switch (auswahl) {
		case 1:
			inBinär(summe);
			break;
		case 2:
			inVierer(summe);
			break;
		case 3:
			inOcta(summe);
			break;
		case 4:
			inHexa(summe);
			break;
		default:
			break;
		}
	}
	
	private static void inBinär(int hzahl) {
		int zzahl = Integer.valueOf(hzahl);
		do {
			if(zzahl % 2 == 1) {
				summeS="1"+summeS;
			}else {
				summeS="0"+summeS;
			}
			zzahl = zzahl /2;
		} while (zzahl != 0);
		clear();
		System.out.println("╔════════════════════════════════════════╗");
		System.out.println("║ Im 2er System: " + summeS);
		System.out.println("╚════════════════════════════════════════╝");
	}

	private static void inVierer(int hzahl) {
		int kZahl = Integer.valueOf(hzahl);
		gZahl = kZahl;
		do {
			kZahl = kZahl /4;
			gZahl = gZahl /4;
			x = gZahl - kZahl;
			if(x > 0) {
				full = (int) (x*4);
				summeS=full+summeS;
			}else {
				summeS="0"+summeS;
			}
		} while (kZahl != 0);
		clear();
		System.out.println("╔════════════════════════════════════════╗");
		System.out.println("║ Im 4er System: " + summeS);
		System.out.println("╚════════════════════════════════════════╝");
	}

	private static void inOcta(int hzahl) {
		int kZahl = Integer.valueOf(hzahl);
		gZahl = kZahl;
		do {
			kZahl = kZahl /8;
			gZahl = gZahl /8;
			x = gZahl - kZahl;
			if(x > 0) {
				full = (int) (x*8);
				summeS=full+summeS;
			}else {
				summeS="0"+summeS;
			}
		} while (kZahl != 0);
		clear();
		System.out.println("╔════════════════════════════════════════╗");
		System.out.println("║ Im 8er System: " + summeS);
		System.out.println("╚════════════════════════════════════════╝");
	}

	private static void inHexa(int hzahl) {
		int kZahl = Integer.valueOf(hzahl);
		gZahl = kZahl;
		do {
			kZahl = kZahl /16;
			gZahl = gZahl /16;
			x = gZahl - kZahl;
			if(x > 0) {
				full = (int) (x*16);
				String Ziffer = String.valueOf(full);
				if(full >= 15) {
					Ziffer="F";
				}else if(full >= 14) {
					Ziffer="E";
				}else if(full >= 13) {
					Ziffer="D";
				}else if(full >= 12) {
					Ziffer="C";
				}else if(full >= 11) {
					Ziffer="B";
				}else if(full >= 10) {
					Ziffer="A";
				}
				summeS=Ziffer+summeS;
			}else {
				summeS="0"+summeS;
			}
		} while (kZahl != 0);
		clear();
		System.out.println("╔════════════════════════════════════════╗");
		System.out.println("║ Im 16er System: " + summeS);
		System.out.println("╚════════════════════════════════════════╝");
	}

	private static void Binärystem(int hzahl) {
		CMain.hzahl = String.valueOf(hzahl);
		int länge = String.valueOf(hzahl).length();

		for (int i = 0; i < länge; i++) {
			teil = String.valueOf(hzahl).substring(länge - i - 1, länge - i);
			if(checkArray(teil) == true) {
				z_teil = Integer.valueOf(teil);

				teilsumme = z_teil * potenz;

				summe = summe + teilsumme;

				potenz = potenz * 2;
			}else {
				clear();
				System.out.println("Fehler: geben sie einen Gültigen Wert aus dem 2er System an!");
				summeS = "//Fehler: geben sie einen Gültigen Wert aus dem 2er System an!";
				fehler = true;
			}
		}
	}
	
	private static void Viererystem(int hzahl) {
		CMain.hzahl = String.valueOf(hzahl);
		int länge = String.valueOf(hzahl).length();

		for (int i = 0; i < länge; i++) {
			teil = String.valueOf(hzahl).substring(länge - i - 1, länge - i);
			if(checkArray(teil) == true) {
				z_teil = Integer.valueOf(teil);

				teilsumme = z_teil * potenz;

				summe = summe + teilsumme;

				potenz = potenz * 4;
			}else {
				clear();
				System.out.println("Fehler: geben sie einen Gültigen Wert aus dem 4er System an!");
				summeS = "//Fehler: geben sie einen Gültigen Wert aus dem 4er System an!";
				fehler = true;
			}
		}
	}
	
	private static void octalsystem(int hzahl) {
		CMain.hzahl = String.valueOf(hzahl);
		int länge = String.valueOf(hzahl).length();

		for (int i = 0; i < länge; i++) {
			teil = String.valueOf(hzahl).substring(länge - i - 1, länge - i);
			if(checkArray(teil) == true) {
				z_teil = Integer.valueOf(teil);

				teilsumme = z_teil * potenz;

				summe = summe + teilsumme;

				potenz = potenz * 8;
			}else {
				clear();
				System.out.println("Fehler: geben sie einen Gültigen Wert aus dem 8er System an!");
				summeS = "//Fehler: geben sie einen Gültigen Wert aus dem 8er System an!";
				fehler = true;
			}
		}
	}
	
	private static void hexasystem(String hzahl) {
		CMain.hzahl = String.valueOf(hzahl);
		int länge = String.valueOf(hzahl).length();

		for (int i = 0; i < länge; i++) {
			teil = String.valueOf(hzahl).substring(länge - i - 1, länge - i);
			
			if(checkArray(teil) == true) {
				switch (teil.toLowerCase()) {
				case "a":
					teil = "10";
					break;
				case "b":
					teil = "11";
					break;
				case "c":
					teil = "12";
					break;
				case "d":
					teil = "13";
					break;
				case "e":
					teil = "14";
					break;
				case "f":
					teil = "15";
					break;

				default:
					break;
				}
				z_teil = Integer.valueOf(teil);
				
				teilsumme = z_teil * potenz;

				summe = summe + teilsumme;

				potenz = potenz * 16;
			}else {
				clear();
				System.out.println("Fehler: geben sie einen Gültigen Wert aus dem 16er System an!");
				summeS = "//Fehler: geben sie einen Gültigen Wert aus dem 16er System an!";
				fehler = true;
			}
		}
	}
	
	private static void ClearArray() {
		for (int i = 0; i < gültig.size(); i++) {
			gültig.remove(i);
		}
	}

	private static void clear() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	
	private static boolean checkArray(String zahl) {
		for (int i = 0; i < gültig.size(); i++) {
			if(gültig.get(i).equalsIgnoreCase(zahl)) {
				return true;
			}
		}
		return false;
	}
}
