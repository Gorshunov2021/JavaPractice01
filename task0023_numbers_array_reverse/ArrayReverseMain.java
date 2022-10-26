package task0023_numbers_array_reverse;

import java.util.Arrays;

public class ArrayReverseMain {
	public static void main(String[] args) {

		
		int[] array1 = new int[] {};
		System.out.println(Arrays.toString(array1) + " => ");
		ArrayReverse.invert(array1);
		System.out.println(Arrays.toString(array1));

		array1 = new int [] {0, 1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(array1) + " => ");
		ArrayReverse.invert(array1);
		System.out.println(Arrays.toString(array1));

	}
}
