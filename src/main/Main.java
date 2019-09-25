package main;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
	
	public void paintComponent (Graphics g) {
		// Call parent constructor
		super.paintComponent(g);
	}

	public static void main(String[] args) {
		// This is the access point to create and draw a new tree object
		JFrame frame = new JFrame("Tree Tester");
		frame.getContentPane().add(new Main());
		frame.setSize(1000, 1000);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
