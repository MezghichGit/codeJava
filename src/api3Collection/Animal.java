package api3Collection;

public class Animal implements Comparable{

	String nom;

	@Override
	public String toString() {
		return "Animal [nom=" + nom + "]";
	}

	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public int compareTo(Object o) {
		Animal temp = (Animal)o;
		
		return this.nom.compareTo(temp.nom);
	}
}
