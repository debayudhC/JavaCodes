package myPackage;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// covert an string to character array
		String name = "Amsterdam";
		
		char[] arrName = name.toCharArray();
		System.out.println(arrName[0]);
		for (char c:arrName)
		{
			System.out.println(c);
		}
		
		//Character Sort array:
		System.out.println("The sorted array is");
		Arrays.sort(arrName);
		
		for (char c:arrName)
		{
			System.out.println(c);
		}
		
		//Integer Sort array:
		int[] marks = {50, 10, 25, 1, 17, 99, 33};
		Arrays.sort(marks);
		System.out.println("The Sorted array is: ");
		for(int i:marks)
		{
			System.out.println(i);
		}
		//Find the least and max of the marks
		System.out.println("The minimum marks is " + marks[0]);
		System.out.println("The maximum marks is " + marks[marks.length-1]);
		
		
		String words = "One Two Three Four";
		System.out.println("Count of characters including spaces" + words.length());
		
		int countwords = words.trim().split("\\s").length;
		System.out.println("Count of characters without spaces" + countwords);

	}

}
