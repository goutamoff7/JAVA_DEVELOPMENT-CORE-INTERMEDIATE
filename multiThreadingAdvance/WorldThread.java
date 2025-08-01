package multiThreadingAdvance;

public class WorldThread extends Thread {

    @Override
    public void run() {
        for (; ; )
            System.out.println("World");
    }
}
