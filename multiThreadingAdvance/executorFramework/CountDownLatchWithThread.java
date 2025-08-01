package multiThreadingAdvance.executorFramework;

import java.util.concurrent.*;

class DependentService2 implements Runnable{

    CountDownLatch latch;

    public DependentService2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Service Started....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        } finally {
            latch.countDown();
        }
    }
}


public class CountDownLatchWithThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        for(int i=0; i<numberOfServices;i++){
            new Thread(new DependentService2(latch)).start();
        }

//        latch.await();
        latch.await(1,TimeUnit.SECONDS);


//        not required multiple time get() call for the computation to complete,
//        and then retrieves its result.
//        future1.get();
//        future2.get();
//        future3.get();

        // Main Thread is waiting here
        System.out.println("All dependent service finished. Started Main service....");

    }

}


