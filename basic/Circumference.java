import java.util.Scanner;
class Circumference
{
    static double m(int r)
    {
        double PI=22.00/7.00;
        return 2*PI*r; 
    }
    public static void main(String[] args) 
    {
        System.out.print("radius of the Circle: ");
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        double p=m(r);
        System.out.println("Circumference of the Circle="+p);
    }
}
