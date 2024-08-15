package da19Exception;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int number = sc.nextInt();

			if (number < 0) {
				throw new IllegalArgumentException("Number cannot be negative");
			} else {
				int square = number * number;
				System.out.println("Square is: " + square);
			}
		} catch (Exception ee) {
			ee.printStackTrace();

			System.out.println("out of loop");
		}

	}
}
