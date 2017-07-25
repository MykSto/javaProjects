package sketcher.domain;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.Serializable;

public abstract class Shape implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static final int DEFAULT_LENGHT = 10;
	
	public static final int CIRCLE = 0;
	public static final int RECTANGLE = 1;
	
	protected Color color = Color.BLACK;
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static Shape create(int type, int x, int y){
		switch (type) {
		case CIRCLE:
			return new Circle(x, y);
		case RECTANGLE: 
			return new Rectangle(x, y);
		default:
			return new Rectangle(x, y);
		}
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	public void move(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public abstract void draw();
	
	public abstract void draw(Graphics2D g2d);
	
}
