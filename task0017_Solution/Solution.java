package task0017_Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter name: ");
			  String name = reader.readLine();
			  System.out.println("Enter age: ");
			  String sAge = reader.readLine();
			  int nAge = Integer.parseInt(sAge);
		 System.out.println("Через " + nAge + " лет " +
		 name + " захватит мир.");
					System.out.println("Ха-ха-ха!");
	}
}
