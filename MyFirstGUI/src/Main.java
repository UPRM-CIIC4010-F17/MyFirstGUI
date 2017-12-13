import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		
		JFrame mainFrame = new JFrame();
		
		mainFrame.setTitle("My First CIIC 4010/ICOM 4015 GUI!!!!!");
		
		int raceWidth = 800;
		int raceHeight = 600;
		
		mainFrame.setSize(raceWidth, raceHeight);
		
		CarRace theCarRace = new CarRace(raceWidth, raceHeight);
		
		mainFrame.add(theCarRace);
		
		mainFrame.setVisible(true);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (!theCarRace.someCarWon()) {
			mainFrame.repaint();
			Thread.sleep(100);
		}
		mainFrame.repaint();		
	}

}
