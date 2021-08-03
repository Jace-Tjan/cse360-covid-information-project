//package cse360proj;
import javax.swing.JPanel; 

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
public class Add extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel;

	private String id;
	private String ln;
	private String fn;
	private String vaccine;
	private String time;
	private String place;
	public Add(ArrayList<Person> people) {		
		this.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{38, 91, 265, 0, 0};
		gridBagLayout.rowHeights = new int[]{14, 40, 40, 40, 40, 55, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblUserId = new JLabel("Date: ");
		GridBagConstraints gbc_lblUserId = new GridBagConstraints();
		gbc_lblUserId.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserId.anchor = GridBagConstraints.EAST;
		gbc_lblUserId.gridx = 1;
		gbc_lblUserId.gridy = 1;
		add(lblUserId, gbc_lblUserId);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID: ");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 2;
		add(lblId, gbc_lblId);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 1;
		gbc_lblLastName.gridy = 3;
		add(lblLastName, gbc_lblLastName);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.EAST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 1;
		gbc_lblFirstName.gridy = 4;
		add(lblFirstName, gbc_lblFirstName);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblVaccineType = new JLabel("Vaccine Type: ");
		GridBagConstraints gbc_lblVaccineType = new GridBagConstraints();
		gbc_lblVaccineType.anchor = GridBagConstraints.EAST;
		gbc_lblVaccineType.insets = new Insets(0, 0, 5, 5);
		gbc_lblVaccineType.gridx = 1;
		gbc_lblVaccineType.gridy = 5;
		add(lblVaccineType, gbc_lblVaccineType);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location: ");
		GridBagConstraints gbc_lblLocation = new GridBagConstraints();
		gbc_lblLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocation.anchor = GridBagConstraints.EAST;
		gbc_lblLocation.gridx = 1;
		gbc_lblLocation.gridy = 6;
		add(lblLocation, gbc_lblLocation);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 70, 5);
		gbc_btnEnter.gridx = 2;
		gbc_btnEnter.gridy = 7;
		add(btnEnter, gbc_btnEnter);
		
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 120, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 8;
		add(lblNewLabel, gbc_lblNewLabel);
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int originalSize = people.size();
				boolean validID = true;

				id = textField_1.getText();
				ln = textField_2.getText();
				fn = textField_3.getText();
				vaccine = textField_4.getText();
				time = textField.getText();
				place = textField_5.getText();

				if (originalSize == 0) {
					Person labels = new Person("ID", "Last Name", "First Name", "Vaccine Type", "Vaccination Date", "Vaccine Location");
					people.add(labels);
				}
				
				for (int i = 0; i < id.length();i++) {
					if (!Character.isDigit(id.charAt(i))) {
						validID = false;
						lblNewLabel.setText("ID must contain only numbers!");
					}
				}
				
				if (id.length() > 5) {
					lblNewLabel.setText("ID can be only 5 digits at most!");
					validID = false;
				} else if (id.length() == 0) {
					lblNewLabel.setText("ID is required to add a new person!");
					validID = false;
				} else {
					int leadingZeroes = 5 - id.length();
					for (int i = 0; i < leadingZeroes; i++) {
						id = "0" + id;
					}
				}
				
				for(int i = 0; i < originalSize; i++) {
					if (people.get(i).getID().equals(id)) {
						validID = false;
						lblNewLabel.setText("ID entered is already used!");

					}
				}
				
				if (validID) {
					Person added = new Person(id, ln, fn, vaccine, time, place);
					people.add(added);
					lblNewLabel.setText("Success!");
				}
			}
		});
	}
}
