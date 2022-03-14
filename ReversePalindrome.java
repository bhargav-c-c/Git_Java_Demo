package com.te.javabasics.string;

import java.util.Scanner;

public class ReversePalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		String string2 = "";
		// to print the reverse string
		for (int i = string.length() - 1; i >= 0; i--) {
			string2 = string2 + string.charAt(i);
		}
		System.out.println("Entered String= " + string);
		System.out.println("Reversed String= " + string2);
		// to check if its palindrome
		if (string2.equalsIgnoreCase(string)) {
			System.out.println("the Given String is palindrome");

		} else {
			System.out.println("the Given String is not palindrome");
		}
	}

} // end of prgms
