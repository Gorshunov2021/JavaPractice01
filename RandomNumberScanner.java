import java.util.Scanner;

public class RandomNumberScanner {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter first diapason number: ");
		 int a = scan.nextInt();

		 System.out.print("Enter second diapason number: ");
		 int b = scan.nextInt();

		 System.out.println("Enter quantity random number");
		 int c = scan.nextInt();

		 System.out.println("Random Number: ");
		 for (int i=0; i<c; i++) {
					int x = a + (int)(Math.random() * ((b - a) + 1));
					System.out.print(x + ", ");
			  }
	}
}
