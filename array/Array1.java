class   Array1
{
    public static void main(String[] args) 
    {
    int a[]=new int[10];
    a[0]=97;
    a[1]='a';
    byte b=10;
    a[2]=b;
    short s=25;
    a[3]=s;
    a[4]=(int)10l;
    for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    System.out.println("\n"+a.length);
    }
}