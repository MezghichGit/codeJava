package api2Tableaux;

import java.util.Arrays;

public class TestTab {
	public static void main(String[] args) {
		int tab[] = {2,14,0,5,18};
		
		//System.out.println("Tab avant tri");
		/*
		for(int e : tab)
		{
			System.out.print(e+" ");
		}
		
		System.out.println();
		System.out.println("Tab après tri");
		Arrays.sort(tab);
		for(int e : tab)
		{
			System.out.print(e+" ");
		}
		*/
		int indice = Arrays.binarySearch(tab, 14);
		System.out.println();
		System.out.println("indice = "+ indice);
	}
}
