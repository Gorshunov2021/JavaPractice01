package task0008_console;

import java.io.IOException;

public class ReadCharMain {
	public static void main(String[] args) {
		int x;
		try {
			x = System.in.read();
			char r = (char)x;
			System.out.println("Character Code: " + r + " = u" + x);
		}

		catch (IOException e) {
		System.err.println("error " + e);
		}
	}
}
