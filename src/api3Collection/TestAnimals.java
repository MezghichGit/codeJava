package api3Collection;

import java.util.*;
public class TestAnimals {

	public static void main(String[] args) {
		Animal a1 = new Animal("Toto");
		Animal a2 = new Animal("Tata");
		
		//Set<Animal> sa = new HashSet<>();
		Set<Animal> sa = new TreeSet<>();
		sa.add(a1);
		sa.add(a2);
		System.out.println(sa);

	}

}
