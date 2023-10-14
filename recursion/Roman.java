//integer to roman number conversion
import java.io.*;
import java.util.Scanner;
public class Roman {
    
        void roman(int n)
        {
            if(n>=10 && n<40)
            {
                System.out.print("X");
                roman(n-10);
            }
            if(n==9)
            {
                System.out.print("I");
                roman(n+1);
            }
            if(n>=5 && n<9)
            {
                System.out.print("V");
                roman(n-5);
            }
            if(n==4)
            {
                System.out.print("I");
                roman(n+1);
            }
            if(n>0 && n<=3)
            {
                System.out.print("I");
                roman(n-1);
            }
            if(n==0)
                return;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number:");
            int number=sc.nextInt();
            Roman ob=new Roman();
            ob.roman(number);
        
    }
}
 