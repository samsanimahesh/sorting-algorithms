package com.mahesh.sort;

/**
 * Selection sort is conceptually the most simplest sorting algorithm. This
 * algorithm will first find the smallest element in the array and swap it with
 * the element in the first position, then it will find the second smallest
 * element and swap it with the element in the second position, and it will keep
 * on doing this until the entire array is sorted.
 * <br>
 * It is called selection sort because it repeatedly selects the next-smallest
 * element and swaps it into the right place.
 * 
 * 
 * <br><br>
 * <b>Time Complexity:</b><br>
 * 	Worst Case: O(n^2) <br>
 * 	Best Case: O(n^2)
 * 
 * 
 * <br><br>
 * <b>Space Complexity:</b><br>
 * 	Space complexity is O(1)
 * 
 * @author mahesh
 *
 */
public class SelectionSort {
	void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}