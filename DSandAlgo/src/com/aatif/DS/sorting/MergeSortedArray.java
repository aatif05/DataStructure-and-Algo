package com.aatif.DS.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MergeSortedArray {

	@Test
	public void TestingMethod() {
		// assertEquals(1, testUnit());
		int[] a = { 1, 3, 5, 6 };
		int[] b = { 2, 4, 7 };
		assertTrue(mergeSortedArrayTest(a, b));
		for (int t : a) {
			System.out.println(t);
		}
		System.out.println("Second array");
		for (int t : b) {
			System.out.println(t);
		}

	}

	public boolean mergeSortedArrayTest(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = 0;
		while (i >= 0 && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
			}
			i--;
			j++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return true;
	}

}
