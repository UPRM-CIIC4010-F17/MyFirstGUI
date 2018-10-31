import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		
		JFrame mainFrame = new JFrame();
		
		mainFrame.setTitle("My First CIIC 4010/ICOM 4015 GUI!!!!!");
		
		int raceWidth = 1080;
		int raceHeight = 700;
		
		mainFrame.setSize(raceWidth, raceHeight);
		
		CarRace theCarRace = new CarRace(raceWidth, raceHeight);
		
		mainFrame.add(theCarRace);
		
		mainFrame.getContentPane().setBackground(Color.GRAY);
		
		mainFrame.setLocationRelativeTo(null);
		
		mainFrame.setVisible(true);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (!theCarRace.someCarWon()) {
			mainFrame.repaint();
			Thread.sleep(100);
		}
		mainFrame.repaint();		
	}

}
