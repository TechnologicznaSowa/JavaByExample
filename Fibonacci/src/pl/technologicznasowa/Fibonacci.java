package pl.technologicznasowa;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

	public static long fibClassic(int n) {
		long x1 = 1;
		long x2 = 1;
		for (int i = 2; i < n; i++) {
			long temp = x1 + x2;
			x1 = x2;
			x2 = temp;
		}
		return x2;
	}

	public static long fibRecursive(int n) {
		if(n <= 1) return n;
		return fibRecursive(n-2)+fibRecursive(n-1);
	}

	public static long fibStream(int n) {
		return Stream.iterate(new int[]{1,1}, x -> new int[]{x[1], x[0]+x[1]})
				.limit(n)
				.map(x->x[0])
				.collect(Collectors.toList())
				.get(n-1);
	}
}
