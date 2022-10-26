//Отсортированные числа в порядке возрастания и убывания.
package task0023_numbers_array_reverse;

public class ArrayReverse {
	public static void invert(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length-i-1] = tmp;
		}
	}
}
