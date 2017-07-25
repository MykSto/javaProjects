package generics;
//parametras kuris leidzia naudoti Klases typa
public class Point<M> {

	private M x;
	private M y;
	
	public Point(M x, M y) {
		this.x = x;
		this.y = y;
	}

	public M getX() {
		return x;
	}

	public void setX(M x) {
		this.x = x;
	}

	public M getY() {
		return y;
	}

	public void setY(M y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return " [{" + x + "},{" + y + "}]";
	}
	
	
}