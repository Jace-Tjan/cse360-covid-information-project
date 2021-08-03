//package cse360proj;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Visualize extends JPanel{
	
	private ArrayList<VisPeople> info = new ArrayList<VisPeople>();
	private ArrayList<VisLoc> info1 = new ArrayList<VisLoc>();
	
	public Visualize(ArrayList<Person> people) {
		
		JButton btnUpdate = new JButton("Click here to Display Charts");
		add(btnUpdate);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//section to deal with type
				for(int i = 1; i < (people.size()); i++) {
					Person temp = people.get(i);
					if(info.size() == 0) {
						VisPeople person = new VisPeople();
						person.addType(temp.getType());
						person.addCount();
						info.add(person);
					}else {
						boolean ssf = false;
						for(int m = 0; m < (info.size()); m++) {
							if(info.get(m).getType().equals(temp.getType())) {
								info.get(m).addCount(); //adds 1 to the type.
								ssf = true;
							}
						}
						if(ssf == false) { //if no type matches.
							VisPeople person1 = new VisPeople();
							person1.addType(temp.getType());
							person1.addCount();
							info.add(person1);
						}
					}//end else
				}//end of for
				
				//section to deal with location
				for(int i = 1; i < (people.size()); i++) {
					Person temp = people.get(i);
					if(info1.size() == 0) {
						VisLoc person2 = new VisLoc();
						person2.addLoc(temp.getLocation());
						person2.addCount();
						info1.add(person2);
					}else {
						boolean ssf = false;
						for(int m = 0; m < (info1.size()); m++) {
							if(info1.get(m).getLoc().equals(temp.getLocation())) {
								info1.get(m).addCount(); //adds 1 to the type.
								ssf = true;
							}
						}
						if(ssf == false) { //if no type matches.
							VisLoc person3 = new VisLoc();
							person3.addLoc(temp.getLocation());
							person3.addCount();
							info1.add(person3);
						}
					}//end else
				}//end of for

				//Code for charts
				//for the type
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				for(int i = 0; i < info.size(); i++) {
					dataset.setValue(info.get(i).getCount(), "Number of Vaccines", info.get(i).getType());
				}
				
				JFreeChart chart = ChartFactory.createBarChart("Vaccine Type Information", "Vaccine Type", "Number of Vaccines Administered", dataset, PlotOrientation.VERTICAL, false, true, false);
				CategoryPlot p = chart.getCategoryPlot();
				p.setRangeGridlinePaint(Color.black);
				ChartFrame frame = new ChartFrame("Vaccine Bar Chart", chart);
				frame.setVisible(true);
				frame.setSize(600,600);
				
				//for the location
				DefaultPieDataset  piedata = new DefaultPieDataset();
				for(int i = 0; i < info1.size(); i++) {
					piedata.setValue(info1.get(i).getLoc(), info1.get(i).getCount());
				}
				JFreeChart chart1 = ChartFactory.createPieChart("Location of Vaccines Administered", piedata, true, true, false);
				ChartFrame frame1 = new ChartFrame("Location Pie chart", chart1);
				frame1.setVisible(true);
				frame1.setSize(550,550);
				
			}//end of action performed
		});//end of action listener
	}
	
}
