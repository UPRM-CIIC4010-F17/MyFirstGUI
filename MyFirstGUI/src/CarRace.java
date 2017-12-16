import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarRace extends JComponent {
	
	Raceable[] raceables;
	
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
		
		raceables = new Raceable[numCars];
		
		int lanePosition = 7;
		
		for(int i=0; i<numCars; i++) {
			if (i%4 == 0) {
				raceables[i] = new Truck(0, lanePosition);
			}
			else if (i%4 == 1) {
				raceables[i] = new Car(0, lanePosition);
			}
			else if (i%4 == 2) {
				raceables[i] = new Turtle(0, lanePosition);
			}
			else {
				raceables[i] = new PoliceCar(0, lanePosition);
			}
			raceables[i].setColor(Color.CYAN);
			lanePosition += raceables[i].getHeight() + DEFAULT_CAR_PADDING;
		}
	}
	
	public void paintComponent(Graphics g) {
		
		// Draw each car
		for (int i=0; i<numCars; i++) {
			raceables[i].draw(g);
		}
		
		// Move cars
		int nextDistance = 0;
		for (int i=0; i<numCars; i++) {
			nextDistance = carDistanceGenerator.nextInt(DEFAULT_CAR_SPEED);
			if (raceables[i] instanceof Turtle) {
				nextDistance =  20 + carDistanceGenerator.nextInt(DEFAULT_CAR_SPEED);
			}
			if ((raceables[i].getXPos() + raceables[i].getWidth() + nextDistance) >= this.getWidth()) {
				nextDistance -= (raceables[i].getXPos() + raceables[i].getWidth() + nextDistance) - this.getWidth();
				this.someCarWon = true;
				raceables[i].setColor(Color.orange);
			}
			raceables[i].setPos(raceables[i].getXPos() + nextDistance, raceables[i].getYPos());
		}

	}
	
	
}
