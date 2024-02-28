import java.io.*;
class Selective_Teachers implements Serializable
{
    String name;
    int age;
    int id;
    double salary;
    public Selective_Teachers(String name,int age,int id,double salary)
    {
    }
    public String toString()
    {
        return "Selective_Teachers ["+" Name = "+name+" ,Age = "+age+" ,id = "+id+" ,Salary = "+salary+" ]";
    }
}
class DeSerialization_Demo2 {
    public static void main(String[] args) {
        Selective_Teachers t1=null,t2=null;
    File Selective_TeachersData = new File("Folder","Selective_TeachersData.txt");
    try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(Selective_TeachersData))))
    {
        t1 = (Selective_Teachers)ois.readObject();
        t2 = (Selective_Teachers)ois.readObject();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    finally
    {
        System.out.println(t1);
        System.out.println(t2);
    }
}
}
