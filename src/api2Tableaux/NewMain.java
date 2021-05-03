package api2Tableaux;

import java.util.Arrays;

public class NewMain {

	public static void main(String[] args) {
		/*
		Voiture v = new Voiture();
		System.out.println(v);
		System.out.println(v.toString());
		
		String ch = "OCA";
		System.out.println(ch.toString());
		System.out.println(ch);
		
		int t[] = {10,14};
		String tab[] = {"oca","ocp","spring"};
		
		System.out.println(tab);
		System.out.println(t);
		
		//length : propriété
		for(int i = 0; i<tab.length;i++)
		{
			System.out.println(tab[i]);
		}
		System.out.println("***************");
		
		for(String k : tab)
		{
			System.out.println(k);
		}*/
		
		/*int tab[]= {10,24};
		
		double []tab2 = new double[3];
		tab2[0] =100;
		
		String names[] = {"amine","jean"}; 
		
		Voiture [] mesVoitures = {new Voiture(), new Voiture()};
		
		
		System.out.println(tab2[0]);*/
		
		//Les tableaux à plusieurs dimensions
		
		//int tab[][] = new int[2][3];
		
		/*int tab[][] = new int[2][];
		
		tab[0] = new int[4];
		tab[0][0]=10;
		tab[0][1]=11;
		tab[0][2]=1;
		tab[0][3]=103;
		
		tab[1] = new int[6];
		tab[1][0]=20;
		tab[1][1]=21;
		tab[1][2]=4;
		tab[1][3]=23;
		tab[1][4]=2;
		tab[1][5]=25;*/
		
		//Exercice 5 min : Afficher le contenu du tableau avec deux méthodes
		
		//Méthode 1 : avec un compteur
		
		/*for (int i=0; i<tab.length; i++)
		{
			for (int b=0; b<tab[i].length; b++)
			{
				System.out.println(tab[i][b]);
			}
			System.out.println("****");
		}*/
		
		//Méthode 2 : avec foreach
		/*
		for(int[]e : tab)
		{
			for(int l : e) {
				System.out.println(l);
			}
			System.out.println("****");
		}*/
		/*
		int[]tab = {4,2,8,14,3};*/
		System.out.println("Avant tri");
		
		/*for(int[]e : tab)
		{
			for(int l : e) {
				System.out.println(l);
			}
			System.out.println("****");
		}*
		
		/*for(int l : tab) {
			System.out.println(l);
		}*/
		Voiture v1 = new Voiture();
		v1.prix = 20;
		
		Voiture v2 = new Voiture();
		v2.prix = 15;
		
		Voiture [] tab = {v1, v2};
		
		System.out.println(tab[0].prix);
		System.out.println(tab[1].prix);
		
		
		Arrays.sort(tab);
		System.out.println("Après tri");
		System.out.println(tab[0].prix);
		System.out.println(tab[1].prix);
		
		
		
		/*for(int[]e : tab)
		{
			for(int l : e) {
				System.out.println(l);
			}
			System.out.println("****");
		}*/
		/*for(int l : tab) {
			System.out.println(l);
		}*/

	}

}
