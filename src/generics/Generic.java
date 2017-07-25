package generics;

public class Generic {

	public static void main(String[] args) {
		Point<Double> pointA = new Point<Double>(2.3, 3.5);
		Point<Integer> pointB = new Point<Integer>(3, 5);
		Point<String> pointC = new Point<String>("A", "B");
		Point<Object> pointD = new Point<Object>(new Object(), new Generic());
		
		System.out.println(pointA + "\n" + pointB + "\n" + pointC + "\n" + pointD);

	}

}
