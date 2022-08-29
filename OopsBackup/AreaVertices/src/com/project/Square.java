package com.project;

public class Square implements Shape {

	@Override
	public void findArea(double vertexA, double vertexB, double vertexC) {
		
		double areaOfSquare = (vertexB - vertexA) * (vertexB - vertexA);

		System.out.println("Area Of Square=" + areaOfSquare);

	}

}
