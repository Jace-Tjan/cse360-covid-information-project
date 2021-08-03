package cse360proj;
import java.awt.GridLayout;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 
import java.util.ArrayList;
import javax.swing.JPanel;
 


public class Load {

	private ArrayList<Person> ppl;
	public Load(String pathName, ArrayList<Person> person){
		ppl = person;
		String row = "";
		try {
			//reads in path
			FileReader reader = new FileReader(pathName);
			BufferedReader buffer = new BufferedReader(reader);
			int originalSize = person.size();
			int labelsAlreadyAddedFlag = 0;
			while ((row = buffer.readLine()) != null) {
				String[] info = row.split(","); //splits rows up 
				
				boolean repeat = false; //checks for repeat IDs
				for (int i = 0; i < ppl.size();i++) {
					if (info[0].equals(ppl.get(i).getID())) {
						repeat = true;
					}
				}
				if (originalSize != 0 && labelsAlreadyAddedFlag == 0) {
					repeat = true;
					labelsAlreadyAddedFlag++;
				}
				if (repeat == false) { //only add person to list of people if they have unique IDs
					Person patient = new Person(info[0], info[1], info[2], info[3], info[4], info[5]);
					ppl.add(patient);

				}
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

	
	
}
