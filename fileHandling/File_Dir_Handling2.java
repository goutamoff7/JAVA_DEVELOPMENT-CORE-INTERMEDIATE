import java.io.*;

import javax.sound.midi.Soundbank;
public class File_Dir_Handling2 {
    public static void main(String[] args) throws IOException{
        
        FileReader_Demo1 dir = new FileReader_Demo1("Files");
        dir.mkdir(); // creating director/folder.
        System.out.println("dir reffering to Files Directory");

        //Creating "Goutam.jpg" file inside "Files" directory
        FileReader_Demo1 file1 = new FileReader_Demo1("Files","Goutam.jpg");
        file1.createNewFile();
        System.out.println("Goutam.jpg created inside Files directory");

        //Creating "Goutam.jpg" file inside the directory refering by dir
        FileReader_Demo1 file2 = new FileReader_Demo1(dir,"Arpan.jpg");
        file2.createNewFile();
        System.out.println("Arpan.jpg created inside Files directory");

        String fileList[] = dir.list(); // returns the list of files within the directory refering by dir as an array.
        System.out.println("List of files inside Files Directory : ");
        for(String name:fileList)
            System.out.println(name);
        System.out.println("No. of files inside Files Directory : "+fileList.length);

        FileReader_Demo1 dir2 = new FileReader_Demo1("G:\\GOUTAM LAPTOP\\PW SKILLS\\DSA WITH JAVA\\JAVA WORKSPACE FOR PRACTICE\\src");        
        int programCount=dir2.list().length;
        System.out.println("No. of java Program inside src Directory : "+programCount);
        


    }
}
