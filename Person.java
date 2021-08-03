package cse360proj;
public class Person {
	private String ID;
	private String lastName;
	private String firstName;
	private String type;
	private String date;
	private String location;
	
	public Person(String id, String ln, String fn, String vaccine,  String time, String place) { //sets up details
		ID = id;
		lastName = ln;
		firstName = fn;
		type = vaccine;
		date = time;
		location = place;
	}
	
	//accessor methods
	public String getID() { 
		return ID;
	}
	
	public String getLN() {
		return lastName;
	}
	
	public String getFN() {
		return firstName;
	}
	
	public String getType() { 
		return type;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getLocation() {
		return location;
	}
}
