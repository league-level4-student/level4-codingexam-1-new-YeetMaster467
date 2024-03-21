package scheduler;

public class Event {
	
	private Days day;
	private int time;
	private String desc;
	
	Event (Days day, int time, String desc) {
		this.day = day;
		this.time = time;
		this.desc = desc;
	}
	
	public Days getDay () {
		return day;
	}
	
	public int getTime () {
		return time;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDay(Days d) {
		day = d;
	}
	
	public void setTime(int t) {
		time = t;
	}
	
	public void setDesc(String d) {
		desc = d;
	}
	
}
