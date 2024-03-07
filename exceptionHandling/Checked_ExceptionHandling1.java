package exceptionHandling;
//Resolve compilation error of Checked Exception using throws keyword. 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Checked_ExceptionHandling1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Name: ");
		String s = br.readLine();
		// "br.readLine shows - Unhandled exception type IOException,
		// we need to throws it or handle it using try-catch.
		System.out.println("Given Name: " + s);

	}
}
