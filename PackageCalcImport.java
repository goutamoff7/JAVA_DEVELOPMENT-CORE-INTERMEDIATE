import java.util.Scanner;
import packages.cal.division.*;
import packages.cal.addition.*;
import packages.cal.subtraction.*;
import packages.cal.multiplication.*;

class PackageCalcImport 
{
   public static void main(String[] args) 
   {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter two number for Addition: " );
        int a= read.nextInt();
        int b=read.nextInt();
        new Addition().add(a,b);
        
        
        System.out.println("Enter two number for Subtraction: " );
        int c= read.nextInt();
        int d=read.nextInt();
        new Subtraction().sub(c,d);

        System.out.println("Enter two number for Multiplication: " );
        int e= read.nextInt();
        int f=read.nextInt();
        new Multiplication().mul(e,f);

        System.out.println("Enter two number for Division: " );
        int g= read.nextInt();
        int h=read.nextInt();
        new Division().div(g,h);
   } 
}
