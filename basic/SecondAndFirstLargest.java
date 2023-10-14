import java.util.Scanner;
public class SecondAndFirstLargest 
{
     int ar2[];
     void find2ndLarge(int ar[])
        {
            ar2=new int[]{ar[0],0};
            for(int i=1;i<ar.length;i++)
            {
                if(ar2[0]<ar[i])
                {
                    ar2[1]=ar2[0];
                    ar2[0]=ar[i];
                }
                else if(ar[i]>ar2[1] && ar[i]<ar2[0])
                    ar2[1]=ar[i];
            }
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        SecondAndFirstLargest ob=new SecondAndFirstLargest();
        ob.find2ndLarge(ar);
        System.out.println("The Largest Number in the array ="+ob.ar2[0]);
        System.out.println("The Second Largest Number in the array ="+ob.ar2[1]);
    }
}
