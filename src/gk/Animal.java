package gk;

//import java.lang.String;
public class Animal {

	// attribut de classe
	static int nb = 0;
	String name;   // visibilit� default

	// deux attributs d'instances
	private String espece;
	protected String pays;
	final int age;
	public double taille;

	// Constructeur : c'est m�thode sp�ciale avec le nom de la classe et pas de type
	// de retour m�me le void
	public Animal() {
		System.out.println("Age = " + this.age);
		System.out.println("Constructeur!");
		nb++;
	}

	// m�thode d'instance
	public void info() {
		System.out.println("Espace : " + this.espece + " Age : " + this.age + "Pays "+ this.pays);
	}

	// bloc d'initialisation d'instance
	{
		age = 2;
		System.out.println("B1");
	}

	// bloc d'initialisation de classe
	static {
		nb = -1;
		System.out.println("Bloc de classe");
	}
	
	protected void finalize()
	{
		System.out.println("Destruction");
	}
}
