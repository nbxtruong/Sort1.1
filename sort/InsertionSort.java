package sort;
import java.lang.Comparable;

public class InsertionSort {

	private static <T extends Comparable<? super T>> void insert(int i, T[] data) {
		if (i < data.length - 1) {
			if (data[i].compareTo(data[i + 1]) > 0) {
				T tmp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = tmp;
				insert(i + 1, data);
			}
		}
	}

	public static <T extends Comparable<? super T>> void doSort(T[] a) {
		for (int i = a.length - 2; i >= 0; --i) {
			insert(i, a);
		}
	}
}
