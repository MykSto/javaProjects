package Geometry;

class Line {
	Point start;
	Point end;
	
	public Line(final Point start, final Point end) {
		this.start = start;
		this.end = end;
	}
	
	public Line(double xStart, double yStart, double xEnd, double yEnd) {
		start = new Point(xStart, yStart);
		end = new Point(xEnd, yEnd);
	}
	
	public double lenght(){
		return start.distance(end);
	}
	
	@Override
	public String toString() {
		return "(" + start + "):(" + end + ")";
	}
	
	public Point intersects(final Line line){
		Point localPoint = new Point(0,0);
		
		double num = (end.y - start.y) * (start.x - line.start.x) -
				     (end.x - start.x) * (start.y - line.start.y);
		double denom = (end.y - start.y) * (line.end.x - line.start.x) -
			           (end.x - start.x) * (line.end.y - line.start.y);
		
		localPoint.x = line.start.x + (line.end.x - line.start.x) * num/denom;
		localPoint.y = line.start.y + (line.end.y - line.start.y) * num/denom;
		
		return localPoint;
	}
}

