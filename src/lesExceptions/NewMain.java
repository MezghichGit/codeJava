package lesExceptions;

import java.io.IOException;

public class NewMain {

	public static void display() throws IOException
	{
		System.out.println("Info");
	}
	
	public static void affichage(int x, int y) throws ArithmeticException
	{
		System.out.println("x/y = "+ x/y);
	}
	
	
	// ArithmeticException
	// NullPointerException
	// ArrayIndexOutOfBoundsException

	public static void main(String[] args) {

		// open connexion dune data base

		int x = 10;
		int y = 10;
		String ch = null;
		String cours = "java";
		int tab[] = { 4, 18, 3 };
		// String ch1="";

		System.out.println("Début de calcul");

		try {
			/*
			 * System.out.println("x/y = " + x / y);
			 * System.out.println("troisieme element :"+ tab[2]);
			 * System.out.println("nbre caractère :"+ ch.length());
			 */
			System.out.println("caractère à la position 5 :" + cours.charAt(4));
		} catch (ArithmeticException e) {
			System.out.println("Problème de calcul");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problème dans le tableau");
		}

		catch (NullPointerException e) {
			System.out.println("Acces à un objet null");
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
			// System.out.println("Problème");
			// e.printStackTrace();
			return;
		}

		// System.out.println("nbre caractère :"+ ch1.length());
		// System.out.println("nbre caractère :"+ ch.length());
		// System.out.println("troisieme element :"+ tab[3]);

		finally {
			System.out.println("Suite du programme...");
			// close connexion dune data base
		}
	}

}
