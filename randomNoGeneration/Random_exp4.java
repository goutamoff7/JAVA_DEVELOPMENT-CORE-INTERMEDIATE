import java.util.concurrent.ThreadLocalRandom;;
class Random_exp4
{
    public static void main(String[] args) 
    {
        int a=ThreadLocalRandom.current().nextInt(5,100);
	  int b=ThreadLocalRandom.current().nextInt(50);
	  int c=ThreadLocalRandom.current().nextInt();
	  int d=ThreadLocalRandom.current().nextInt(-80,-7);
        System.out.println("Random Number="+a);
	  System.out.println("Random Number="+b);
	  System.out.println("Random Number="+c);
	  System.out.println("Random Number="+d);

    }
}