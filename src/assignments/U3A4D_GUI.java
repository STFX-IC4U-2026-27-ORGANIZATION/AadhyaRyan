package assignments;
import assignments.U3A4D_SearchApplication;
import assignments.U3A4D_UnsortedSearch;
import assignments.U3A4DLoadFile;
import assignments.Wizard;
import java.io.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class U3A4D_GUI {
	
	Wizard[] wizardList = U3A4DLoadFile.loadWizardsFromFile("src//Wizards.txt");


	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4D_GUI window = new U3A4D_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public U3A4D_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Harry Potter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(163, 11, 140, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Criteria:");
		lblNewLabel_1.setBounds(38, 59, 91, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("House Type:");
		lblNewLabel_2.setBounds(38, 106, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Blood Type:");
		lblNewLabel_3.setBounds(38, 131, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Wand Type:");
		lblNewLabel_4.setBounds(38, 156, 74, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Lineage:");
		lblNewLabel_5.setBounds(38, 181, 64, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String searchPattern = textField.getText();

				if (searchPattern.equalsIgnoreCase("")) {
					return;
				}

				int index = U3A4D_UnsortedSearch.searchHouse(wizardList, searchPattern, 0);

				if (index == -1) {
					index = U3A4D_UnsortedSearch.searchBlood(wizardList, searchPattern, 0);
				}
				if (index == -1) {
					index = U3A4D_UnsortedSearch.searchWand(wizardList, searchPattern, 0);
				}
				if (index == -1) {
					index = U3A4D_UnsortedSearch.searchLineage(wizardList, searchPattern, 0);
				}

				if (index != -1) {
					Wizard w = wizardList[index];
					textField_1.setText(w.getHouse()); 
					textField_2.setText(w.getBlood());
					textField_3.setText(w.getWand());
					textField_4.setText(w.getLineage());
				} 
				else {
					textField_1.setText("Not Found");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
				} 
			} 
		});
		btnNewButton.setBounds(297, 57, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(126, 58, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 103, 119, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 128, 119, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 153, 119, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 178, 119, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
