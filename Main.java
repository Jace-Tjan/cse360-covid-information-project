//package cse360proj;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;

import javax.swing.filechooser.*;

public class Main
{
	
	private JFrame frame;
	
	//can be used across all classes as long as you use it as a parameter for constructor
	private ArrayList<Person> people = new ArrayList<Person>();

	
	//Launch the application.
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				
				try {
					Main window = new Main();
					window.frame.setSize(1100, 600);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application.
	public Main() 
	{
		initialize();
	}

	
	 //Initialize the contents of the frame. 
	private void initialize() 
	{
		frame = new JFrame(); //create frame
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set so that the window will exit when exit is pressed
		frame.getContentPane().setLayout(null); 
		
		//setting up the buttons
		JButton loadButton = new JButton("Load Data");
		loadButton.setBounds(21, 74, 125, 29);
		frame.getContentPane().add(loadButton);
		
		JButton saveButton = new JButton("Save Data");
		saveButton.setBounds(21, 115, 125, 29);
		frame.getContentPane().add(saveButton);
		
		JButton addButton = new JButton("Add Data");
		addButton.setBounds(24, 157, 122, 29);
		frame.getContentPane().add(addButton);
		
		JButton visButton = new JButton("Visualize Data");
		visButton.setBounds(24, 198, 122, 29);
		frame.getContentPane().add(visButton);
		
		JButton abtButton = new JButton("About");
		abtButton.setBounds(21, 29, 117, 29);
		frame.getContentPane().add(abtButton);
		
		
		//initialize main panel with card layout
		JPanel mainpanel = new JPanel();
		mainpanel.setBounds(151, 29, 900, 500);
		//mainpanel.setBounds(146, 17, 1200, 600);
		frame.getContentPane().add(mainpanel);
		mainpanel.setLayout(new CardLayout(0, 0));
		
		//set up about panel
		JPanel abtpanel = new JPanel();
		abtpanel.setBackground(Color.WHITE);
		mainpanel.add(abtpanel, "About panel");
		
	
		JTextArea txtrGroup = new JTextArea();
		txtrGroup.setText("Group 16 Team Members\n\nJace Tjan\n\nDelena Hoang\n\nSamantha Turnage \n\nManjot Bains");
		txtrGroup.setBackground(Color.WHITE);
		abtpanel.add(txtrGroup);

		
		
		//set up load panel
		JPanel loadpanel = new JPanel();
		loadpanel.setBackground(Color.WHITE);
		mainpanel.add(loadpanel, "Load Panel");
		
		//set up save panel
		JPanel savepanel = new JPanel();
		savepanel.setBackground(Color.WHITE);
		mainpanel.add(savepanel, "save");
		
		//New changes for people to see what I thought might work for each individual panel.
		//takes from the Add class I made. In the code below
		
		
		//set up add panel
		//JPanel addpanel = new JPanel();
		Add addpanel = new Add(people);
		//addpanel.setBackground(Color.gray);
		mainpanel.add(addpanel, "add");
		
		//set up visualize panel
		Visualize vispanel = new Visualize(people);
		//vispanel.setBackground(Color.cyan);
		mainpanel.add(vispanel, "visualize");
		
		
		
	        
		//add action listener for about button
		abtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout layout = (CardLayout)(mainpanel.getLayout());
			        layout.show(mainpanel,"About panel"); //specify which panel to jump to
			}
		});
		
		//add action listener for load button
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout layout = (CardLayout)(mainpanel.getLayout());
			        layout.show(mainpanel,"Load Panel"); //specify to show load panel
			   
			        //lets user pick file path
			        JFileChooser choice = new JFileChooser();
			        
			        //filters to only show csv files
			        choice.setAcceptAllFileFilterUsed(false);
			        FileNameExtensionFilter restrictions = new FileNameExtensionFilter("Only .csv files", "csv");
			        choice.addChoosableFileFilter(restrictions);
			        
			        int select = choice.showOpenDialog(null);
			        String path = "";
			        if (select == JFileChooser.APPROVE_OPTION) {
			        	path = choice.getSelectedFile().getAbsolutePath();
			        }
			        
			        //shows table of information
			        Load loading = new Load(path, people);
			        JPanel dataPanel = new JPanel();
			        GridLayout grid = new GridLayout(people.size(),people.size()*6);
					dataPanel.setLayout(grid);
					
					for (int i = 0; i < people.size(); i++) { //creates table of information
						dataPanel.add(new Label(people.get(i).getID()));
						dataPanel.add(new Label(people.get(i).getLN()));
						dataPanel.add(new Label(people.get(i).getFN()));
						dataPanel.add(new Label(people.get(i).getType()));
						dataPanel.add(new Label(people.get(i).getDate()));
						dataPanel.add(new Label(people.get(i).getLocation()));
					}
					

					JScrollPane scroll = new JScrollPane(dataPanel);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			        mainpanel.add(scroll, "scroll");
			        layout.show(mainpanel,"scroll");
			}
		});
		
		//add action listener for save button
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout layout = (CardLayout)(mainpanel.getLayout());
			        layout.show(mainpanel, "save"); //specify to show save panel
			        
			      //lets user pick file path
			        JFileChooser choice = new JFileChooser();
			        int select = choice.showSaveDialog(null);
			        String path = "";
			        if (select == JFileChooser.APPROVE_OPTION) {
			        	path = choice.getSelectedFile().getAbsolutePath();
			        }
			        
			        //saves
			        Save saving = new Save(path, people);
			}
		});
		
		//add action listener for add button
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout layout = (CardLayout)(mainpanel.getLayout());
			        layout.show(mainpanel, "add"); //specify  to show add panel
			}
		});
		
		//add action listener for visualize button
		visButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout layout = (CardLayout)(mainpanel.getLayout());
			        layout.show(mainpanel, "visualize"); //specify to show visualize panel
			}
		});
		
	}
	
		public void actionPerformed(ActionEvent e) {
		}
	}
