package ExpressionLambda;

@FunctionalInterface
public interface Prediction {
	
	public abstract boolean test(String s);
	
	default public  boolean test2(String s) { return false;}
	
	static public  boolean test3(String s) { return true;}

}
