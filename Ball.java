package paki4;

import java.awt.Color;

class Ball implements Comparable<Ball> {
	
	int x = ((int) (Math.random()*2))*1200 + 15;
	int y = ((int) (Math.random()*2))*600 + 15; // Current ball position
	int dx = ((int) (Math.random()*10) + 1) * (((int) (Math.random()*2)*2)-1); // Increment on ball's x-coordinate
	int dy = ((int) (Math.random()*10) + 1) * (((int) (Math.random()*2)*2)-1); // Increment on ball's y-coordinate
	int radius = (int) (Math.random()*19) + 2; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
	
	public int compareTo(Ball arg0) {
		if(radius - arg0.radius > 0) {
			return 1;
		}
		if(radius - arg0.radius < 0) { 
			return -1;
		}
		return 0;
	}
}