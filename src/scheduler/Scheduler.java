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
	
	
	Days[] days = new Days[7];
		
    public static void main(String[] args) {
    	start();
    }
    
    static void start () {
    	Scanner s = new Scanner(System.in);
    	System.out.println("-- WEEK SCHEDULER --\n\n1. Add an event\n2. Remove an event\n3. View events");
    	
    	int optionChosen = s.nextInt();
    	
    	if (optionChosen == 1) {
    		System.out.println("\nWhich day?\n\n1. Sunday\n2. Monday\n3. Tuesday\n4. Wednesday\n5. Thursday\n6. Friday\n7. Saturday\n");
    		optionChosen = s.nextInt();
    		System.out.println("\n");
    		switch (optionChosen) {
    		case 1:
    			
    		}
    	}
    }
    
    void addEvent (Scanner s) {
    	System.out.println("\nWhat time? (Enter in the ");
    }
    
}
