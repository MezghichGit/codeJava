package api3Collection;

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		
		System.out.println("Cas d'une list");
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(10);
		li.add(4);
		li.add(3);
		System.out.println(li);
		
		System.out.println("Cas d'une HashSet");
		Set<Integer> hs = new HashSet<>();
		
		
		hs.add(10);
		hs.add(10);
		hs.add(4);
		hs.add(3);
		System.out.println(hs);
		
		System.out.println("Cas d'une HashSet");
		Set<Integer> ts = new TreeSet<>();  // les elements doivent être comparables
		ts.add(10);
		ts.add(10);
		ts.add(4);
		ts.add(3);
		System.out.println(ts);
		
	}

}
