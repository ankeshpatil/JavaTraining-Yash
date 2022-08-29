package com.project;

/*
 * author Ankesh
 */
public class Test {
	/*
	 * Create class CalcAbs which is an abstract class it will have following 
methods:- void sum(int a, int b); void sub(int a, int b), void mul(int a, int 
b), void div(int a,int b). You have to perform multilevel inheritance where 
at each level one method of CalcAbs will be overridden by the child class 
for example:-
Class CalcAbs
Clsss A extends CalcAbs { it will override sum} 
Class B extends A {it will override sub}
Class C extends B {it will override mul}
Class D extends C {it will override div} 
At the fourth level you have to create object and call all methods and 
print the results for all operations. 
	 */
	
	public static void main(String[] args) {
		
		D obj =new D();
		obj.sum(10, 5);
		obj.sub(10, 5);
		obj.mul(10, 5);
		obj.div(10, 5);
	}
	
			

}
