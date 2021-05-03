package api1String;

import gk.Animal;

public class NewMain {

	public static void main(String[] args) {
		
		//La classe String est immutable (inchangeable)
		/*
		String cours ="java";
		System.out.println(cours.concat(" avancé"));
		//cours = cours.concat(" avancée");
		System.out.println(cours);
		
		
		int nb =10;
		double moy = 15.5;
		boolean test = true;
		Animal a = new Animal();
		
		System.out.println("API 1 :  Les chaines de caractères!");
		
		String c1 = "JAVA";
		
		String c2 = new String("JAVA");
		
		String c3 = "JAVA";
		
		System.out.println("c1 == c2 : " + (c1==c2));
		
		System.out.println("c1 equals c2 : " + c1.equals(c2));
		
	    System.out.println("c1 == c3 : " + (c1 == c3));
		
		System.out.println("c1 equals c3 : " + c1.equals(c3));
        */
		
		// La classe String Builder
		//String mot ="abc";
		//StringBuilder sb1 = new StringBuilder();
		/*
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("javajavajavajavaz");  // mutable
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());*/
		
		//StringBuilder sb2 = new StringBuilder(mot);
		
		StringBuilder sb3 = new StringBuilder(24);
		System.out.println(sb3.capacity());
	}

}
