package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;

public class U3A4D_GUI {

	private JFrame frame;

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
		btnNewButton.setBounds(297, 57, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(137, 61, 119, 14);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(137, 106, 119, 14);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(137, 131, 119, 14);
		frame.getContentPane().add(textArea_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setBounds(137, 156, 119, 14);
		frame.getContentPane().add(textArea_1_2);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setBounds(137, 181, 119, 14);
		frame.getContentPane().add(textArea_1_3);
	}
}
