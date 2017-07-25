package Geometry;

import java.util.Scanner;

public class TryGeometry {
	private static Scanner point;

	public static void main(String[] args) {

		point = new Scanner(System.in);

		System.out.println("Iveskite x1: ");
		double x1 = point.nextDouble();
		System.out.println("Iveskite y1: ");
		double y1 = point.nextDouble();
		System.out.println("Iveskite x2: ");
		double x2 = point.nextDouble();
		System.out.println("Iveskite y2: ");
		double y2 = point.nextDouble();
		System.out.println("Buvo sukurti du taškai: (" +x1+","+y1+ ")(" +x2+","+y2+ ") !");

		Line l1 = new Line(x1, y1, x2, y2);
		
		System.out.println("Iveskite x3: ");
		double x3 = point.nextDouble();
		System.out.println("Iveskite y3: ");
		double y3 = point.nextDouble();
		System.out.println("Iveskite x4: ");
		double x4 = point.nextDouble();
		System.out.println("Iveskite y4: ");
		double y4 = point.nextDouble();
		System.out.println("Buvo sukurti du taškai: (" +x1+" "+y1+ ")(" +x2+" "+y2+ ") !");
		Line l2 = new Line(x3, y3, x4, y4);
		
		System.out.println("Buvo sukurtos dvi linijos: " + l1 + " " + l2 + " !");
		System.out.println("l1 ilgis: " + l1.lenght());
		System.out.println("l2 ilgis: " + l2.lenght());
		System.out.println("Linijos kertasi taške: (" + l1.intersects(l2)
				+ ")!");

		Line l3 = new Line(x1,y1, x2, y2);
		System.out.println("Linijos kertasi taške: (" + l1.intersects(l3)
				+ ")!");

		Line l4 = new Line(new Point(x1, y1), new Point(x2, y2));
		// a.move(3, 0);
		// b.move(3, 0);
		System.out.println("Linijos kertasi taške: (" + l1.intersects(l4)
				+ ")!");

	}

}
