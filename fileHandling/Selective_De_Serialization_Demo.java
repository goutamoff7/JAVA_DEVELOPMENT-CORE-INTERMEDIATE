package fileHandling;
import java.io.*;
class Selective_Students implements Serializable
{
    String name;
    transient int age;
    int rno;
    public Selective_Students(String name, int age, int rno) 
    { }
    
    @Override
    public String toString() {
        return "Selective_Students [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }  
}
class Selective_De_Serialization_Demo
{
    public static void main(String[] args) throws Exception {

        File file = new File("Files","obj.txt"); //Assuming that "Files" folder already exists
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Selective_Students obj2=(Selective_Students)ois.readObject();
        Selective_Students obj1=(Selective_Students)ois.readObject();  // reading the data from obj.text and  downcasting the Object type to Selective_Students type 
        
        System.out.println(obj2);
        System.out.println(obj1);


        

        ois.close();
    }
}
