package multiThreadingAdvance;

class SharedResource {
    private int data;

    private boolean hasData;

    public synchronized void produce(int data) {
        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        hasData = true;
        System.out.println("Produced: " + data);
        notify();  // Wake up all consumers (only one will proceed)
    }

    public synchronized void consume() {
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // Wake up producer and other waiting consumer
    }
}

class Producer implements Runnable {

    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            resource.produce(i);
    }
}

class Consumer implements Runnable {

    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            resource.consume();
    }
}

public class InterThreadCommunication_Demo2 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
