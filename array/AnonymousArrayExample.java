package array;
class FindLarge
{
    void method(int ar[])
    {
        int large=0;
        for(int n:ar)
        {
            if(large<n)
                large=n;
        }
    System.out.println(large);
    }
}

class AnonymousArrayExample 
{
    public static void main(String[] args) 
    {
        new FindLarge().method(new int[]{1,5,19,8,6,0}); 
        new FindLarge().method(new int[]{45,89,6,3,75,12});  
        new FindLarge().method(new int[]{22,55,1,0,36,78});  
        new FindLarge().method(new int[]{8,8,6,9,5,7});    
    }
    
}
