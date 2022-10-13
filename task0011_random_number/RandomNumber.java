//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

package task0011_random_number;

public class RandomNumber {
	public static void main(String[] args) {
		int a=0; // Начальное значение диапазона - "от"
		int b=100; // Конечное значение диапазона - "до"

		for (int i=0; i<5; i++) {
			int x= a + (int)(Math.random() * ((b - a) + 1));
			System.out.println("Случайное число x: " + x);
		}

		for (int i=0; i<5; i++) {
			int x= a + (int)(Math.random() * ((b - a) + 1));
			System.out.print("|" + x + "|");
		}
	}
}
