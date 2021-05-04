package api2Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestVoitures {

	public static void main(String[] args) {

		List<Voiture> voitures = new ArrayList<>();

		Voiture v1 = new Voiture(10000, "Fiat");
		Voiture v2 = new Voiture(15000, "Ford");
		Voiture v3 = new Voiture(12000, "Renault");

		voitures.add(v1);
		voitures.add(v2);
		voitures.add(v3);

		System.out.println(voitures);
		Collections.sort(voitures);
		System.out.println(voitures);

		// List<Voiture> voitures2 = new LinkedList<>();

		// ArrayList<Voiture> voitures3 = new ArrayList<>();

		// voitures3 = voitures2;

		// affichageVoiture(voitures);
		// affichageVoiture(voitures2);

		// affichageVoiture(voitures3);
	}

	public static void affichageVoiture(List<Voiture> v) {
	}

}
