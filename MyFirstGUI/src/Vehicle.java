import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public abstract class Vehicle {

	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int direction;
	private Color color;
	
	private final static int DEFAULT_CAR_WIDTH = 60;
	public final static int DEFAULT_CAR_HEIGHT = 30;
	
	private static long counter = 0;
	
	public Vehicle(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = DEFAULT_CAR_WIDTH;
		this.height = DEFAULT_CAR_HEIGHT;
		this.direction = 1; // Car initially moving left to right
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

	public int getDirection() {
		return direction;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	public void setPos(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDirection(int direction) {
		this.direction = direction;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw(Graphics g);
	
}
