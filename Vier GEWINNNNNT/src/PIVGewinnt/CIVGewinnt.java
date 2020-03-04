package PIVGewinnt;

import java.util.Scanner;

public class CIVGewinnt {
	static boolean game;
	static int menu, Setzung;
	static String P1, P2, currP, currZ, wintext;
	static String f1 = " ", f2 = " ", f3 = " ", f4 = " ", f5 = " ", f6 = " ", f7 = " ";
	static String f8 = " ", f9 = " ", f10 = " ", f11 = " ", f12 = " ", f13 = " ", f14 = " ";
	static String f15 = " ", f16 = " ", f17 = " ", f18 = " ", f19 = " ", f20 = " ", f21 = " ";
	static String f22 = " ", f23 = " ", f24 = " ", f25 = " ", f26 = " ", f27 = " ", f28 = " ";
	static String f29 = " ", f30 = " ", f31 = " ", f32 = " ", f33 = " ", f34 = " ", f35 = " ";
	static String f36 = " ", f37 = " ", f38 = " ", f39 = " ", f40 = " ", f41 = " ", f42 = " ";

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("Was möchten Sie tun?");
			System.out.println("");
			System.out.println("[1] Neues Spiel");
			System.out.println("[2] Beenden");

			menu = scan.nextInt();
			switch (menu) {
			case 1:
				Startgame();
				break;
			}
		} while (menu != 2);
	}

	private static void Startgame() {
		System.out.println("Geben Sie einen Namen für den Ersten Spieler ein:");
		P1 = scan.next();

		System.out.println("Geben Sie einen Namen für den Zweiten Spieler ein:");
		P2 = scan.next();
		
		game = true;
		currP = P1;
		Game();
	}

	private static void Game() {
		while(game == true) {
			Clearconsole();
			CheckWin();
			System.out.println("Spieler 1: "+P1+"   Spieler 2: "+P2);
			System.out.println("");
			System.out.println("           1 2 3 4 5 6 7 ");
			System.out.println("          ╔═╦═╦═╦═╦═╦═╦═╗");
			System.out.println("          ║"+f1+"║"+f2+"║"+f3+"║"+f4+"║"+f5+"║"+f6+"║"+f7+"║");
			System.out.println("          ║"+f8+"║"+f9+"║"+f10+"║"+f11+"║"+f12+"║"+f13+"║"+f14+"║");
			System.out.println("          ║"+f15+"║"+f16+"║"+f17+"║"+f18+"║"+f19+"║"+f20+"║"+f21+"║");
			System.out.println("          ║"+f22+"║"+f23+"║"+f24+"║"+f25+"║"+f26+"║"+f27+"║"+f28+"║");
			System.out.println("          ║"+f29+"║"+f30+"║"+f31+"║"+f32+"║"+f33+"║"+f34+"║"+f35+"║");
			System.out.println("          ║"+f36+"║"+f37+"║"+f38+"║"+f39+"║"+f40+"║"+f41+"║"+f42+"║");
			System.out.println("          ╚═╩═╩═╩═╩═╩═╩═╝");
			if (currP == P1) {
				currZ = "●";
				while (Setzung != 1 && Setzung != 2 && Setzung != 3 && Setzung != 4 && Setzung != 5 && Setzung != 6
						&& Setzung != 7 && Setzung != 8 && Setzung != 9) {
					System.out.println(P1 + " setzten Sie bitte ● (1-9)");
					Setzung = scan.nextInt();
				}
				Zeichensetzten();
			} else if (currP == P2) {
				currZ = "o";
				while (Setzung != 1 && Setzung != 2 && Setzung != 3 && Setzung != 4 && Setzung != 5 && Setzung != 6
						&& Setzung != 7 && Setzung != 8 && Setzung != 9) {
					System.out.println(P1 + " setzten Sie bitte o (1-9)");
					Setzung = scan.nextInt();
				}
				Zeichensetzten();
			}else {
				System.out.println(wintext);
			}
		}
	}

	private static void CheckWin() {
		
	}

	private static void Zeichensetzten() {
		switch (Setzung) {
		case 1:
			if(f36 == " ") {
				f36 = currZ;
			}else if(f29 == " ") {
				f29 = currZ;
			}else if(f22 == " ") {
				f22 = currZ;
			}else if(f15 == " ") {
				f15 = currZ;
			}else if(f8 == " ") {
				f8 = currZ;
			}else if(f1 == " ") {
				f1 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		case 2:
			if(f37 == " ") {
				f37 = currZ;
			}else if(f30 == " ") {
				f30 = currZ;
			}else if(f23 == " ") {
				f23 = currZ;
			}else if(f16 == " ") {
				f16 = currZ;
			}else if(f9 == " ") {
				f9 = currZ;
			}else if(f2 == " ") {
				f2 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		case 3:
			if(f38 == " ") {
				f38 = currZ;
			}else if(f31 == " ") {
				f31 = currZ;
			}else if(f24 == " ") {
				f24 = currZ;
			}else if(f17 == " ") {
				f17 = currZ;
			}else if(f10 == " ") {
				f10 = currZ;
			}else if(f3 == " ") {
				f3 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		case 4:
			if(f39 == " ") {
				f39 = currZ;
			}else if(f32 == " ") {
				f32 = currZ;
			}else if(f25 == " ") {
				f25 = currZ;
			}else if(f18 == " ") {
				f18 = currZ;
			}else if(f11 == " ") {
				f11 = currZ;
			}else if(f4 == " ") {
				f4 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		case 5:
			if(f40 == " ") {
				f40 = currZ;
			}else if(f33 == " ") {
				f33 = currZ;
			}else if(f26 == " ") {
				f26 = currZ;
			}else if(f19 == " ") {
				f19 = currZ;
			}else if(f12 == " ") {
				f12 = currZ;
			}else if(f5 == " ") {
				f5 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		case 6:
			if(f41 == " ") {
				f41 = currZ;
			}else if(f34 == " ") {
				f34 = currZ;
			}else if(f27 == " ") {
				f27 = currZ;
			}else if(f20 == " ") {
				f20 = currZ;
			}else if(f13 == " ") {
				f13 = currZ;
			}else if(f6 == " ") {
				f6 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		case 7:
			if(f42 == " ") {
				f42 = currZ;
			}else if(f35 == " ") {
				f35 = currZ;
			}else if(f28 == " ") {
				f28 = currZ;
			}else if(f21 == " ") {
				f21 = currZ;
			}else if(f14 == " ") {
				f14 = currZ;
			}else if(f7 == " ") {
				f7 = currZ;
			}else {
				System.out.println("Okay Boomer ich schreibe die kacke hier nicht extra um damit du es nochmal verscuhen kannst... nächster Spieler!");
			}
			if(currZ == "●") {
				currP = P2;
			}else {
				currP = P1;
			}
			Setzung = 0;
			break;
		}
		Clearconsole();
	}

	private static void Clearconsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}

}
