package exceptionHandling;

//Resolve compilation error of Checked Exception using try-catch block. 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Checked_ExceptionHandling2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Name: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {

		}
		// "br.readLine shows - Unhandled exception type IOException,
		// we need to throws it or handle it using try-catch.
		System.out.println("Given Name: " + s);

	}
}
