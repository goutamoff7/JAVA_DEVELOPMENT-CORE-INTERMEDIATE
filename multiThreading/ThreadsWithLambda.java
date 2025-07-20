package multiThreading;

public class ThreadsWithLambda {
    public static void main(String[] args) throws InterruptedException {

        Runnable a = () ->{
            for(int i=0;i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };

        Runnable b = () ->{
            for(int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);

        thread1.start();
        thread2.start();
    }
}
