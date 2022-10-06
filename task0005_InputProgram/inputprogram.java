package task0005_InputProgram;

import java.util.Scanner;

public class inputprogram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstname = input.next();

		System.out.println("Enter your last name: ");
		String lastname = input.next();

		System.out.println("Your full name is " + firstname + " " + lastname);
	}
}