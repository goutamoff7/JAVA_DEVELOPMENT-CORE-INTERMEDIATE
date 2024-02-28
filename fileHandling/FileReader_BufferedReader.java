import java.io.*;
public class FileReader_BufferedReader {
    public static void main(String[] args) {
        File file = new File("Folder","Demo.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file));)
        {
            for(String line =br.readLine();line!=null;line=br.readLine())
                System.out.println(line);
        }
        catch(IOException e)
        {
            System.out.println("Demo.txt file not found");
        }
    }
}
