package constructorDemo;

public class ConstructorOverloading_StaticBlock {

	static String course;
	String sName;
	int rollNo;

	static {
		System.out.println("This is static block");
		course = "B.Tech";
	}

	ConstructorOverloading_StaticBlock() {
		System.out.println("This is No argument Constructor");
	}

	ConstructorOverloading_StaticBlock(int rollNo) {
		System.out.println("This is int argument Constructor");
		this.rollNo = rollNo;
	}

	ConstructorOverloading_StaticBlock(String sName) {
		System.out.println("This is String argument Constructor");
		this.sName = sName;
	}

	ConstructorOverloading_StaticBlock(int rollNo, String sName) {
		System.out.println("This is int,String argument Constructor");
		this.rollNo = rollNo;
		this.sName = sName;
	}

	public static void main(String[] args) {
		System.out.println("This is main Method	");
		ConstructorOverloading_StaticBlock std1 = new ConstructorOverloading_StaticBlock();
		ConstructorOverloading_StaticBlock std2 = new ConstructorOverloading_StaticBlock(24);
		ConstructorOverloading_StaticBlock std3 = new ConstructorOverloading_StaticBlock("Goutam Dam");
		ConstructorOverloading_StaticBlock std4 = new ConstructorOverloading_StaticBlock(24,"Goutam Dam");

		System.out.println("\nCourse Name: " + course);
		System.out.println("\nStudent 1 Details : \nRoll_No : " + std1.rollNo + " ,Name : " + std1.sName);
		System.out.println("\nStudent 2 Details : \nRoll_No : " + std2.rollNo + " ,Name : " + std2.sName);
		System.out.println("\nStudent 3 Details : \nRoll_No : " + std3.rollNo + " ,Name : " + std3.sName);
		System.out.println("\nStudent 4 Details : \nRoll_No : " + std4.rollNo + " ,Name : " + std4.sName);
	}
}
