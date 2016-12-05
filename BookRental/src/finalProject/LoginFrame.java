package finalProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {
	public LoginFrame() {
	}
	
	private final static JLabel lblUsername = new JLabel("Username");
	private final static JLabel lblPassword = new JLabel("Password");
	
	public static void main(String[] args) {
	
		LoginFrame.display();
	}
		public static void display() {
			
			LoginFrame loginDisplay = new LoginFrame();
			loginDisplay.setTitle("Login/Create account");
			loginDisplay.setSize(300,270);
			loginDisplay.setLocation(500,280);
			
			JButton bLogin = new JButton("Login");
			JButton btnCreateAct = new JButton("Create account");
			JPanel panel = new JPanel();
			JTextField txuser = new JTextField(15);
			JPasswordField pass = new JPasswordField(15);
			
			panel.setLayout (null); 
			txuser.setBounds(31,107,150,20);
			pass.setBounds(31,163,150,20);
			bLogin.setHorizontalAlignment(SwingConstants.LEFT);
			bLogin.setBounds(31,194,65,25);

			panel.add(bLogin);
			panel.add(txuser);
			panel.add(pass);
			loginDisplay.getContentPane().add(panel);
			
			lblUsername.setBounds(31, 82, 65, 14);
			panel.add(lblUsername);
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
			
			lblPassword.setBounds(31, 138, 65, 14);
			panel.add(lblPassword);
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
			
			btnCreateAct.setHorizontalAlignment(SwingConstants.LEFT);
			btnCreateAct.setBounds(110, 194, 124, 25);
			panel.add(btnCreateAct);
			
			JLabel lblWelcome = new JLabel("<html>     Welcome to EZBookRental, <br>Please login or create an account!</html>");
			lblWelcome.setBounds(54, 11, 217, 60);
			lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			panel.add(lblWelcome);
			loginDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			loginDisplay.setVisible(true);

	
			btnCreateAct.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent ae){
				CreateAccount ca = new CreateAccount();
				
			}});


			bLogin.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent ae) {
				String puname = txuser.getText();
				String ppaswd = pass.getText();
				if(puname.equals("test") && ppaswd.equals("12345")) {
					AccountOptionsFrame regFace =new AccountOptionsFrame();
					regFace.setVisible(true);
					
		} else {

			JOptionPane.showMessageDialog(null,"Wrong Password / Username");
			txuser.setText("");
			pass.setText("");
			txuser.requestFocus();
	}			
	} 
		}); 			
	} // end login method
	} // end public static void method