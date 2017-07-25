package Box;

public class BoxApp {

	public static void main(String[] args) {
		
		Rekur mybox1 = new Rekur(10, 20, 15);
		Rekur mybox2 = new Rekur(3, 6, 9);
		
		System.out.println(mybox1.print() + "\n" + mybox2.print());
	}

}
