import java.util.Scanner;
public class ContinueExample_Factors {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner read = new Scanner(System.in);
        int num=read.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i!=0)
               continue ;
            System.out.println(i);

        }
    }
}
