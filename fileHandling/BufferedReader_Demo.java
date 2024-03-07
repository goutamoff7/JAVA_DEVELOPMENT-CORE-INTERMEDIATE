package fileHandling;
import java.io.*;
public class BufferedReader_Demo {
    public static void main(String[] args)  {
        
        try
        {         
            File file = new File("Files","Goutam.txt");  
            try (FileReader fr = new FileReader(file);BufferedReader br = new BufferedReader(fr)) 
            {
                for(String line=br.readLine();line!=null;line=br.readLine())
                {
                    System.out.println(line);
                    
                }
            }

        }
        catch(IOException e)
        {
            System.out.println("Goutam.txt file not found");            
        }

        
    }
}
