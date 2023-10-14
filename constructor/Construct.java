import java.io.*;
class Construct
{
Construct()
{
System.out.println("This is 1st Constructor");  
}  
Construct(int a)
{
System.out.println("This is 2nd Constructor");   
}
Construct(int a,int b)
{
System.out.println("This is 3rd Constructor");  
}
{
System.out.println("This is Instance Block");
}
public static void main(String args[])throws IOException 	//main function
{
Construct ob1=new Construct();	//new object "ob1" is created inside the main function
Construct ob2=new Construct(10);	//new object "ob1" is created inside the main function
Construct ob3=new Construct(10,20);	//new object "ob1" is created inside the main function
new Construct();		        //Anonymous object
new Construct(10);		        //Anonymous object
new Construct(10,20);		        //Anonymous object
}
}
