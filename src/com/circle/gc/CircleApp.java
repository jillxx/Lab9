package com.circle.gc;

//Jiao Xu 5/4/2018
import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");
		String cont = "y";
		int num = 0;
		while (cont.equalsIgnoreCase("y")) {
			// System.out.print("Please enter a radius: ");
			double radius = Validator.getDouble(scnr, "Enter a radius: ");
			// double radius = scnr.nextDouble();

			Circle c = new Circle(radius);
 
			System.out.println("Circumference: " + c.getFormattedCircumference(radius));
			System.out.println("Area: " + c.getFormattedArea(radius));

			System.out.println("Continue? (y/n)");
			cont = scnr.next();
            num++;
		}
		System.out.println("Goodbye.");
		System.out.println("You have calculated "+ num + " circles");
		scnr.close();
	}

}
