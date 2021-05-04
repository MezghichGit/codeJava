package ExpressionLambda;

public class Test {

	public static void main(String[] args) {
		
		String ch ="Cours java";
		String ch2 ="Cours";

       Prediction p = (String s)->{return s.contains("j");};
       
       System.out.println(p.test(ch));
       System.out.println(p.test(ch2));
       
       Prediction p2 = (String s)->{return s.startsWith("a");};
       
       System.out.println(p2.test("adevops"));

	}

}
