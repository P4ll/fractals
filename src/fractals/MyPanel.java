package fractals;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private Point a, b, c;
	public MyPanel(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public void paint(Graphics g) {
		Point begPoint = new Point(a.getX() - b.getX(), a.getY() - b.getY());
		paintPoint(g, begPoint);
		
		Random rand = new Random();
		for (int i = 0; i < 1 << 20; i++) {
			int r = Math.abs(1 + rand.nextInt() % 3);
			System.out.print(r + " ");
			switch(r) {
			case 1:
				begPoint.setX(Math.abs(begPoint.getX() - a.getX()) / 2 + min(begPoint.getX(), a.getX()));
				begPoint.setY(Math.abs(begPoint.getY() - a.getY()) / 2 + min(begPoint.getY(), a.getY()));
				paintPoint(g, begPoint);
				break;
			case 2:
				begPoint.setX(Math.abs(begPoint.getX() - b.getX()) / 2 + min(begPoint.getX(), b.getX()));
				begPoint.setY(Math.abs(begPoint.getY() - b.getY()) / 2 + min(begPoint.getY(), b.getY()));
				paintPoint(g, begPoint);
				break;
			case 3:
				begPoint.setX(Math.abs(begPoint.getX() - c.getX()) / 2 + min(begPoint.getX(), c.getX()));
				begPoint.setY(Math.abs(begPoint.getY() - c.getY()) / 2 + min(begPoint.getY(), c.getY()));
				paintPoint(g, begPoint);
				break;
			}
		}
		
	}
	private int min(int a, int b) {
		return a < b ? a : b;
	}
	private void paintPoint(Graphics g, int x, int y) {
		g.drawLine(x, y, x, y);
	}
	private void paintPoint(Graphics g, Point p) {
		g.drawLine(p.getX(), p.getY(), p.getX(), p.getY());
	}
}
