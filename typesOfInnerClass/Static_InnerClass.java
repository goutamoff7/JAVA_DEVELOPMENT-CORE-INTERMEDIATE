package typesOfInnerClass;
class OuterClass { // Outer class can't be declared as static
	void method() {
		System.out.println("Outer Class method");
	}

	static class InnerClass { // For static Inner Class outer class object
								// is not needed, only outer class name is required
		void method() { // to invoke its method
			System.out.println("Inner Class method");
		}

	}
}

public class Static_InnerClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.method();
		/*
		 * Syntax for Inner Class object creation (static member class):-
		 * <OUTER CLASS NAME>'.'<INNER CLASS NAME> <INNER CLASS OBJECT NAME> =
		 * "new" <OUTER CLASS NAME>'.'<INNER CLASS NAME>"();"
		 */
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.method();
	}
}
