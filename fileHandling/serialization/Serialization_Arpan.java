package fileHandling.serialization;
import java.io.*;

class Arpan_Ser implements Serializable
{
    private static final long serialVersionUID=2L;
    private String name;
    private int age;
    private int salary;
    
    
   
    public Arpan_Ser(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void disp()
    {
        System.out.print(name+", ");
        System.out.print(age+", ");
        System.out.println(salary);
    }
}

class Serialization_Arpan {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        
        Arpan_Ser ob1 = new Arpan_Ser("Arpan Kundu",21,54321);
        File file = new File("Files","Arpan.txt");
        
        FileOutputStream fis = new FileOutputStream(file);
        ObjectOutputStream ois = new ObjectOutputStream(fis);
         
        
        ois.writeObject(ob1);
        
        ois.flush();
        ois.close();

        ob1.disp();

    }
}
