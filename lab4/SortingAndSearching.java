package lab4;

import java.util.Random;
import java.util.Scanner;

/**
 * 3 sorting and searching
 */
public class SortingAndSearching {
	// 3.1 linear search
	public static boolean linearSearch(int[] array, int key) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == key) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearchIndex(int[] array, int key) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == key) {
				return index;
			}
		}
		return -1;
	}

	// 3.2 recursive binary search
	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		int middle;
		while (fromIdx <= toIdx) {
			middle = (fromIdx + toIdx) / 2;
			if (array[middle] == key)
				return true;
			if (key > array[middle])
				fromIdx = middle + 1;
			else
				toIdx = middle - 1;
		}
		return false;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// 3.3 bubble sort
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	// 3.4 selection sort
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					swap(array, j, i);
				}
			}
		}
	}

	// 3.5 insertion sort
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; ++i) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void output(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];
		int key = sc.nextInt();

		for (int index = 0; index < 100; index++)
			array[index] = rand.nextInt(100);

		System.out.println("The array is:");
		output(array);
		System.out.println();

		if (linearSearch(array, key)) { // 3.1
			System.out.println(key + " is in the array.");
		} else {
			System.out.println(key + " is NOT in the array.");
		}
		System.out.println("The index of key in array: " + linearSearchIndex(array, key));

		if (binarySearch(array, key, 0, array.length - 1)) { // 3.2
			System.out.println(key + " is in the array.");
		} else {
			System.out.println(key + " is NOT in the array.");
		}

		bubbleSort(array); // 3.3
		System.out.println("Array after swap by bubble sort: ");
		output(array);
		System.out.println();

		selectionSort(array); // 3.4
		System.out.println("Array after swap by selection sort: ");
		output(array);
		System.out.println();

		insertionSort(array); // 3.5
		System.out.println("Array after swap by insertion sort: ");
		output(array);
	}
}