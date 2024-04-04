package scheduler;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {

	static Days[] days = new Days[7];

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			days[i] = Days.values()[i];
		}
		start();
	}

	static void start() {
		Scanner s = new Scanner(System.in);
		System.out.println("-- WEEK SCHEDULER --\n\n1. Add an event\n2. Remove an event\n3. View events\n4. Quit Program");

		int optionChosen = s.nextInt();

		if (optionChosen == 1) {
			System.out.println(
					"\nWhich day?\n\n1. Sunday\n2. Monday\n3. Tuesday\n4. Wednesday\n5. Thursday\n6. Friday\n7. Saturday\n");
			optionChosen = s.nextInt();
			System.out.println("\n");
			addEvent(optionChosen - 1);
		} else if (optionChosen == 2) {
			System.out.println(
					"\nWhich day?\n\n1. Sunday\n2. Monday\n3. Tuesday\n4. Wednesday\n5. Thursday\n6. Friday\n7. Saturday\n");
			optionChosen = s.nextInt();
			System.out.println("\n");
			removeEvent(optionChosen);
		} else if (optionChosen == 3) {
			// will do later
		} else if (optionChosen == 4) {
			s.close();
			System.exit(0);
		}
		
		start();
	}

	static void addEvent(int dayNum) {
		Scanner s = new Scanner(System.in);
		System.out.println("\nWhat time? (Enter in the hour of the day.)");
		int time = s.nextInt();
		System.out.println("\nWrite a short description of what is happening at the event.");
		String desc = s.nextLine();
		try {
			days[dayNum].addEvent(new Event(time, desc));
			System.out.println("\nEvent added succesfully.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nInvalid day.");
		}
		
		//s.close();
	}
	
	static void removeEvent (int dayNum) {
		Scanner s = new Scanner(System.in);
		Node<Event> head = days[dayNum].getEvents().getHead();
		if (head != null) {
			int i = 1;
			while (head.getNext() != null) {
				System.out.println(i + ". " + head.getValue().toString());
				head = head.getNext();
			}
			int optionPicked = s.nextInt();
			days[dayNum].removeEvent(optionPicked);
			System.out.println("Event removed.");
		} else {
			System.out.println("Nothing to remove.");
		}
		
		//s.close();
	}

}
