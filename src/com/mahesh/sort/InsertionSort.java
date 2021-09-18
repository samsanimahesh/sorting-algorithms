package com.mahesh.sort;

/**
 * Insertion sort is the simple sorting algorithm which is commonly used in the
 * daily lives while ordering a deck of cards. In this algorithm, we insert each
 * element onto its proper place in the sorted array.
 * 
 * @category
 * Time Complexity: 
 * Worst case is : O(n^2) 
 * Best case is : O(n)
 * 
 * @category
 * Space Complexity: 
 * The space complexity for Bubble Sort is O(1), because only
 * a single additional memory space is required i.e. for temp variable.
 * 
 * @author Mahesh
 *
 */
public class InsertionSort {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}
}
