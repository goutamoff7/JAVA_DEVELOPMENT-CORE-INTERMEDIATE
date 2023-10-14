import java.io.*;
import java.util.Scanner;

class Matrix_addition
{
    public static void main(String[] args) {
       int i,j;
       System.out.println("Enter the size of Matrix"); 
       Scanner read=new Scanner(System.in);
       int n = read.nextInt(); 
       int ar1[][]=new int[n][n];
       int ar2[][]=new int[n][n];
       int ar3[][]=new int[n][n];
       System.out.println("Enter values for 1st Matrix: ");
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            ar1[i][j]=read.nextInt();
       }
       System.out.println("Enter values for 2nd Matrix: ");
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            ar2[i][j]=read.nextInt();
       }
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            ar3[i][j]=ar1[i][j]+ar2[i][j];
       }
       System.out.println("The addition of two matrix:");
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            System.out.print(ar3[i][j]+" ");
        System.out.println();
       }
    }
}