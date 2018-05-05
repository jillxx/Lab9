package com.circle.gc;

public class Circle {

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
	}

	public double getCircumference(double radius) {
		double circumference = Math.PI * 2 * radius;
		return circumference;
	}

	public String getFormattedCircumference(double circR) {
		String fc = formatNumber(getCircumference(circR));
		return fc;
		
	}

	public double getArea(double radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}

	public String getFormattedArea(double areaR) {
		String fa = formatNumber(getArea(areaR));
		return fa;
	}

	private String formatNumber(double x) {
		String fNum = String.format("%.2f", x);
		return fNum;

	}

}