package laRedefinition;

import java.io.IOException;

public class Oiseau extends Animal{

	@Override
	public Oiseau deplacement()  throws IOException{   // package private
		//System.out.println("Oiseau");
		//return new Oiseau();
		return new Oiseau();
	}
}
