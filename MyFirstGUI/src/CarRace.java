import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarRace extends JComponent {
	
	Car[] cars;
	
	Random carDistanceGenerator = new Random();
	
	private final int MAX_NUM_CARS = 5;
	private final int DEFAULT_CAR_SPEED = 10; // In pixels per time slice
	private final int DEFAULT_CAR_PADDING = 10;
	
	private boolean someCarWon = false;
	private int numCars;
	
	public boolean someCarWon() {
		return someCarWon;
	}

	public CarRace(int width, int height) {
		
		// Calculate number of cars
		this.numCars = height / (Car.DEFAULT_CAR_HEIGHT + DEFAULT_CAR_PADDING);
		
		cars = new Car[numCars];
		
		int lanePosition = 0;
		
		for(int i=0; i<numCars; i++) {
			cars[i] = new Car(0, lanePosition);
			cars[i].setColor(Color.CYAN);
			lanePosition += cars[i].getHeight() + DEFAULT_CAR_PADDING;
		}
	}
	
	public void paintComponent(Graphics g) {
		
		// Draw each car
		for (int i=0; i<numCars; i++) {
			cars[i].draw(g);
		}
		
		// Move cars
		int nextDistance = 0;
		for (int i=0; i<numCars; i++) {
			nextDistance = carDistanceGenerator.nextInt(DEFAULT_CAR_SPEED);
			if ((cars[i].getXPos() + cars[i].getWidth() + nextDistance) >= this.getWidth()) {
				nextDistance -= (cars[i].getXPos() + cars[i].getWidth() + nextDistance) - this.getWidth();
				this.someCarWon = true;
				cars[i].setColor(Color.orange);
			}
			cars[i].setPos(cars[i].getXPos() + nextDistance, cars[i].getYPos());
		}

	}
	
	
}
