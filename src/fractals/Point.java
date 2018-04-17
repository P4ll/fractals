package fractals;

public class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x < 0 ? x * (-1) : x;
		this.y = y < 0 ? y * (-1) : y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x < 0 ? x * (-1) : x;
	}
	public void setY(int y) {
		this.y = y < 0 ? y * (-1) : y;
	}
}
