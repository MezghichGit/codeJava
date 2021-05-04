package lesInterfaces;

public interface IUrbain {
	public void gps();
	
	default public void info() {
		System.out.println("concrete method");
	}
	
}
