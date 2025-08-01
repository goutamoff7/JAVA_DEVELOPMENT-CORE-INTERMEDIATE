package multiThreadingAdvance;

public class ThreadUsingLambdaExpressionDemo {

    public static void main(String[] args) {

        // Implementation using Anonymous Inner class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable1,"Thread-1");
        thread1.start();

        // Implementation using Lambda Expression
        Runnable runnable2 = () -> System.out.println(Thread.currentThread().getName());
        Thread thread2 = new Thread(runnable2,"Thread-2");
        thread2.start();

        // Implementation using Lambda Expression as a parameter
        Thread thread3 = new Thread(()->System.out.println(Thread.currentThread().getName()),"Thread-3");
        thread3.start();

        //Local Class
        class RunnableImpl{
            private static void runImpl1(){
                System.out.println(Thread.currentThread().getName());
            }
            private void runImpl2(){
                System.out.println(Thread.currentThread().getName());
            }
        }

        // Implementation using method reference (static method)
        Thread thread4 = new Thread(RunnableImpl::runImpl1,"Thread-4");
        thread4.start();

        // Implementation using method reference (non-static method)
        Thread thread5 = new Thread(new RunnableImpl()::runImpl2,"Thread-5");
        thread5.start();
    }
}
