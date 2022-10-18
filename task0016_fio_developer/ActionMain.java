package task0016_fio_developer;

import static task0016_fio_developer.GetFIO.InputNAME;
import static task0016_fio_developer.GetFIO.InputSURNAME;
import static task0016_fio_developer.FinishDay.getDateOfFinishTask;
import static task0016_fio_developer.StartDay.getDateOfBeginTask;

public class ActionMain {
public static void main(String[] args) {
	InputNAME();
	InputSURNAME();
	getDateOfBeginTask();
	getDateOfFinishTask();
	}
}