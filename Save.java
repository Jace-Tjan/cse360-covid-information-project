package cse360proj;
import java.awt.Label;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Save {
	
	public Save(String pathName, ArrayList<Person> people) { 
		File newFile = new File(pathName);
		try { //write info to file
			FileWriter writer = new FileWriter(newFile);
			for (int i = 0; i < people.size(); i++) { //creates table of information
				writer.write(people.get(i).getID() + "," +
						people.get(i).getLN() + "," +
						people.get(i).getFN() + "," +
						people.get(i).getType() + "," +
						people.get(i).getDate() + "," +
						people.get(i).getLocation() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}