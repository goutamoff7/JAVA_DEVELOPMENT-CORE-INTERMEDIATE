package fileHandling;
import java.io.*;
class Students implements Serializable
{
    String name;
    int age;
    int rno;
    public Students(String name, int age, int rno) 
    { }
    
    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }  
}
class De_Serialization_Demo
{
    public static void main(String[] args) throws Exception {

        File file = new File("Files","obj.txt"); //Assuming that "Files" folder already exists
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Students obj2=(Students)ois.readObject();
        Students obj1=(Students)ois.readObject();  // reading the data from obj.text and  downcasting the Object type to Students type 
        
        System.out.println(obj2);
        System.out.println(obj1);


        

        ois.close();
    }
}
