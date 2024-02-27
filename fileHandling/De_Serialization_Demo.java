import java.io.*;
class Selective_Students implements Serializable
{
    String name;
    int age;
    int rno;
    public Selective_Students(String name, int age, int rno) 
    { }
    
    @Override
    public String toString() {
        return "Selective_Students [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }   
}
class De_Serialization_Demo
{
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("Files//obj.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Selective_Students obj1=(Selective_Students)ois.readObject();  // reading the data from obj.text and  downcasting the Object type to Selective_Students type 
        
        Selective_Students obj2=(Selective_Students)ois.readObject();
        System.out.println(obj1);
        System.out.println(obj2);

        ois.close();
    }
}
