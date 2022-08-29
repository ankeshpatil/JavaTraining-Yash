package com.project;

public class Triangle implements Shape {

	@Override
	public void findArea(double vertexA, double vertexB, double vertexC) {

		double areaOfTriangle = ((vertexB - vertexA) * (vertexC / 2));

		System.out.println("Area Of Triangle=" + areaOfTriangle);
	}

}
