import java.util.*;

class Student {
	String name;
	int rno;
}

class Teacher {
	String name;
	int id;
}

class Collection_Generics2 {
	public static void main(String[] args) {
		// No type safety
		// List l = new ArrayList();

		List<Student> al = new ArrayList<Student>(); // type safety exist

		Student st1 = new Student();
		Student st2 = new Student();

		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();

		al.add(st1);
		al.add(st2);
		al.add(t1); // CE : is not applicable for the arguments (Teacher)
		al.add(t2); // CE : is not applicable for the arguments (Teacher)

		System.out.println("List of Students : " + al);

	}
}