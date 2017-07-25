package Class;

public class ClassesApp {

	public static void main(String[] args) {

		Sphere ball = new Sphere();
		ball.xCenter = 4;
		ball.yCenter = 50;
		ball.zCenter = 34;
		ball.radius = 0.3;

		Sphere globe = new Sphere();
		globe.xCenter = 900;
		globe.yCenter = 3400;
		globe.zCenter = 7700;
		globe.radius = 10000;

		double volumeBall = 4 / 3 * Sphere.PI * Math.pow(ball.radius, 3);
		double volumeGlobe = 4 / 3 * Sphere.PI * Math.pow(globe.radius, 3);
		System.out.println(volumeBall);
		System.out.println(volumeGlobe);

	}

}
