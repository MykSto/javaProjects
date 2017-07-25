package inheritance;

class Dog extends Mamal {

	private String name, breed;

	public Dog(String name) {
		this(name, "Wild");
	}

	public Dog(String name, String breed) {
		super("Dog");
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getStringRepresentation() {
		return super.getStringRepresentation() + ", vardas - " + name + ", veisle " + breed;
	}

	@Override
	public void sound() {
		System.out.println("Au Auu");
	}

}
