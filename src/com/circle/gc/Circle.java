//Jiao XU 5/4/2018
package com.circle.gc;

public class Circle {
	private double radius;

	public Circle() {
		
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	public double getCircumference() {
		double circumference = Math.PI * 2 * radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		String fc = formatNumber(getCircumference());
		return fc;

	}

	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}

	public String getFormattedArea() {
		String fa = formatNumber(getArea());
		return fa;
	}

	private String formatNumber(double x) {
		String fNum = String.format("%.2f", x);
		return fNum;

	}

}