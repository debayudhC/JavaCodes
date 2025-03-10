package myPackage;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		String[] cars = { "Honda", "Toyota", "Audi", "Mercedes" };
		int[] myNum = { 10, 30, 25 };

		// get the length of any array:
		System.out.println("Length of car array is " + cars.length);
		System.out.println("Length of number array is " + myNum.length);

		// You can access an array element by referring to the index number.
		System.out.println("The first element in the car array is " + cars[0]);

		// You can access an array element by referring to the index number.
		System.out.println("The second element in the number array is " + myNum[1]);

		// update an array element. I want to change the first element of the number
		// array to 20
		// Arrays are of fixed size. We can update an element but cannot add a new
		// element or delete
		myNum[0] = 20;

		// Display all elements of an array using for loop:
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// Display all elements of an array using for-each loop; Easier implementation.
		// No need to add counters
		for (String str : cars) {
			System.out.println(str);
		}

		// Display an array without using any loop: Arrays.toString()
		// Prints array elements in a formatted string.
		// Avoids the need for manual loops to display arrays
		System.out.println("The cars array is " + Arrays.toString(cars));

		for (int val : myNum) {
			System.out.println(val);
		}
		
		System.out.println("The number array is " + Arrays.toString(myNum));

		// create an array of ages. Calculate the average;
		int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
		// get the length of the array:
		int length = ages.length;

		float avg = 0;
		float sum = 0;
		// loop through the array to get the sum of elements:

		for (int k : ages) {
			sum = sum + k;
		}
		// calculate the average
		avg = (sum / length);

		System.out.println("The average is " + avg);

		// calculate the lowest age from an array
		int ages1[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
		// Declaring an integer and assign the first element of the array to this
		// inetegr
		int smallest = ages1[0];

		for (int age : ages1) {
			if (smallest > age) {
				smallest = age;
			}

		}
		System.out.println("Smallest element of the array is " + smallest);

	}

}
