package com.mahesh.sort;

/**
 * Bubble Sort is a simple sorting algorithm which is used to sort a given set
 * of n elements provided in form of an array. Bubble Sort compares all elements
 * one by one and sort them based on their values.
 * 
 * @category
 * Time Complexity: 
 * In Bubble Sort, n-1 comparisons will be done in the 1st
 * pass, n-2 in 2nd pass, n-3 in 3rd pass and so on. So the total number of
 * comparisons will be, (n-1) + (n-2) + (n-3)+ ..... + 3 + 2 + 1 Sum = n(n-1)/2
 * i.e O(n^2)
 * 
 * @category
 * Space Complexity: 
 * The space complexity for Bubble Sort is O(1), because only
 * a single additional memory space is required i.e. for temp variable.
 * 
 * @author mahesh
 *
 */
public class BubbleSort {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSort.sort(arr);
		System.out.println("Sorted array");
		bubbleSort.printArray(arr);
	}
}