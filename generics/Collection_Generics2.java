package generics;
import java.util.*;

class StudentGen2 {
	String name;
	int rno;
}

class TeacherGen2 {
	String name;
	int id;
}

class Collection_Generics2 {
	public static void main(String[] args) {
		// No type safety
		// List l = new ArrayList();

		List<StudentGen2> al = new ArrayList<StudentGen2>(); // type safety exist

		StudentGen2 st1 = new StudentGen2();
		StudentGen2 st2 = new StudentGen2();

		TeacherGen2 t1 = new TeacherGen2();
		TeacherGen2 t2 = new TeacherGen2();

		al.add(st1);
		al.add(st2);
		al.add(t1); // CE : is not applicable for the arguments (TeacherGen2)
		al.add(t2); // CE : is not applicable for the arguments (TeacherGen2)

		System.out.println("List of StudentGen2s : " + al);

	}
}