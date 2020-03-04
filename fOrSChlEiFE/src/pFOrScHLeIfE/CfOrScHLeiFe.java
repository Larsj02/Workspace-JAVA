package pFOrScHLeIfE;

import java.util.Scanner;

public class CfOrScHLeiFe {
	
	static Scanner scan = new Scanner(System.in);
	static int eingabe;
	
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie die Anzahl der durchläufe an:");
		eingabe = scan.nextInt();
		for (int i = 0; i <= eingabe; i++) {
			System.out.println("Durchlauf Nr. "+i);
		}
	}

}
