package myPackage;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {

		// Take the number inputs from user
		Scanner scanner = new Scanner(System.in);

		// need to define the size of the array. The size too will be keyboard input
		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();

		// take input from keyboard and create an array of these:
		int[] numArr = new int[size];

		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < size; i++) {
			numArr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("The entered array is " + Arrays.toString(numArr));

		// call function sortArray
		int[] sortedArr = sortArray(numArr);
		System.out.println("The sorted array is " + Arrays.toString(sortedArr));
	}

	public static int[] sortArray(int[] arr) {

		int[] copyArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyArr);

		return copyArr;
	}

}
