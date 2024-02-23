import java.util.*;

class Student {
	String name;
	int rno;

	Student(String name, int rno) {
		this.name = name;
		this.rno = rno;
	}

	public String toString() {
		return "\nName : " + name + " , id : " + rno;
	}
}

class Teacher {
	String name;
	int id;

	Teacher(String name, int id) {
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

		List<Student> al1 = new ArrayList(); // type safety exist

		Student st1 = new Student("Goutam", 24);
		Student st2 = new Student("Arpan", 25);

		Teacher t1 = new Teacher("SKD", 1);
		Teacher t2 = new Teacher("MG", 2);

		al1.add(st1);
		al1.add(st2);
		al1.add(t1);  //The method add(Student) in the type List<Student> is not applicable for the arguments (Teacher)

		List<Teacher> al2 = new ArrayList(); // type safety exist
		
		al2.add(t1);
		al2.add(t2);
		al2.add(st1);  //The method add(Teacher) in the type List<Teacher> is not applicable for the arguments (Student)


		System.out.println("List of Students : \n" + al1);
		System.out.println("List of Teachers : \n" + al2);

	}
}