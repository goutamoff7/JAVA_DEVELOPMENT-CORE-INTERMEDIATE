package interfaceDemo;
interface A {
	void m();
}

interface B {
	int m();
}

class Child implements A, B {
	public void m() {}

	public int m() {} }