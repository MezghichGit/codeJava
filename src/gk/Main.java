package gk;

/*
import support.TD;
import support.TP;
import support.Workshop;*/

import support.*;
import cours.TD;

public class Main {

	public static void main(String[] args) {

		/// Le garbage collector
		Animal a1 = new Animal();

		Animal a2 = new Animal();

		Animal a3 = a2;

		Animal a4 = new Animal();
		a1 = null;
		a4 = a2;
		for (int i = 0; i < 1000000; i++) {
			System.out.println("i=" + i);
		}
		//System.gc(); // appeler le garbage collector
		System.out.println("Suite du programme...");

		///////////////////////////////
		/*
		 * int x=1; System.out.println("x = "+ x);
		 * 
		 * TP tp1 = new TP(); Workshop w1 = new Workshop(); support.TD td1 = new
		 * support.TD();
		 * 
		 * 
		 * TD td2 = new TD();
		 * 
		 * 
		 * //Manuscrit m = new Manuscrit(); Personne p = new Personne();
		 * System.out.println("Hello Java");
		 * 
		 * Animal a1 = new Animal(); a1.name = "Toto"; a1.pays ="USA"; a1.taille =200;
		 * //a1.age = 2; //a1.espece ="Chat"; //System.out.println(a1.espece);
		 * //a1.info(); Animal a2 = new Animal(); /* a2.info();
		 * System.out.println(Animal.nb); a1.nb = 10; System.out.println(a1.nb);
		 * System.out.println(a2.nb);
		 */
	}

}
