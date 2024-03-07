package basic;

import java.io.*;
import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 1st Number= ");
        int a=read.nextInt();
        System.out.print("Enter 2nd Number= ");
        int b=read.nextInt();
        int c=a+b;
        System.out.print("The Addition of "+a+" and "+b+" = "+c);
               
    }
}