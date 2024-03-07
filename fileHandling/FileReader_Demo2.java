package fileHandling;
import java.io.*;
public class FileReader_Demo2 {
    public static void main(String[] args)  {
        
        try
        {         
            File file = new File("Files","Goutam.txt");  
            try (FileReader fr = new FileReader(file)) {
                char ar[]= new char[(int)file.length()];
                fr.read(ar);
                for(char data:ar)
                    System.out.print((char)data);      
            }

        }
        catch(IOException e)
        {
            System.out.println("Goutam.txt file not found");            
        }

        
    }
}
