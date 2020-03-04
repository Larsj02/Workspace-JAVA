package PZähler;

import java.math.BigInteger;
import java.util.Scanner;

public class CZähler {

	static int grenze;
	static BigInteger x = new BigInteger("1");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("(eingabe: 1-170)");
		System.out.println("Bis zu welcher zahl soll multipliziert werden?");
		grenze = scan.nextInt();
		
		for (int i = 1; i <= grenze; i++) {
			x = x.multiply(new BigInteger("" + i));
			//System.out.println(x+" bei "+i);
		}
		System.out.println(x);
		scan.close();
	}

}
