import sort.InsertionSort;

/*
 * Created on 24 oct. 2004
 *
 */

/**
 * @author baudon
 * 
 */
public class TestSort {

	public static void printArray(Object [] a) {
		for (Object o : a) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		InsertionSort.doSort(args);
		printArray(args);
	}

}
