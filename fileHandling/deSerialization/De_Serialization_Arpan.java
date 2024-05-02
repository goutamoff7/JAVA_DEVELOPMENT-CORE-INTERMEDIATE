package fileHandling.deSerialization;
import java.io.*;

class Arpan_Ser implements Serializable
{
    private static final long serialVersionUID=2L;
    private String name;
    private int age;
    private int salary;
    
    public Arpan_Ser(String name, int age, int salary) { }
   
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class De_Serialization_Arpan_Ser {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        File file = new File("Files","Arpan.txt");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
         
        
        Arpan_Ser ob1 = (Arpan_Ser)ois.readObject();
        ois.close();

        ob1.disp();

    }
}
