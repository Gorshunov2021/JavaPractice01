package task0023_numbers_array_reverse;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseMain {
	public static void main(String[] args) {
		System.out.println("Enter count numbers Massive: ");
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int[] arr = new int [L];

		System.out.println("Enter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		ArrayReverse.invert(arr);
		System.out.println(Arrays.toString(arr));
	}
}
