package finalProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class AccountOptionsFrame extends JFrame {
	
	public static void main(String[] args) {
	}
		JLabel welcome = new JLabel("Welcome to our book rental database!");
		JButton btnAccountInformation = new JButton("Account information");
		JButton btnBookList = new JButton("Book list");
		JButton btnCheckOut = new JButton("Check Out");
		JPanel panel = new JPanel();

		AccountOptionsFrame(){
		super("Welcome");
		setSize(300,201);
		setLocation(500,280);
		panel.setLayout (null); 

		welcome.setBounds(31,11,232,45);
		welcome.setFont(new Font("Tahoma", Font.PLAIN, 13));


		panel.add(welcome);

		getContentPane().add(panel);
		btnAccountInformation.setBounds(73, 60, 157, 23);
		panel.add(btnAccountInformation);
		btnBookList.setBounds(87, 94, 129, 23);
		panel.add(btnBookList);
		btnCheckOut.setBounds(87, 128, 129, 23);
		panel.add(btnCheckOut);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btnAccountInformation.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent ae){
			AccountInformation ai = new AccountInformation();
		}}); // end of accountOptionsFrame components added
		
		btnBookList.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae){
				BookList bl = new BookList();
			}}); // end of bookList components added
		
		btnCheckOut.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae){
				CheckOut co = new CheckOut();
			}}); // end of checkOut components added
		
		}
} // end of class


