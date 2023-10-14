class Example_thread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("Child Class Thread");
    }
}    
class Example_thread_2
{
    public static void main(String[] args) 
    {
        Example_thread ob = new Example_thread();
        ob.setPriority(7);
        ob.start();
        for(int k=0;k<5;k++)
            System.out.println("The Main Thread");
                   
    }

}

