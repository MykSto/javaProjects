package inheritance;

public class Cat extends Mamal {

	private String name;

	public Cat(String name) {
		super("Katinas");
		this.name = name;
	}
	
	@Override
	public String getStringRepresentation() {
		return super.getStringRepresentation() + ", vardu " + name;
	}
	
	public void sound(){
		System.out.println("Mew Mew");
	}
}
