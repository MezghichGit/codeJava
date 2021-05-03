package api2Tableaux;

public class Voiture extends Object implements Comparable{

	double prix;
	
	@Override
	public int compareTo(Object o) {
		Voiture temp = (Voiture)o;
		return (int)(this.prix - temp.prix);
	}

	/*
	@Override
	public String toString()
	{
		return "une voiture";
	}*/
}
