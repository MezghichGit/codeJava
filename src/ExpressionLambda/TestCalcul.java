package ExpressionLambda;

import java.util.function.Predicate;

public class TestCalcul {

	public static void main(String[] args) {
		
		//Predicate <String> t = (String ch)->{return ch.length()<4;};
		
		Predicate <String> t = ch->ch.length()<4 ;
		
		System.out.println(t.test("oca"));
		
		/*
		Calcul c1 = (int x, int y)->{return x+y;};
		System.out.println(c1.operation(10, 20));
		
		//Calcul c2 = (int x, int y)->{return x*y;};  // expression full
		
		Calcul c2 = (x,y)->x*y;                        // version short
		System.out.println(c2.operation(10, 20));
		
		
		Prod p = new Prod();
		System.out.println(p.operation(10, 20));
	*/
	}

}
