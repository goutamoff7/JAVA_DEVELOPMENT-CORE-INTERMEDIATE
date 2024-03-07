package array;
class   Array4
{
    public static void main(String[] args) 
    {
        int[] a,A; // both a and A are integer array
        a=new int[]{1,5,6,9,8};
        A=a;
        int []b,B; //both b and B are integer array
        B=b=A;
        int c[],C;//c is an integer array but C is an interger variable   
        c=a;
        //C=a;
        C=10;   

        System.out.println(a.length);
        System.out.println(A.length);
        System.out.println(b.length);
        System.out.println(B.length);
        System.out.println(c.length);
        System.out.println(C);
        
            
    }
}