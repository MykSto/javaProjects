package Box;

public class Rekur {

	double width;
	double height;
	double depth;
	
	public Rekur (double width1, double height1, double depth1){
		this.width = width1;
		this.height = height1;
		this.depth = depth1;
	}
	
	public double formula(){
		return this.width * this.height * this.depth;
	}
	
	public String print(){
		return  "Volume is: " + formula();
	}

	
}
