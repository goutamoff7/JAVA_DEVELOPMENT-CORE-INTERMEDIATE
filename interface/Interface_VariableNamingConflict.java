interface A {
	int x = 15;
}

interface B {
	int x = 20;
}

public class Interface_VariableNamingConflict implements A, B {
	public static void main(String[] args) {
		// System.out.println(x); CE: The field x is ambiguous
		System.out.println(A.x);
		System.out.println(B.x);
	}
}
