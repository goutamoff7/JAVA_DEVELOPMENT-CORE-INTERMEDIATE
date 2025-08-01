package multiThreadingAdvance;

public class HelloThread implements Runnable {

    @Override
    public void run() {
        for (; ; )
            System.out.println("Hello");
    }
}
