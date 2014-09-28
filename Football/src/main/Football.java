package main;

import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of pasing attemps (ATT): ");

		float ATT = input.nextInt();

		System.out.print("Enter number of completions (COMP): ");

		float COMP = input.nextInt();

		System.out.print("Enter number of passing yards (YDS): ");

		float YDS = input.nextInt();

		System.out.print("Enter number of touchdown passes (TD): ");

		float TD = input.nextInt();

		System.out.print("Enter number of interceptions (INT): ");

		float INT = input.nextInt();

		double a = (((COMP / ATT)- 0.3) * 5);
		double b = (((YDS / ATT) - 3) * 0.25);
		double c = ((TD / ATT) * 20);
		double d = (2.375 - ((INT / ATT) * 25));

		double rating = ((((a < 0) ? 0 : (a > 2.375 ? 2.375 : a)) + ((b < 0) ? 0 : (b > 2.375 ? 2.375 : b))
				+ ((c < 0) ? 0 : (c > 2.375 ? 2.375 : c)) + ((d < 0) ? 0 : (d > 2.375 ? 2.375 : d))) / 6) * 100;

		System.out.println("Player's QB rating is " + rating);

		input.close();
	}
}