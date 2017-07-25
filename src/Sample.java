class Person {
	public String name;
	int age;

	public void theName(String myName) {
		this.name = myName;
	}

	void name() {
		for(int i = 0; i < 3; i++){
		System.out.println("My name is: " + name + " and I am " + age + " old");
		 }
	}

	public void hello() {
		System.out.println("Hello there!");
	}

	int yearsTillRetirement() {
		int year = 65 - age;
		return year;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	void howTall(int height) {
		System.out.println("My height is: " + height);
	}

	void skinSize(String color, double muscle) {
		System.out.println("Color of the skin is " + color
				+ " with the size of " + muscle);
	}

	void info(String text) {
		System.out.println(text);
	}
}

public class Sample {
	public static void main(String[] args) {
		System.out.println("Bio-1993" + "\n");

		Person someone = new Person();
		someone.name = "Peter pen";
		someone.age = 23;
		someone.hello();
		someone.name();

		// Getter Return Values
		int years = someone.yearsTillRetirement();
		System.out.println("Years till retirement: " + years + "\n");
		int ages = someone.getAge();
		String names = someone.getName();
		System.out.println("Name: " + names);// or
												// System.out.println(someone.getName());
		System.out.println("Age: " + ages);

		// Methods Parameters
		someone.howTall(11);
		someone.skinSize("Blue", 13.6);
		String human = "I am human";
		someone.info(human);

		// Setter and this
		someone.theName("Kebabs");
		System.out.println();

		Person elsesome = new Person();
		elsesome.name = "Ja Keglis";
		elsesome.age = 23;
		
		//Is parametru isspausdinama programele
		/**int cel = Integer.valueOf(args[0]);
		int f = (((9*cel)/5) + 32);
		System.out.println("Current temperature is: " + f);
		*/
		
		//shiftDemo
		byte b = 11;
		System.out.println(b >>> 1);
	
		
		//

	}
}
//java -jar filename