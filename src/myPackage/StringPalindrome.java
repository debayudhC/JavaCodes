package myPackage;

import java.util.*;

public class StringPalindrome {
	public static void checkPalindrome(String input) {
		String output = "";
		int j = input.length();
		int i = j - 1;
		while (i >= 0) {
			char c1 = input.charAt(i);
			output = output + c1;
			i--;
		}
		System.out.println("The reversed string is " + output);
		if (input.equalsIgnoreCase(output) == true) {
			System.out.println("The String is a palindrome");
		}
		else
		{
			System.out.println("The String is not a palindrome");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter a string");
		String name = myScan.nextLine();
		System.out.println("The User input string is" + name);
		checkPalindrome(name);
		myScan.close();

	}

}
