import java.util.Scanner;
class StringDeleteSpace2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==' ')
                str=str.substring(0,i)+str.substring(i+1,str.length());
        System.out.print("New Sentence: "+str); 
    }
}
