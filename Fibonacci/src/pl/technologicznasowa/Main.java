package pl.technologicznasowa;

import static pl.technologicznasowa.Fibonacci.fibClassic;
import static pl.technologicznasowa.Fibonacci.fibRecursive;
import static pl.technologicznasowa.Fibonacci.fibStream;

public class Main {
	public static void main(String[] args) {
		int loop = 500;

		for (int k = 0; k < 4; k++) {
			long timeStartClasic = System.currentTimeMillis();
			for (int i = 1; i <= loop; i++) {
				fibClassic(i);
			}
			long timeStopClasic = System.currentTimeMillis();

			System.out.println("Clasic: "+(timeStopClasic-timeStartClasic));

			long timeStartRec= System.currentTimeMillis();
			for (int i = 1; i <= loop; i++) {
				fibRecursive(i);
			}
			long timeStopRec = System.currentTimeMillis();
			System.out.println("Rec: "+(timeStopRec-timeStartRec));

			long timeStartStream= System.currentTimeMillis();
			for (int i = 1; i <= loop; i++) {
				fibStream(i);
			}
			long timeStopStream = System.currentTimeMillis();

			System.out.println("Stream: "+(timeStopStream-timeStartStream));
			System.out.println("========================");
		}


	}
}
