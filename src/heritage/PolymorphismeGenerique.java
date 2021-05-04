package heritage;

public class PolymorphismeGenerique {
	
	
	public static void display(Animal a)  // on a ici une méthode polymorphe
	{
		a.deplacement();
	}

	public static void main(String[] args) {
		
		Animal tab[] = {new Poisson(), new Animal(), new Serpent(), new Oiseau()}; // tab est une structure polymorphe
		for(Animal a : tab)
		{
			a.deplacement();
		}

		/*
		display(new Oiseau());
		display(new Poisson());
		display(new Serpent());
		*/
	}

}
