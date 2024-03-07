package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_finallyBlock_ResourceClose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=0;
		try{
			n = sc.nextInt();
		}
		catch(InputMismatchException e)	
		{
			System.out.println("Enter a Number only");
		}
		finally{
			sc.close();
		}
		System.out.println("Given Number : " + n);

	}
}
