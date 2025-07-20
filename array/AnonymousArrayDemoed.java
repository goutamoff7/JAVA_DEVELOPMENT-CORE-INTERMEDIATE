package array;
public class AnonymousArrayDemoed 
{
    public static void main(String args[])
    {
        add(new int[]{10,20,30,40});
        add(new int[]{10,20});
        add(new int[]{});
    }

    public static void add(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        System.out.println("The sum is :: "+sum);
    }
}