package laRedefinition;

public class Main {

	public static void main(String[] args)  throws Exception{
		Animal a = new Oiseau();  // upCasting

		a.deplacement();  // la version du fils

	}

}
