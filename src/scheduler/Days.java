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
		
		if (head != null) {
			while (head != null) {
				try {
					checkEvents( head , new Node<Event>(e) );
				} catch (SchedulingConflictException sce) {
					sce.printWarning();
					return;
				}
				head = head.getNext();
			}
		}
		
		events.add(e);
	}
	
	public void removeEvent (int pos) {
		events.remove(pos);
	}
	
	public void printEvents () {
		Node<Event> head = events.getHead();
		while (head != null) {
			head.getValue().print();
			head = head.getNext();
		}
	}
	
	public void checkEvents (Node<Event> e1, Node<Event> e2) throws SchedulingConflictException {
		if (e1 == null || e2 == null) {
			return;
		}
		if (e1.getValue().getTime() == e2.getValue().getTime()) {
			throw new SchedulingConflictException();
		}
	}
	
	public boolean eventsEmpty () {
		Node<Event> head = events.getHead();
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

}
