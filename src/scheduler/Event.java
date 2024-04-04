package scheduler;

public class Event {
	
	private int time;
	private String desc;
	
	Event (int time, String desc) {
		this.time = time;
		this.desc = desc;
	}
	
	
	public int getTime () {
		return time;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setTime(int t) {
		time = t;
	}
	
	public void setDesc(String d) {
		desc = d;
	}
	
	public void print () {
		System.out.println(time + " - " + desc);
	}
	
	@Override
	public String toString() {
		return time + " - " + desc;
	}
	
}
