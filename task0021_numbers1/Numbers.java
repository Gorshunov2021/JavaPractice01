// Числа, которые делятся на 3 или на 9.

package task0021_numbers1;

import java.util.Scanner;

public class Numbers {
	public static void main (String[] args){
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int[]arr = new int [l];

		System.out.println("Введите числа: ");
		for (int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Вы ввели следующие числа: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print (arr[i] + " / ");
		}
		System.out.println();
		System.out.println("Числа из массива, которые деляться на 3: ");
		for (int i=0; i<arr.length; i++) {
			{double a = arr[i]%3;
				if (a==0) {
					System.out.print(arr[i] + " / ");	
				}							
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Числа из массива, которые деляться на 9: ");
		for(int i=0; i<arr.length; i++) {
			double a=arr[i]%9;
			if(a==0) {
				System.out.print(arr[i] + " / ");	
			}		
		}

		System.out.println();
		System.out.println();
		System.out.println("Числа из массива, которые деляться на 5: ");
		for(int i=0; i<arr.length; i++) {
			double a=arr[i]%5;
			if(a==0) {
				System.out.print(arr[i] + " / ");	
			}		
		}

		System.out.println();
		System.out.println();
		System.out.println("Числа из массива, которые деляться на 7: ");
		for(int i=0; i<arr.length; i++) {
			double a=arr[i]%7;
			if(a==0) {
				System.out.print(arr[i] + " / ");	
			}		
		}
	}
}