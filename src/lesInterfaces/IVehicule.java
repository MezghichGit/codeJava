package lesInterfaces;

public abstract interface IVehicule {  // �a suppose que l'interface est abstract
	
	public static final int vitesseMax = 300;
	int vitesseMin = 0;  // �a suppose que vitesseMin est public static final
	
	void deplacement();   // �a suppose que la m�thode public et abstract
	
	default public void info() {
		System.out.println("concrete method");
	}
	
	static public void note() {
		System.out.println("note method");
	}

}
