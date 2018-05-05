package com.circle.gc;

import java.util.Scanner;

public class Validator {
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;

		System.out.print(prompt);
		while (isValid == false) {

			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if (d >= 0) {
					isValid = true;
				} else {
					System.out.println("Error! Radius can not be negative. Try again!\nEnter a radius: ");
					sc.nextLine();
				}
			} else {
				System.out.println("Error! Invalid value. Try again!\nEnter a radius: ");
				sc.next();
			}
		}
		return d;
	}
}