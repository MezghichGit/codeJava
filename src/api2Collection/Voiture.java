package api2Collection;

public class Voiture implements Comparable{
	double prix;
	String modele;
	
	@Override
	public String toString() {
		return "Voiture [prix=" + prix + ", modele=" + modele + "]";
	}

	public Voiture(double prix, String modele) {
	
		this.prix = prix;
		this.modele = modele;
	}

	@Override
	public int compareTo(Object o) {
		Voiture temp = (Voiture)o;
		return (int)(this.prix - temp.prix);
	}

}
