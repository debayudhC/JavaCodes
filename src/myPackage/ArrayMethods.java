package myPackage;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		//compare() - compares 2 arrays:
		//returns 0 if array 1 = array 2; +ve integer if array2>Array1; -ve if Array1>Array3
		String[] cars1 = {"Volvo", "BMW", "Tesla"};
		String[] cars2 = {"Volvo", "BMW", "Tesla"};
		String[] cars3 = {"Volvo", "BMW", "Yezdi"};

		System.out.println(Arrays.compare(cars1, cars2));
		System.out.println(Arrays.compare(cars3, cars1));
		System.out.println(Arrays.compare(cars2, cars3));
		
		//equals : Find out if two arrays are equal
		//Returns true if the arrays are equal. False otherwise

		System.out.println(Arrays.equals(cars1, cars2));
		System.out.println(Arrays.equals(cars1, cars3));
		
		//Array sort Arrays.sort() function
		
		//Sort an array of strings alphabetically:
		Arrays.sort(cars1);
		for (String i:cars1)
		{
			System.out.println(i);
		}
		
		//Sort an array of numbers:
		int[] myNum = {50, 10, 25, 1, 17, 99, 33};
		Arrays.sort(myNum);
		for(int i:myNum)
		{
			System.out.println(i);
		}
		
		
		//The Arrays.copyOf() method in Java is used to create a new array by copying elements from an existing array. 
		int[] originalArr = {1, 2, 3, 4, 5};
		
		//create a copy array of same length:
		int[] copyArr = Arrays.copyOf(originalArr,originalArr.length);
		System.out.println("Original Array: " + Arrays.toString(originalArr));
        System.out.println("Copied Array: " + Arrays.toString(copyArr));
        
        //create a copied array of larger length:
        int[] copyArr1 = Arrays.copyOf(originalArr,originalArr.length+1);
        System.out.println("Copied Array of larger length: " + Arrays.toString(copyArr1));
	}

}

 