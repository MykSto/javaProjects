package inheritance;

import java.util.Random;

public class InheritanceApp {

	public static void main(String[] args) {
		Animal [] animals = { 
				new Dog("Brisius", "Taxas"), 
				new Dog("Lassie"),
				new Cat("Rizas"), 
				new Duck() 
				};

		Animal unknown;// sukuriam objekta, nuoroda i objekta
		Random select = new Random();
		for (int i = 0; i < 5; i++) {
			unknown = animals[select.nextInt(animals.length)];
			System.out.println(unknown);
			unknown.sound();
			
			
			if(unknown instanceof EggGivingAnimal){
				EggGivingAnimal needEgg = (EggGivingAnimal) unknown;
				needEgg.LayEgg();
			}else if (unknown instanceof Mamal){
				useMamal((Mamal)unknown);
			}
			// Animal brisius = new Dog("Brisius", "Taxas");
			// Dog lassie = new Dog("Lassie");
			// Animal duck = new Animal("Antinas");
			// Animal cat = new Cat("Rizas");

			// System.out.println(lassie);
			// brisius.sound();
			// System.out.println(duck);
			// duck.sound();
			// System.out.println(brisius);
			// brisius.sound();
			// System.out.println(cat);
			// cat.sound();
		}
	}
			public static void useMamal(Mamal mamal){
				mamal.produceHeat();
			}
}
