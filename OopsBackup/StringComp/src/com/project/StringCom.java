package com.project;

public class StringCom {
	
	static int count = 0;

	public static int stringCompare(String str1, String str2) {

		for (int i = 0; i < str1.length() && i < str2.length(); i++) {

			if (str1.charAt(i) == str2.charAt(i)) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Total number of alphabet matching=" + count);

		} else {
			System.out.println("No alphabet is matching");

		}

		return count;

	}

}
