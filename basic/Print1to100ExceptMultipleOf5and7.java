package basic;

import java.util.Scanner;
class Print1to100ExceptMultipleOf5and7
{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(i%5!=0 && i%7!=0)
                System.out.println(i);
        }
    }
}
