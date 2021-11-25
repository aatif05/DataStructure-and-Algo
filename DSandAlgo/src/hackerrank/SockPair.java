package hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class SockPair {
//Counting number of socks pair 
	@Test
	void sockMerchant() {
		assertEquals(3, sockMerchant(1, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
	}
	@Test
	void testing() {
		assertEquals(2, sockMerchant(1, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		Map<Integer, Long> countMap = ar.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		return (int) countMap.entrySet().stream().mapToLong(x -> x.getValue() / 2).sum();

	}
}
