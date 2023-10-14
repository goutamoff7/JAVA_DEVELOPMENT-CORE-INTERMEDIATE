import java.util.Scanner;
class StringDeleteSpace 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str1=sc.nextLine();
        String str2="";
        for(int i=0;i<str1.length();i++)
            if(str1.charAt(i)!=' ')
                str2=str2+str1.charAt(i);
        System.out.print("New Sentence: "+str2);        
    }
}
