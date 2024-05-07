package interfaceDemo;
interface A3 {
	int x = 15;
}

interface B3 {
	int x = 20;
}

public class Interface_VariableNamingConflict implements A3, B3 {
	public static void main(String[] args) {
		// System.out.println(x); CE: The field x is ambiguous
		System.out.println(A3.x);
		System.out.println(B3.x);
	}
}
