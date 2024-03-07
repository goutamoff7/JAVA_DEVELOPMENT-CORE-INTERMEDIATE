//Shallow Cloning
import java.lang.Cloneable;
class A
{
    String s1,s2;
    A(String s1, String s2)
    {
        this.s1=s1;
        this.s2=s2;
    }
}

class B implements Cloneable
{
    int a;
    String s;
    B(int a,String s)
    {
        this.a=a;
        this.s=s;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ShallowCloning
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        A ob1=new A("Goutam","Dam");
        B ob2=new B(24,"Learning Java");
        B ob3=null;
    
    try 
    {
        ob3=(B)ob2.clone();
    } 
    catch (CloneNotSupportedException e) 
    {
        e.printStackTrace();    
    }
    
    System.out.println(ob1.s1+" "+ob1.s2);
    System.out.println(ob2.a+" "+ob2.s);

    ob3.s="Learning Python";
    System.out.println(ob3.s);
    } 
}