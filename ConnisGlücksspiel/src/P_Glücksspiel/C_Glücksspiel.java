package P_Glücksspiel;

import java.util.Random;
import java.util.Scanner;

public class C_Glücksspiel {
	
	static String auswahl;
	static Scanner scan = new Scanner(System.in);
	static int Score1=0,Score2=0,Runde=0,r;
	static String BSP = "", LSP = "", SSP1 = "    ", SSP2 = "    ";

	public static void main(String[] args) {
		do {
			Runde++;
			r = rndm_num(1, 2);
			if(r == 1) {
				Score1++;
			}else {
				Score2++;
			}
			
			if(Score1 >= 10000){
				SSP1="";
			}else if(Score1 >= 1000){
				SSP1=" ";
			}else if(Score1 >= 100){
				SSP1="  ";
			}else if(Score1 >= 10){
				SSP1="   ";
			}
			
			if(Score2 >= 10000){
				SSP2="";
			}else if(Score2 >= 1000){
				SSP2=" ";
			}else if(Score2 >= 100){
				SSP2="  ";
			}else if(Score2 >= 10){
				SSP2="   ";
			}
			
			if(Runde >= 100000) {
				LSP="     ";
				BSP="═════";
			}else if(Runde >= 10000){
				LSP="    ";
				BSP="════";
			}else if(Runde >= 1000){
				LSP="   ";
				BSP="═══";
			}else if(Runde >= 100){
				LSP="  ";
				BSP="══";
			}else if(Runde >= 10){
				LSP=" ";
				BSP="═";
			}
			
			clearConsole();
			System.out.println("╔════════════════════════════════════════"+BSP+"╗");
			System.out.println("║Spiel: Coinflip                 Runde:"+Runde+" ║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║Gewinner: Spieler "+r+"                     "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║Score:                                  "+LSP+"║");
			System.out.println("║Spieler 1: "+Score1+"                  "+SSP1+"      "+LSP+"║");
			System.out.println("║Spieler 2: "+Score2+"                  "+SSP2+"      "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║                                        "+LSP+"║");
			System.out.println("║       [1] Fortfahren [0] Beenden       "+LSP+"║");
			System.out.println("╚════════════════════════════════════════"+BSP+"╝");
			do {
				auswahl = scan.next();
			} while (!(Integer.valueOf(auswahl) ==1 || Integer.valueOf(auswahl)==0));
		} while (Integer.valueOf(auswahl) != 0);
		scan.close();
	}
	
	private static void clearConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}

	private static int rndm_num(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}