import java.io.*;
class Selective_Teachers implements Serializable
{
    String name;
    int age;
    int id;
    transient double salary;
    public Selective_Teachers(String name,int age,int id,double salary)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.salary=salary;
    }
    public String toString()
    {
        return "Selective_Teachers ["+" Name = "+name+" ,Age = "+age+" ,id = "+id+" ,Salary = "+salary+" ]";
    }
}
class Selective_Serialization_Demo2 {
    public static void main(String[] args) {
    Selective_Teachers t1=new Selective_Teachers("MG",37,04,37000);
    Selective_Teachers t2=new Selective_Teachers("SKD",38,02,42000); 

    File TeachersData = new File("Folder","Selective_TeachersData.txt");
    try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(TeachersData))))
    {
        oos.writeObject(t1);
        oos.writeObject(t2);
    }
    catch(IOException e)
    {
        System.out.println("Folder not found");
    }
    finally
    {
        System.out.println(t1);
        System.out.println(t2);
    }
}
}
