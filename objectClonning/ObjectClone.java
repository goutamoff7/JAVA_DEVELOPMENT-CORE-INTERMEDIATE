//Object CLone
import java.lang.Cloneable;
class Student implements Cloneable
{
    String sid,sname;
    Student(String sid,String sname)
    {
        this.sid=sid;
        this.sname=sname;
    }
    public String toString()
    {
        return "name= "+sname + "Sid= "+sid;
    }
    public Student clone() throws CloneNotSupportedException
    {
        return (Student)super.clone();
    }
    
}

class ObjectClone
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Student ob1=new Student("12","Goutam");
        Student ob2=ob1.clone();
        System.out.println("Data from clone object");
        System.out.println(ob2);
    }
}
