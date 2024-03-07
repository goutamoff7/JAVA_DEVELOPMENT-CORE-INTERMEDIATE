package randomNoGeneration;
import java.lang.Math;
class Random_exp2
{
    public static void main(String[] args) 
    {
        int min=200,max=400;
        System.out.println("Random Number between "+min+" to "+max+" = ");
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}