// Определить Четные и нечетные числа.

package task0022_numbers2_chet_nechet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		System.out.println("Enter count numbers Massive: ");
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int[] arr = new int [L];

		System.out.println("Enter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("You enter next number: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print (arr[i] + ", ");
			
		}

		System.out.println();
		System.out.println("Четные числа: ");
		for (int i=0; i<arr.length; i++) {
			double a = arr[i]%2;
				if (a==0) {
					System.out.print(arr[i] + ", ");	
				}	
		}

		System.out.println();
		System.out.println("Нечетные числа: ");
		for (int i=0; i<arr.length; i++) {
			double a = arr[i]%2;
				if (a!=0) {
					System.out.print(arr[i] + ", ");	
				}	
		}


		//Наибольшее и наименьшее число.
		System.out.println();
		int max = arr[0], min = arr[0];

		for(int i = 0; i < arr.length; i++) {
			 if(arr[i] > max) 
				  max = arr[i];

			 if(arr[i] < min) 
				  min = arr[i];
		}
		System.out.println("Максимальное число: " + max);
		System.out.println("Минимальное число: " + min);

		//Отсортированные числа в порядке возрастания и убывания.
		System.out.println("Отсортированные числа в порядке возрастания: ");
		Arrays.sort(arr);
		for (int s : arr) {
			System.out.print(s + ", ");
		}


		System.out.println();
		int[] sortedDesc = Arrays.stream(arr)            // или использовать, IntStream.of(arr)
		.boxed()
		.sorted(Collections.reverseOrder())
		.mapToInt(Integer::intValue)
		.toArray();
		System.out.println(Arrays.toString(sortedDesc));
	}
}