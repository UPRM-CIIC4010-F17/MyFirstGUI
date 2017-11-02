import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {

	private int xPos;
	private int yPos;
	private int width;
	
	private final static int DEFAULT_CAR_WIDTH = 60;
	
	private static long counter = 0;
	
	public Car(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = DEFAULT_CAR_WIDTH;
		counter++;
		System.out.println("Number of objects = " + counter);
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}

	public void setPos(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void setWidth(int width) {
		this.width = width;
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
	
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		g2.draw(body);
		g2.draw(rearTire);
		g2.draw(frontTire);
	}
	
}
