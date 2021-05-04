package heritage;

public class NewMain {

	public static void main(String[] args) {
		Oiseau o = new Oiseau();
		o.espece="Canari";
		o.age = 1;
		o.couleur ="Jaune";
		
		Animal a = new Animal();
		
		Oiseau o2 = new Oiseau();
		a = o2; //upCast
		
		//a = o;  // upcasting OK
		o = (Oiseau)a;    // downCasting NOT OK
		
		/*
		Oiseau o2 = new Oiseau();
		 //o = a;   // DownCasting NOT OK
		 //a = o;  // upCasting OK
		 a = o2;
		 o = (Oiseau)a; // DownCasting : Cast + upCast 
		 
		 Animal a2 = new Oiseau();*/
		 System.out.println("Fin du programme...");
	}

}
