import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

	Car topLeftCar = new Car(0,0);
	Car bottomRightCar = new Car(0,0);
	Car theCar = new Car(0,0);

	private static Random rand = new Random();

	public void paintComponent(Graphics g) {
		//Car topLeftCar = new Car(0,0);
		//topLeftCar.setPos(0, 0);
		//topLeftCar.draw(g);
		//Car bottomRightCar = new Car(this.getWidth()-60,this.getHeight()-30);
		//bottomRightCar.setPos(this.getWidth()-60, this.getHeight()-30);
		//bottomRightCar.draw(g);
		int nextX = theCar.getXPos();
		int nextY = theCar.getYPos();
		if (theCar.getXPos() + theCar.getWidth() + 5 <= this.getWidth()) {
			nextX += 5;
		}
		else if (theCar.getXPos() + theCar.getWidth() == this.getWidth()) {
			nextY += 40;
			nextX = 0;
		}
		else {
			// the car would go beyond the edge
			nextX += this.getWidth() - (theCar.getXPos() + theCar.getWidth());
		}
		theCar.setPos(nextX, nextY);
		theCar.draw(g);
	}
}
