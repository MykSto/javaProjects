package inheritance;

public abstract class Animal {

	protected String type;

	public Animal(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return getStringRepresentation();
	}
	
	public String getStringRepresentation(){
		return "Gyvūnas - " + type;
	}

	public abstract void sound();

}
