package fileHandling.serialization;
import java.io.*;

class Students_Ser implements Serializable
{
    private static final long serialVersionUID=1L;
    String name;
    int age;
    int rno;
    public Students_Ser(String name, int age, int rno) {
        this.name = name;
        this.age = age;
        this.rno = rno;
    }
    @Override
    public String toString() {
        return "Students_De_Ser [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }
   
}

class Serialization_Goutam
{
    public static void main(String[] args) throws IOException {
        
        Students_Ser std1 = new Students_Ser("Goutam", 26, 24);
        Students_Ser std2 = new Students_Ser("Arpan",21,25);

        File file = new File("Files","Goutam.txt");//Assuming that "Files" folder already exists

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
