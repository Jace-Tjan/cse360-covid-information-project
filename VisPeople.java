//package cse360proj;

public class VisPeople {
	private String type;
	private int count;
	
	public VisPeople() {
		count = 0;
		type = "";
	}
	
	public void addType(String in) {
		type = in;
	}
	
	public void addCount() {
		count += 1;
	}
	
	public String getType() {
		return type;
	}
	
	public int getCount() {
		return count;
	}
}
