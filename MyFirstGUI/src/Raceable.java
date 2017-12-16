import java.awt.Color;
import java.awt.Graphics;

public interface Raceable {

	public int getXPos();
	public int getYPos();
	public int getWidth();
	public int getDirection();
	public int getHeight();
	public Color getColor();
	public void setPos(int xPos, int yPos);
	public void setWidth(int width);
	public void setDirection(int direction);
	public void setHeight(int height);
	public void setColor(Color color);
	public void draw(Graphics g);
	
}
