package com.project;

public class Class4 extends Class1 {

	@Override
	public void getNumbers(int number) {
		int count = 0;

		int remainder2 = 0;
		
		int flag;
		while (number > 0) {
			int temp = remainder2;
			remainder2 = number % 10;

			if (temp > remainder2) {
				flag = temp;
				remainder2 = temp;
				temp = flag;

			}

			number = number / 10;
			count++;
			if (count == number) {
				break;

			}
		}
		System.out.println("The maximum of n number is :>>"+remainder2);
		
	}
	
	

}
