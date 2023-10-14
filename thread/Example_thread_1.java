class Example_thread extends Thread
{}
class Example_thread_1
{
    public static void main(String[] args) 
    {
        System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(17);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        Example_thread ob = new Example_thread();
        System.out.println(ob.getPriority());
    }
}
