package sketcher.domain;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{
	
	private int radius;

	public Circle(int x, int y) {
		super(x, y);
		radius = Shape.DEFAULT_LENGHT;
	}

	@Override
	public void draw() {
		System.out.println("Circle: (" + x + "," + y + ")");
		System.out.println("Radius: " + radius);
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setPaint(color);
		g2d.draw(new Ellipse2D.Double(x, y, radius, radius));
	}

}
