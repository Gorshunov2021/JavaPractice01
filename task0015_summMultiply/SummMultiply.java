package task0015_summMultiply;

import java.util.Scanner;

public class SummMultiply {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 for (int i=0; i<5; i++) {
			  System.out.print("Enter first number: ");
			  int x = scan.nextInt();
			  System.out.print("Enter second number: ");
			  int y = scan.nextInt();

			  System.out.println("Summ number: " + " x " + " + " + " y " + " = " + x + " + " + y + " = " + (x + y));
			  System.out.println("Multiply number: " + " x " + " * " + " y " + " = " + x + " * " + y + " = " + (x * y));
		 } 
	}
}
