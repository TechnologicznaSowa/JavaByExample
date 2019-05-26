package pl.technologicznasowa;

import static pl.technologicznasowa.Fibonacci.fibClassic;
import static pl.technologicznasowa.Fibonacci.fibRecursive;
import static pl.technologicznasowa.Fibonacci.fibStream;

public class Main {
	public static void main(String[] args) {
		int fibNumber = 45;

		for (int i = 0; i < 4; i++) {
			calculateFibClassic(fibNumber);
			calculateFibRecursive(fibNumber);
			calculateFibStream(fibNumber);
			System.out.println("========================");
		}
	}

	private static void calculateFibStream(int fibNumber) {
		long startTime= System.currentTimeMillis();
		fibStream(fibNumber);
		long stopTime = System.currentTimeMillis();
		System.out.println("Stream: "+(stopTime-startTime));
	}

	private static void calculateFibRecursive(int fibNumber) {
		long starTime= System.currentTimeMillis();
		fibRecursive(fibNumber);
		long stopTime = System.currentTimeMillis();
		System.out.println("Rec: "+(stopTime-starTime));
	}

	private static void calculateFibClassic(int fibNumber) {
		long starTime = System.currentTimeMillis();
		fibClassic(fibNumber);
		long stopTime = System.currentTimeMillis();
		System.out.println("Classic: "+(stopTime-starTime));
	}
}
