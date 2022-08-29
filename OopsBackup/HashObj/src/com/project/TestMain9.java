package com.project;

public class TestMain9 {
	/*
	 * author:Ankesh.patil
	 */

	public static void main(String[] args) {
		/*
		 * With the help of finalize method print the how many objects are currently a
		 * class is having and which object is going to be freed from the memory with
		 * its hashcode.
		 */
		Student e1 = new Student(101);
		Student e2 = new Student(102);
		Student e3 = new Student(103);
		Student e4 = new Student(104);
		Student e5 = new Student(105);

		e2 = null;
		e5 = null;
		System.gc();

		for (int i = 1; i < 6; i++) {
			String e = "e" + i;
			System.out.println(e + ":" + e.hashCode());
		}
		System.out.println("e2=" + e2);
		System.out.println("e5=" + e5);

	}
}
