package com.aatif.DS.sorting;

public class QuickSortAlgo {
	public static void main(String[] args) {
		int[] arr = { 6,7,8,1,2,3 };
		int left = 0;
		int right = arr.length-1;
		quickSort(arr, left, right);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pi = sort(arr, left, right);
			quickSort(arr, left, pi - 1);
			quickSort(arr, pi, right);
		}

	}

	private static int sort(int[] arr, int left, int right) {
		int pivot = arr[left];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
				left++;
			}

		}
		
		return left;
	}
}
