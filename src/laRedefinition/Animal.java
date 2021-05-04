package laRedefinition;

import java.io.IOException;

public class Animal {
	Animal deplacement() throws Exception{  // package private
		//System.out.println("Animal");
		return new Animal();
	}
}
