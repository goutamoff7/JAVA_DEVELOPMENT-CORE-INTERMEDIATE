import java.io.*;

class Students implements Serializable
{
    String name;
    int age;
    int rno;
    public Students(String name, int age, int rno) {
        this.name = name;
        this.age = age;
        this.rno = rno;
    }
    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }   
}

class Serialization_Demo
{
    public static void main(String[] args) throws IOException {
        
        Students std1 = new Students("Goutam", 26, 24);
        Students std2 = new Students("Arpan",21,25);

        File file = new File("Files","obj.txt");//Assuming that "Files" folder already exists

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
