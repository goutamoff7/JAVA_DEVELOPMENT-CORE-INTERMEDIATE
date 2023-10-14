import java.util.Scanner;
class AverageUsingFun
{
    void avgFun(int a,int b,int c)
    {
        float avg=(float)(a+b+c)/3;
        System.out.println(avg);
    }   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        AverageUsingFun ob=new AverageUsingFun();
        ob.avgFun(a,b,c);
    }    
}   

