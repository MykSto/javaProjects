package sketcher.domain;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;

	public Rectangle(int x, int y) {
		super(x, y);
		this.width = Shape.DEFAULT_LENGHT;
		this.height = Shape.DEFAULT_LENGHT;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle: (" + x + "," + y + ")");
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.setPaint(color);
		g2d.draw(new Rectangle2D.Double(x, y, width, height));
	}

}
