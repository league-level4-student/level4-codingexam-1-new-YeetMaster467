package scheduler;

public class SchedulingConflictException extends Exception {

	public void printWarning () {
		System.out.println("Cannot have two events at the same time.");
	}

}
