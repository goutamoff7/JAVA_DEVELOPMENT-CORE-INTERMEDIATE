package multiThreadingAdvance;

class Daemon3 extends Thread
{
    public void run()
    {
        while(true)
            System.out.println("Thread is Running");
    }
}
class DaemonThread_Case3
{
    public static void main(String[] args) throws InterruptedException {
        Daemon3 d = new Daemon3();
        d.setDaemon(true);
        d.start();

        System.out.println("Main Ends..");
        // As there is no User Thread so after Main thread ends jvm will stop all Daemon Threads


    }
}