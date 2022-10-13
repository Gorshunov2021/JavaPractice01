//Отобразить в окне консоли аргументы командной строки в обратном порядке.

package task0010_revers_sting;

import java.util.Scanner;

public class ReversSring {
	public static void main(String[] args) {
		Scanner vvot = new Scanner(System.in);

		for (int i=0; true; i++) {
			StringBuffer toll = new StringBuffer(vvot.nextLine());
			toll.reverse();
			System.out.println("Hello " + toll.toString());
			vvot.close();
		}
	}
}

