package inheritance;

public class Duck extends Animal implements EggGivingAnimal {

	public Duck() {
		super("Antis");
	}

	@Override
	public void LayEgg() {
		System.out.println(type + "deda kiausini");
	}

	@Override
	public void sound() {
		System.out.println("Kria Kria");
	}

}
