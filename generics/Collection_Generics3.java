package generics;
import java.util.*;

class StudentGen3 {
	String name;
	int rno;

	StudentGen3(String name, int rno) {
		this.name = name;
		this.rno = rno;
	}

	public String toString() {
		return "\nName : " + name + " , id : " + rno;
	}
}

class TeacherGen3 {
	String name;
	int id;

	TeacherGen3(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// public String toString() {
	// 	return "\nName : " + name + " , id : " + id;
	// }
}

class Collection_Generics3 {
	public static void main(String[] args) {
		// No type safety
		// List l = new ArrayList();

		List<StudentGen3> al1 = new ArrayList(); // type safety exist

		StudentGen3 st1 = new StudentGen3("Goutam", 24);
		StudentGen3 st2 = new StudentGen3("Arpan", 25);

		TeacherGen3 t1 = new TeacherGen3("SKD", 1);
		TeacherGen3 t2 = new TeacherGen3("MG", 2);

		al1.add(st1);
		al1.add(st2);
		al1.add(t1);  //The method add(StudentGen3) in the type List<StudentGen3> is not applicable for the arguments (TeacherGen3)

		List<TeacherGen3> al2 = new ArrayList(); // type safety exist
		
		al2.add(t1);
		al2.add(t2);
		al2.add(st1);  //The method add(TeacherGen3) in the type List<TeacherGen3> is not applicable for the arguments (StudentGen3)


		System.out.println("List of StudentGen3s : \n" + al1);
		System.out.println("List of TeacherGen3s : \n" + al2);

	}
}