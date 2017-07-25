package Geometry;

public class Point {
	
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(final Point point){
		this(point.x, point.y);
	}
	
	public void move(double xDelta, double yDelta){
		x += xDelta;
		y += yDelta;
	}
	
	public double distance(final Point p){
		return Math.sqrt(
			(x - p.x) * (x - p.x) +
			(y - p.y) * (y - p.y)
		);
	}
	
	@Override
	public String toString() {
		return x + "," + y;
	}
}