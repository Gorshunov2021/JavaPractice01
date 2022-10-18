package task0016_fio_developer;

import java.sql.Date;
import java.util.Scanner;

public class GetFIO {
	static String name;
	static String surname;
	static Date getDateOfTask;
	static Date getDateOfFinishTask;

	static String InputNAME() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name = scan.nextLine();
		return name;
	}

	static String InputSURNAME() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Surname: ");
		name = scan.nextLine();
		return surname;
	}	
}
