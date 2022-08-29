package com.project;

/*
 * author :ankesh.patil
 */
public class TestMain2 {
	/*
	 * Create class/interface Shape which will have only one method area. Create
	 * class Triangle, Square and Rectangle all will extends/implements Shape. In
	 * class Triangle, Square and Rectangle depending upon the number of sides you
	 * have to react the co-ordinates of the vertex. For example triangle having
	 * three vertex so name each vertex A,B and C. now you have to read the x & y
	 * co-ordinates of A,B and C, after that you have find the distance between the
	 * vertex A, B and C after this you have to calculate the Area and print Area.
	 * Same process will be applied while calculating area of Square and Rectangle.
	 */

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.findArea(10, 20, 50);

		Square s = new Square();
		s.findArea(0, 50, 50);

		Triangle t = new Triangle();
		t.findArea(40, 50, 30);

	}
	
}
