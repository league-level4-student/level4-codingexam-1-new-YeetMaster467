package scheduler;

public enum Days {
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	
	private LinkedList<Event> events = new LinkedList<Event>();
	
	public LinkedList<Event> getEvents () {
		return events;
	}
	
	public void setEvents (LinkedList<Event> e) {
		events = e;
	}
	
	public void addEvent (Event e) {
		
		Node<Event> head = events.getHead();
		while (head.getNext() != null) {
			try {
				checkEvents( head.getValue(), head.getNext().getValue() );
			} catch (SchedulingConflictException sce) {
				sce.printWarning();
				return;
			}
			head = head.getNext();
		}
		
		events.add(e);
	}
	
	public void removeEvent (int pos) {
		events.remove(pos);
	}
	
	public void printEvents () {
		Node<Event> head = events.getHead();
		while (head.getNext() != null) {
			events.getHead().getValue().print();
			head = head.getNext();
		}
	}
	
	public void checkEvents (Event e1, Event e2) throws SchedulingConflictException {
		if (e1.getTime() == e2.getTime()) {
			throw new SchedulingConflictException();
		}
	}

}
