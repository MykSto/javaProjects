package Class;

class Student {

	public String name, surname;
	public int thegrade;

	public void thename(String sName) {
		this.name = sName;
	}

	public void thesurname(String sSur) {
		this.surname = sSur;
	}

	String getName() {
		return this.name;
	}

	String getSurn() {
		return this.surname;
	}

	int getGarde() {
		return this.thegrade;
	}

	public void info() {
		System.out.println("Student's name is: " + name);
		System.out.println("Student's surnmae is: " + surname);
	}

	public void thegrade(int mark) {
		System.out.println("Your grade for the test is: " + mark);
	}
}

public class ClassAppStudent {
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.name = "Petras";
		student1.surname = "Petraitis";
		student1.info();
		student1.thegrade(7);

		if (student1.thegrade < 4) {
			System.out.println("Passed" + "\n");
		} else {
			System.out.println("*** You have failed the test ***" + "\n");
		}

		// Returns
		String name = student1.getName();
		System.out.println("Name: " + name);
		String surname = student1.getSurn();
		System.out.println("Surname: " + surname);
	}

}
