import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Turtle implements Raceable {
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int direction;
	private Color color;
	
	private Image image;
	
	private final int DEFAULT_TURTLE_HEIGHT = 30;
	private final int DEFAULT_TURTLE_WIDTH = 60;
	
	public Turtle(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = DEFAULT_TURTLE_WIDTH;
		this.height = DEFAULT_TURTLE_HEIGHT;
		this.direction = 1; // Car initially moving left to right
		
		File imageFile = new File("images/TurtleWithSunglassesSmall.png");
		
		try {
			image = ImageIO.read(imageFile);
		}
		catch (IOException e) {
			System.out.println("Fatal error loading image");
			System.exit(1);
		}
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
	
	public void draw(Graphics g) {
		g.drawImage(image, getXPos(), getYPos(), null);
	}

}
