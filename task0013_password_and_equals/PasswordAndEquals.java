// Ввести пароль из командной строки и сравнить его со строкой-образцом.

package task0013_password_and_equals;

import java.util.Scanner;

public class PasswordAndEquals {
	public static void main(String[] args) {
		String passw1 = "gorynych";

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String passw2 = scan.next();

		if (passw2.equals(passw1)) {
			System.out.println("Sample string: gorynych");
			System.out.println("Your passwords match. " + passw2 + " = " + passw1);
		} else {
			System.out.println("Sample string: gorynych");
			System.out.println("Your passwords do not match. " + passw2 + " not equal " + passw1 + " !");
		}
		scan.close();
	}
}