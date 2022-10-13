package task0009_helloName;

import java.util.Scanner;

public class HelloName {
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("HELLO, " + name + " !");
	}
}
