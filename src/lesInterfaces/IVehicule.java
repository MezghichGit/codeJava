package lesInterfaces;

public abstract interface IVehicule {  // ça suppose que l'interface est abstract
	
	public static final int vitesseMax = 300;
	int vitesseMin = 0;  // ça suppose que vitesseMin est public static final
	
	void deplacement();   // ça suppose que la méthode public et abstract
	
	default public void info() {
		System.out.println("concrete method");
	}
	
	static public void note() {
		System.out.println("note method");
	}

}
