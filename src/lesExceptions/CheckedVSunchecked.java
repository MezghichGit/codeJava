package lesExceptions;

import java.io.IOException;

public class CheckedVSunchecked {

	public static void display() throws IOException {   // IOException : exception v�rifi�e
		System.out.println("Info");
		throw new IOException();
	}

	public static void affichage(int x, int y) throws ArithmeticException {  // ArithmeticException : exception non v�rifi�e
		System.out.println("x/y = " + x / y); 
	}

	public static void main(String[] args) {
		Object obj = new Integer(3);
		String ch = (String)obj;
		
		/*
		try {
			display() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally {}
		//affichage(10,0);
		System.out.println("Suite du programme...");*/
	}

}
