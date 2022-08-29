package com.project;

import java.util.Scanner;

public class TestMain4 {
	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter sides ");
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=scr.nextInt();
		
		Area area=new Area();
		area.getArea(a);
		area.getArea(a, b);
		area.getArea(a, b, c);
	}

}

