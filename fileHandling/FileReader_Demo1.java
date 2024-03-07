package fileHandling;
import java.io.*;
public class FileReader_Demo1 {
    public static void main(String[] args)  {
        
        try
        {         
            File file = new File("Files","Goutam.txt");  
            try (FileReader fr = new FileReader(file)) {
                for(int i=fr.read();i!=-1;i=fr.read())
                {
                    System.out.print((char)i);
                    
                }
            }

        }
        catch(IOException e)
        {
            System.out.println("Goutam.txt file not found");            
        }

        
    }
}
