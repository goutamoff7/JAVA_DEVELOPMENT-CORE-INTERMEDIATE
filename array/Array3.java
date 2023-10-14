class   Array3
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3};
        int []b=a;
        int d[]=new int['c'];
        //long e[]=a;
        //a=e;
       String s[]={"Goutam","Ram","Shyam"};
       Object obj[]=s;
       //String str[]=obj;
        char c[]=new char[]{'a','b','c'};
        //c=a;
        //a=c;
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
        System.out.println();
        System.out.println(d.length);
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
        System.out.println();
        for(int i=0;i<obj.length;i++)
            System.out.print(obj[i]+" ");
        
            
    }
}