package task0014_password_and_equals2;

import java.util.Scanner;

public class ComparePassword {
	static String password = "12345";
	static String yourPassword;
	static String ImputYourPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter password: ");
		yourPassword = scan.nextLine();
		System.out.println("Your Password: " + yourPassword);
		return yourPassword;
	}

static void ComparePassword() {
	if (password.equals(yourPassword)) {
		System.out.println("Your Password Is TRUE");
	} else
	System.out.println("Your Password Is FALSE");
}
public static void main(String[] args) {
	ImputYourPassword();
	ComparePassword();
}
}
