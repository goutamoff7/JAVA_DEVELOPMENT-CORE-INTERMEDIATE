import java.io.*;
import java.util.Scanner;

class Matrix_transpose
{
    public static void main(String[] args) {
       int i,j;
       System.out.print("Enter the size of Matrix:"); 
       Scanner read=new Scanner(System.in);
       int n = read.nextInt(); 
       int transpose[][];
       transpose=new int[n][n];  
       int ar[][]=new int[n][n];
       System.out.println("Enter values for Matrix: ");
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            ar[i][j]=read.nextInt();
       }
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            transpose[j][i]=ar[i][j];
       }
       System.out.println("Transpose of the Matrix: ");
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
            System.out.print(transpose[i][j]+" ");
        System.out.println();
       }
    }
}