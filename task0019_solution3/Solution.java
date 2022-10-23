//Вывести через BufferReader и StreamReader  - Коля получает 3000 через 5 лет.
package task0019_solution3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		String name = reader.readLine();
		System.out.print("Enter amount money: ");
		String money = reader.readLine();
		System.out.print("Enter year: ");
		String year = reader.readLine();

		System.out.println(name + " будет получать " + money + " $ " + " через " + year + " лет.");

	}
}
