import java.util.Random;
class Random_exp3
{
    public static void main(String[] args) 
    {
        Random r=new Random();
        int x=r.nextInt(50);
        System.out.println("Random Number="+x);
        int y=r.nextInt(1000);
        System.out.println("Random Number="+y);
    }
}