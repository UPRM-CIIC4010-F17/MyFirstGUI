import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class PoliceCar extends Car {
	
	private final int DEFAULT_TICKS_TO_BLINK = 1;
	private int ticksToBlink = DEFAULT_TICKS_TO_BLINK;
	
	public PoliceCar(int xPos, int yPos) {
		super(xPos, yPos);
		this.setHeight(super.getHeight()+6);
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		
		Ellipse2D.Double biombo = new Ellipse2D.Double(this.getXPos()+27, this.getYPos()-6, 6, 6);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		if (ticksToBlink == 0) {
			g2.fill(biombo);
			ticksToBlink = DEFAULT_TICKS_TO_BLINK;
		}
		else {
			g2.draw(biombo);
			ticksToBlink--;
		}
		
	}
	
	

}
