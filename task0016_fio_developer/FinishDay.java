package task0016_fio_developer;
import java.util.Date;


public class FinishDay {
	public static Date getDateOfFinishTask () {
	Date getDateOfFinishTask = new Date();
	Long time = getDateOfFinishTask.getTime();
	long anotherDate = +7;
	time = time + (anotherDate * 24 * 60 * 60 * 1000);
	getDateOfFinishTask = new Date(time);
	System.out.println("Date Of Finish Task: " + getDateOfFinishTask);
	return getDateOfFinishTask;
	}
}
