package PTicTacToe;

public class CGewinnersuche {

	public static void main(String[] args) {
		// Reihen Vertikal
		if (CP1vsP2.f1 == "x" && CP1vsP2.f2 == "x" && CP1vsP2.f3 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f1 == "o" && CP1vsP2.f2 == "o" && CP1vsP2.f3 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		else if (CP1vsP2.f4 == "x" && CP1vsP2.f5 == "x" && CP1vsP2.f6 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f4 == "o" && CP1vsP2.f5 == "o" && CP1vsP2.f6 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		else if (CP1vsP2.f7 == "x" && CP1vsP2.f8 == "x" && CP1vsP2.f9 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f7 == "o" && CP1vsP2.f8 == "o" && CP1vsP2.f9 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		// Reihen Horizontal
		else if (CP1vsP2.f1 == "x" && CP1vsP2.f4 == "x" && CP1vsP2.f7 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f1 == "o" && CP1vsP2.f4 == "o" && CP1vsP2.f7 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		else if (CP1vsP2.f2 == "x" && CP1vsP2.f5 == "x" && CP1vsP2.f8 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f2 == "o" && CP1vsP2.f5 == "o" && CP1vsP2.f8 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		else if (CP1vsP2.f3 == "x" && CP1vsP2.f6 == "x" && CP1vsP2.f9 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f3 == "o" && CP1vsP2.f6 == "o" && CP1vsP2.f9 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		// Reihen Diagonal
		else if (CP1vsP2.f1 == "x" && CP1vsP2.f5 == "x" && CP1vsP2.f9 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f1 == "o" && CP1vsP2.f5 == "o" && CP1vsP2.f9 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}

		else if (CP1vsP2.f3 == "x" && CP1vsP2.f5 == "x" && CP1vsP2.f7 == "x") {
			System.out.println("Spieler X hat Gewonnen!");
			CP1vsP2.loop = false;
		} else if (CP1vsP2.f3 == "o" && CP1vsP2.f5 == "o" && CP1vsP2.f7 == "o") {
			System.out.println("Spieler O hat Gewonnen!");
			CP1vsP2.loop = false;
		}
	}

}
