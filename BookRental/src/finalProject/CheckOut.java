package finalProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class CheckOut extends JFrame {
	public static void main(String[] args) {		
	}

		JLabel welcome = new JLabel("Check Out");
		JPanel panel = new JPanel();

		CheckOut(){
		super();
		setSize(300,270);
		setLocation(500,280);
		panel.setLayout (null); 

		welcome.setBounds(31,11,232,45);
		welcome.setFont(new Font("Tahoma", Font.PLAIN, 13));


		panel.add(welcome);

		getContentPane().add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	}
	
