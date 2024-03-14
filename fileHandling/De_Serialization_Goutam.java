package fileHandling;
import java.io.*;

class Students_Ser implements Serializable
{
    private static final long serialVersionUID=1L;
    String name;
    int age;
    int rno;
    public Students_Ser(String name, int age, int rno) {
    }
    @Override
    public String toString() {
        return "Students_Ser [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }
    
}

class De_Serialization_Goutam
{
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        
        File file = new File("Files","Goutam.txt");//Assuming that "Files" folder already exists

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        
        Students_Ser std1 =(Students_Ser)ois.readObject();
        Students_Ser std2 =(Students_Ser)ois.readObject();

        ois.close();

        System.out.println(std1);
        System.out.println(std2);
    }
}
