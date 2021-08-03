//package cse360proj;

public class VisLoc {
	private String loc;
	private int count;
	public VisLoc() {
		loc = "";
		count = 0;
	}
	
	public void addLoc(String in) {
		loc = in;
	}
	
	public void addCount() {
		count += 1;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public int getCount() {
		return count;
	}
}
