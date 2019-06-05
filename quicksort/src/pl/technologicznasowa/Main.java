package pl.technologicznasowa;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = {7,2,1,6,8,5,3,4};
		QuickSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
