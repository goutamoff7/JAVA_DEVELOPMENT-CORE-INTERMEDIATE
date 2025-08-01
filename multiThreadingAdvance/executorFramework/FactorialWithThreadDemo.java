package multiThreadingAdvance.executorFramework;

public class FactorialWithThreadDemo {

    private static int factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        long startTime = System.currentTimeMillis();
        for(int i = 1; i <= 10; i++){
            int finalI = i; // Variable used in lambda expression should be final or effectively final
            threads[i-1] = new Thread(
                    ()->System.out.println("Factorial of " + finalI + " : "+factorial(finalI))
            ); // storing thread in the array
            threads[i-1].start();
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time : " + (endTime - startTime));

    }
}

/*
In this example we write the Business logic as well as managing the Threads also.
Here we are not reusing the threads, we create 10 thread for getting factorial of 10 number.
 */
