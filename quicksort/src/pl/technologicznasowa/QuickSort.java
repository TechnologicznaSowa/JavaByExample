package pl.technologicznasowa;

public class QuickSort {

	public static void sort(int[] array) {
		quickSort(array, 0, array.length-1);
	}

	private static void quickSort(int[] array, int firstIndex, int lastIndex) {
		if(firstIndex < lastIndex) {
			int partitionIndex = partition(array, firstIndex, lastIndex);
			quickSort(array, firstIndex, partitionIndex-1);
			quickSort(array, partitionIndex+1, lastIndex);
		}
	}

	private static int partition(int[] array, int firstIndex, int lastIndex) {
		int pivot = array[lastIndex];
		int pIndex = firstIndex;

		for (int i = firstIndex; i < lastIndex; i++) {
			if(array[i] <= pivot) {
				swap(array, i ,pIndex);
				pIndex++;
			}
		}
		swap(array, pIndex, lastIndex);
		return pIndex;
	}

	private static void swap(int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
}
