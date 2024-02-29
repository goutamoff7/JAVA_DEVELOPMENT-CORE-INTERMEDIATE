import java.io.*;

import javax.sound.midi.Soundbank;
public class File_Dir_Handling2 {
    public static void main(String[] args) throws IOException{
        
        File dir = new File("Files");
        dir.mkdir(); // creating director/folder.
        System.out.println("dir reffering to Files Directory");

        //Creating "Goutam.jpg" file inside "Files" directory
        File file1 = new File("Files","Goutam.jpg");
        file1.createNewFile();
        System.out.println("Goutam.jpg created inside Files directory");

        //Creating "Goutam.jpg" file inside the directory refering by dir
        File file2 = new File(dir,"Arpan.jpg");
        file2.createNewFile();
        System.out.println("Arpan.jpg created inside Files directory");

        String fileList[] = dir.list(); // returns the list of files within the directory refering by dir as an array.
        System.out.println("List of files inside Files Directory : ");
        for(String name:fileList)
            System.out.println(name);
        System.out.println("No. of files inside Files Directory : "+fileList.length);

        File dir2 = new File("G:\\GOUTAM LAPTOP\\PW SKILLS\\DSA WITH JAVA\\JAVA WORKSPACE FOR PRACTICE\\src");        
        int programCount=dir2.list().length;
        System.out.println("No. of java Program inside src Directory : "+programCount);
        


    }
}
