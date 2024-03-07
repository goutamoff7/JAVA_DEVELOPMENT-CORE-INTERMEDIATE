import java.io.*;
import java.util.*;

class Try_with_Multi_Resources3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter 1st number : ");
			int a = sc.nextInt();
			System.out.println("Entered Number via Scanner : " + a);
			// br=new BufferedReader(new InputStreamReader(System.in));
			// sc=new Scanner(System.in);
			System.out.print("Enter 2nd number : ");
			int b = sc.nextInt();
			System.out.println("Entered Number via BufferedReader : " + b);
		} catch (InputMismatchException e) {
			System.out.println("Enter Number only :" + e);
		} catch (IOException e) {
			System.out.println("Enter Number only :" + e);
		}
	}
}