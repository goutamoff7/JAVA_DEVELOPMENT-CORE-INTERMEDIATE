package multiThreadingAdvance.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FactorialWithExecutorFrameworkDemo {

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
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newFixedThreadPool(3); // Reusing Threads
        long startTime = System.currentTimeMillis();
        for(int i = 1; i <= 10; i++){
            int finalI = i; // Variable used in lambda expression should be final or effectively final

            // execute() is the Executor interface's method
//            executorService.execute(()->
//                    System.out.println("Factorial of " + finalI + " : "+factorial(finalI)));
            executorService.submit(()->
                    System.out.println("Factorial of " + finalI + " : "+factorial(finalI)));
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){} // wait until shutdown,
        // return true if all tasks have completed following shut down.

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time : " + (endTime - startTime));

    }
}
