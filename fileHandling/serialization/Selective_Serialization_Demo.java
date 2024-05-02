package fileHandling.serialization;
import java.io.*;

class Selective_Students implements Serializable
{
    String name;
    transient int age;
    int rno;
    public Selective_Students(String name, int age, int rno) {
        this.name = name;
        this.age = age;
        this.rno = rno;
    }
    @Override
    public String toString() {
        return "Selective_Students [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }   
}

class Selective_Serialization_Demo
{
    public static void main(String[] args) throws Exception {
        
        Selective_Students std1 = new Selective_Students("Goutam", 26, 24);
        Selective_Students std2 = new Selective_Students("Arpan",21,25);

        File file = new File("Files","obj.txt");

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        System.out.println(std1);
        oos.writeObject(std1);

        System.out.println(std2);
        oos.writeObject(std2);

        oos.flush();
        oos.close();
    }
}
