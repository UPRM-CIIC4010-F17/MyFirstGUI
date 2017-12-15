import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car extends Vehicle {
	
	private final static int DEFAULT_CAR_WIDTH = 60;
	public final static int DEFAULT_CAR_HEIGHT = 30;
	
	private static long counter = 0;
	
	public Car(int xPos, int yPos) {
		super(xPos, yPos);
	}
	

	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		//Rectangle box = new Rectangle(0,0, 50, 50);
		//g2.draw(box);
		
		Line2D.Double rearWindow = new Line2D.Double(this.getXPos()+10, this.getYPos()+10, this.getXPos()+20, this.getYPos()+0);
		Line2D.Double roof = new Line2D.Double(this.getXPos()+20, this.getYPos()+0, this.getXPos()+40, this.getYPos()+0);
		Line2D.Double frontWindow = new Line2D.Double(this.getXPos()+40, this.getYPos()+0, this.getXPos()+50, this.getYPos()+10);
		Rectangle body = new Rectangle(this.getXPos()+0,this.getYPos()+10,60,10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(this.getXPos()+10, this.getYPos()+20, 10, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.getXPos()+40, this.getYPos()+20, 10, 10);

		Ellipse2D.Double redLight;
		Ellipse2D.Double yellowLight;
		
		if (this.getDirection() > 0) {
			redLight = new Ellipse2D.Double(this.getXPos()+0, this.getYPos()+10, 5, 5);
			yellowLight = new Ellipse2D.Double(this.getXPos()+55, this.getYPos()+10, 5, 5);
		}
		else {
			yellowLight = new Ellipse2D.Double(this.getXPos()+0, this.getYPos()+10, 5, 5);
			redLight = new Ellipse2D.Double(this.getXPos()+55, this.getYPos()+10, 5, 5);
		}
	
		g2.setColor(Color.BLACK);
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		
		g2.setColor(this.getColor());
		g2.fill(body);
		
		g2.setColor(Color.BLACK);
		g2.fill(rearTire);
		g2.fill(frontTire);
		
		g2.setColor(Color.RED);
		g2.fill(redLight);
		
		g2.setColor(Color.yellow);
		g2.fill(yellowLight);
		
		
	}
	
}
