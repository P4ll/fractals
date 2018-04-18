package fractals;

public class Fractal {
	private static int CENTER_RIGHT_X = 100;
	private static int CENTER_RIGHT_Y = 100;
	private static int RIGHT_RADIUS = 50;
	private Point startPoints[];
	private int countPoints;
	public Fractal(int countPoint) {
		if (countPoint <= 0) {
			throw new IllegalArgumentException("Some trouble with countPoint in Fractal constructor");
		}
		this.countPoints = countPoint;
		startPoints = getRightBeginPoints(countPoint);
	}
	public Fractal(Point points[]) {
		countPoints = points.length;
		startPoints = points;
	}
	private Point[] getRightBeginPoints(int count) {
		Point[] p = new Point[count];
		for (int i = 0; i < count; ++i) {
			p[i].setX(CENTER_RIGHT_X + RIGHT_RADIUS * (int)Math.cos(2 * 180 * i / count));
			p[i].setY(CENTER_RIGHT_Y + RIGHT_RADIUS * (int)Math.sin(2 * 180 * i / count));
		}
		return p;
	}
	public Point[] getStartPoints() {
		return startPoints != null ? startPoints : getRightBeginPoints(countPoints);
	}
}
