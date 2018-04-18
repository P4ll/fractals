package fractals;

import java.util.Random;

public class FractalPainter {
	private Fractal fractal;
	private Random rand;
	private Point startPoints[];
	private Point stPoint;
	
	public FractalPainter(Fractal f) {
		fractal = f;
		startPoints = fractal.getStartPoints();
	}
	
	private int getRandVal(int left, int right) {
		return Math.abs(left + rand.nextInt() % right);
	}
	/*
	public Point getNextPoint() {
		if (stPoint == null)
	}
	*/
}
