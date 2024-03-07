package array;
class   Array2D
{
    public static void main(String[] args) 
    {
        int[][] a,A; // both a and A are integer 2D array
        a=new int[][]{{1,5},{2,3}};
        A=a;

        int [][]b,B; // both b and B are integer 2D array
        b=B=a;

        int c[][],C; //c is an integer 2D  array but C is an interger variable 
        c=b; 
        C=10;

        int[] []d,D; // both b and B are integer 2D array
        d=D=a;

        int[] e[],E; //e is an integer 2D  array but E is an interger 1D array
        e=a;
        E=new int[]{1,5,6,8}; //initialization for 1D array
    
        for(int i[]:a)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();

        for(int i[]:a)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();

        for(int i[]:b)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();

        for(int i[]:B)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();

         for(int i[]:c)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();

        
       /*  System.out.println(a.length);
        System.out.println(A.length);
        System.out.println(b.length);
        System.out.println(B.length);
        System.out.println(c.length);
        System.out.println(C);*/
        
            
    }
}