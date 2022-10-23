package task0020_bufferReader_InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task20 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name1: ");
		String name1 = reader.readLine();
		System.out.print("Enter name2: ");
		String name2 = reader.readLine();
		System.out.print("Enter name3: ");
		String name3 = reader.readLine();

		System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

	}
}
