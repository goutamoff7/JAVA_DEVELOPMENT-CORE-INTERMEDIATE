import java.io.*;
class Dog implements Serializable 
{
    private static final long serialVersionUID=2L;
    int i=10;
    int j=20;
}
public class Serialization_FixedUID {

    public static void main(String[] args)throws IOException {

        Dog d=new Dog();

        FileOutputStream fos=new FileOutputStream("abc.ser");

        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(d);
        oos.flush();
        oos.close();
    }

}

