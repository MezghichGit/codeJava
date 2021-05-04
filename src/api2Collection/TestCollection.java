package api2Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(); // tableau dynamique

		List noms = new LinkedList(); // une liste chainée

		// System.out.println(names.size());
		// System.out.println(names.isEmpty()); // boolean

		names.add("Victor");
		names.add("Silvain");
		names.add("test");
		// System.out.println(names.size());
		// System.out.println(names.isEmpty());
		// System.out.println(names.contains("amine"));
		// System.out.println(names);
		// System.out.println(names.toString());
		// boolean res = names.remove("test");
		// System.out.println(res);
		// boolean res2 = names.remove("test");
		// System.out.println(res2);

		/*System.out.println(names.indexOf("test"));
		System.out.println(names);
		names.clear();
		System.out.println(names);*/

		// Les wrapper classes (les classes enveloppes)

		List<Integer> li = new ArrayList<>();
		//li.add("Java");
		//li.add(true);
		li.add(10);  // autoboxing
		li.add(new Integer(20));  
		li.add(20); 
		System.out.println(li);
		
		int val = li.get(2); // unboxing
	}
}
