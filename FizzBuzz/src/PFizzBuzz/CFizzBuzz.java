package PFizzBuzz;

import java.util.Scanner;

public class CFizzBuzz {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		fizzbuzz(scan.nextInt());
	}
	static String fizzbuzz(int number) {
		String value;
		switch (number % 15) {
		case 3:
		case 6:
		case 9:
		case 12: // divisible by 3, print Fizz
			value = "Fizz";
		case 5:
		case 10: // divisible by 5, print Buzz
			value = "Buzz";
		case 0: // divisible by 3 and by 5, print FizzBuzz
			value = "FizzBuzz";
		default: // else print the number
			value = Integer.toString(number);
		}
		return value;
	}

}
