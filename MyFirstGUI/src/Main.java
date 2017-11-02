import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		
		JFrame mainFrame = new JFrame();
		
		mainFrame.setTitle("My First CIIC 4010/ICOM 4015 GUI!!!!!");
		
		mainFrame.setSize(400, 400);
		
		MyComponent2 theComponent = new MyComponent2();
		
		mainFrame.add(theComponent);
		
		mainFrame.setVisible(true);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			mainFrame.repaint();
			Thread.sleep(100);
		}
		
	}

}
