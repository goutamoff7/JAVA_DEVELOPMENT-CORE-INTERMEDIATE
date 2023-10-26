class A {
	void m1()
	{
		System.out.println("This is m1 method");
	}
}
class B extends A {
	void m2()
	{
		System.out.println("This is m2 method");
	}
}
class C extends B {
	void m3()
	{
		System.out.println("This is m3 method");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		C ob=new C();
		ob.m1();
		ob.m2();
		ob.m3();		
	}
}
