package foobar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindUniqFromTwoArray {

	@Test
	public void testFindUniqueFromTwoArray() {
		int[] x = { 14, 27, 1, 4, 2, 58, 3, 1 };
		int[] y = { 2, 4, -4, 3, 1, 1, 14, 27, 58 };
		
		assertEquals(-4, solution(x, y));
		
	}
	public static int solution(int[] x, int[] y) {
		int num = 0;
		for (int i = 0; i < x.length; i++) {
			num = num ^ x[i];
		}
		for (int i = 0; i < y.length; i++) {
			num = num ^ y[i];
		}
		return num;
	}

}
