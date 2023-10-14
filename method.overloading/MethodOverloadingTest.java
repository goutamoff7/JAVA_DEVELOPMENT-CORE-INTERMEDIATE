class Test {

void show(byte 	n)
{
	System.out.println("byte " + n);
}

void show(short	n)
{
	System.out.println("short " + n);
}

void show(int n)
{
	System.out.println("int " + n);
}

void show(long n)
{
	System.out.println("long " + n);
}

void show(float n)
{
	System.out.println("float " + n);
}

/*void show(double n)
{
	System.out.println("double " + n);
}*/

void show(char n)
{
	System.out.println("char " + n);
}
}
class MethodOverloadingTest{

public static void main(String[] args) {

Test obj = new Test();

obj.show(2);
obj.show((byte)2);  
obj.show((short)2); 
obj.show('a');  
obj.show('a');  // comment out show(char n) method and run 
obj.show(5.6);  // comment out show(double n) method and run gives CE
obj.show((float)10.5);

}

}


