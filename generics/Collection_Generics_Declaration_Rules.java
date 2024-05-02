package generics;
import java.util.*;

class Student {

}

class Teacher<T> // UDF class with generics 
// E - Element (used extensively by the Java Collections Framework)
// K - Key
// N - Number
// T - Type . A Type variable can be any non-primitive type you specify: any class type, any interface type, any array type, or even another type variable.
// V - Value
// S,U,V etc. - 2nd, 3rd, 4th types
{
	T obj;  

	public Teacher(T obj) // constructor which accepts any type of Object
	{
		this.obj = obj;
	}

	void disp() {
		System.out.println("The type of Data is : " + obj.getClass());
	}

	public T getObj() {
		return obj;
	}
}

class Collection_Generics_Declaration_Rules {
	public static void main(String[] args) {
		// No type safety
		// List l = new ArrayList();

		ArrayList<Integer> al = new ArrayList<Integer>(); // ArrayList with Integer class type
		ArrayList<Integer> al1 = new ArrayList<>(); // Generics Class can be declared only in left side
		//ArrayList<> al2 = new ArrayList<String>(); // Generics Class can not be
		// declared only in right side
		List<String> al3 = new ArrayList<>(); // reference variable
		Collection<String> al4 = new ArrayList<>(); // can be of parent class
		Iterable<String> al5 = new ArrayList<>(); // (Polymorphism concept)

		//List<int> al6 = new ArrayList<>(); // primitive data type not allowed
		// List<Integer> al7 = new ArrayList<String>(); // Generics class type mismatch
		// List<Object> al8 = new ArrayList<Integer>(); // Generics class type
		// mismatch

		ArrayList<Student> al9 = new ArrayList<>(); // Generics of any User Defined Class are allowed

		Teacher<String> obj1 = new Teacher<String>("Goutam");
		obj1.disp();
		System.out.println("Given Data : " + obj1.getObj());

		Teacher<Integer> obj2 = new Teacher<Integer> (10);
		obj2.disp();
		System.out.println("Given Data : " + obj2.getObj());

		List<Teacher> al10 = new ArrayList<>();


	}
}