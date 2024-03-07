package array;
class   Array2
{
    public static void main(String[] args) 
    {
        Object obj[]=new Object[5];
        obj[0]=new Object();
       // obj[1]=new Integer(10);
        obj[2]=new String("Sachin");
        for(int i=0;i<obj.length;i++)
            System.out.println(obj[i]+" ");
    }
}