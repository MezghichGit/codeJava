package lesClassesAbstraites;

import java.util.Date;

public abstract  class Vehicule {

	String modele;
	Date dateFabrication;
	
	public abstract void deplacement();  // méthode abstraite
	
	
	public void info() {
		System.out.println("Un moyen de transport");
	}
}
