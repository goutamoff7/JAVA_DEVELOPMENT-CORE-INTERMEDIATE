package multiThreadingAdvance;

public class ThreadMethods extends Thread {

    ThreadMethods(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() +
                    " - Priority : " + thread.getPriority() + " - count : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadMethods t1 = new ThreadMethods("Min Priority Thread");
        ThreadMethods t2 = new ThreadMethods("Normal Priority Thread");
        ThreadMethods t3 = new ThreadMethods("Max Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        t1.join(); // the caller : main thread will wait until the t1 thread completes execution
        t2.join(); // the caller : main thread will wait until the t2 thread completes execution

        System.out.println("Main Thread Ends");

    }
}
