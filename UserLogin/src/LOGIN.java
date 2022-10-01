import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 450, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 50));
		lblNewLabel.setBounds(54, 11, 316, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(32, 81, 98, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(32, 125, 98, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(140, 87, 213, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 134, 213, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				
				if(password.contains("world")&& username.contains("hello")) {
					textField.setText(null);
					passwordField.setText(null);
				}
				else {
					JOptionPane.showMassageDiaLog(null,"INVALTD LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
				
		
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton.setBounds(32, 203, 98, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent erg0) {
				textField.setText(null);
			}
		});
		btnReset.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnReset.setBounds(169, 203, 98, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnExit.setBounds(308, 207, 98, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 181, 414, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 64, 414, 2);
		frame.getContentPane().add(separator_1);
	}
}
