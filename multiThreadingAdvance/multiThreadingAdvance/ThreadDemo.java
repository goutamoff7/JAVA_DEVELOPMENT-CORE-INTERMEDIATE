package multiThreadingAdvance;

public class ThreadDemo {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread(); // HelloThread implements Runnable interface
        WorldThread worldThread = new WorldThread(); // WorldThread extends Thread class , New State

        Thread thread = new Thread(helloThread); // HelloThread is in New State

        thread.start(); // HelloThread is in Runnable State
        worldThread.start(); // WorldThread is in Runnable State
    }
}
