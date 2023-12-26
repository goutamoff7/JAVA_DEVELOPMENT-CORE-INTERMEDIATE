class OuterClass {
	void method() {
		System.out.println("Outer Class method");
	}

	class InnerClass {
		void method() {
			System.out.println("Inner Class method");
		}

	}
}

public class Member_InnerClass1 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.method();
		/*
		 * Syntax for Inner Class object creation (non-static member class):-
		 * <OUTER CLASS NAME>'.'<INNER CLASS NAME> <INNER CLASS OBJECT NAME> =
		 * <OUTER CLASS OBJECT NAME>'.'"new" <INNER CLASS NAME>"();"
		 */
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.method();
	}
}
