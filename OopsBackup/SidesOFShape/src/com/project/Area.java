package com.project;

public class Area {
	/*
	 * Create a class Area in which user will be asked to input the sides of shape.
	 * User will be asked to input three sides of shape. If user input two sides of
	 * shape same, you have to print area of square for that side. With 3 inputs you
	 * have to print area of rectangle in combination. With 3 sides you have to
	 * print the area of triangle. Also check the given three sides are belong to
	 * right angle triangle or not.
	 */

	public void getArea(int a) {
		System.out.println("Area of Square is :" + a * a);
	}

	public void getArea(int a, int b) {
		System.out.println("Area of Rectangle is :" + a * b);
	}

	public void getArea(int a, int b, int c) {
		int s = (a + b + c) / 2;
		int z = (s * (s - a) * (s - b) * (s - c));
		if (a > b && a > c) {
			if (c * c + b * b == a * a) {
				System.out.println("It is a Right angle traingle!");
			}
		} else if (b > a && b > c) {
			if (a * a + c * c == b * b) {
				System.out.println("It is a Right angle traingle!");
			}
		} else if (c > a && c > b) {
			if (a * a + b * b == c * c) {
				System.out.println("It is a Right angle traingle!");
			}
		}else {
			System.out.println("It is not a right angle triangle");
		}

		System.out.println("Area of traingle : " + Math.sqrt(z));
	}
}
