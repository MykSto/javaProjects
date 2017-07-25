package inheritance;

public abstract class Mamal extends Animal {

	public Mamal(String type) {
		super(type);
	}

	public void produceHeat() {
		System.out.println("Heating...");
	}

}
