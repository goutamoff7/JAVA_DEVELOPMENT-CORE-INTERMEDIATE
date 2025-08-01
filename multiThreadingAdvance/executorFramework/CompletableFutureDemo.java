package multiThreadingAdvance.executorFramework;

import java.util.concurrent.*;

public class CompletableFutureDemo {

    // Helper method to simulate delay
    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {}
    }

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // 1. supplyAsync(): Executes a task asynchronously that returns a result
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return "Hello";
        });

        // 2. thenApply(): Transforms the result
        CompletableFuture<String> future2 = future1.thenApply(result -> result + " World");

        // 3. thenAccept(): Consumes the result (no return)
        future2.thenAccept(finalResult -> System.out.println("thenAccept: " + finalResult));

        // 4. thenRun(): Runs something after completion (no input or output)
        future2.thenRun(() -> System.out.println("thenRun: Task completed."));

        // 5. runAsync(): Task with no return value
        CompletableFuture<Void> fireAndForget = CompletableFuture.runAsync(() -> {
            sleep(500);
            System.out.println("runAsync: Running some task...");
        });

        // 6. thenCombine(): Combine results of 2 futures
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            sleep(800);
            return "Java";
        });

        CompletableFuture<String> combined = future1.thenCombine(future3, (a, b) -> a + " " + b);
        combined.thenAccept(res -> System.out.println("thenCombine: " + res));

        // 7. thenCompose(): Flatten futures (Future<Future<T>> → Future<T>)
        CompletableFuture<String> composed = future1.thenCompose(result ->
                CompletableFuture.supplyAsync(() -> result + " CompletableFuture")
        );
        composed.thenAccept(res -> System.out.println("thenCompose: " + res));

        // 8. allOf(): Wait for multiple futures to complete
        CompletableFuture<Void> all = CompletableFuture.allOf(future1, future3, combined, composed);
        all.thenRun(() -> System.out.println("allOf: All tasks completed."));

        // 9. anyOf(): Returns first completed future
        CompletableFuture<Object> any = CompletableFuture.anyOf(future1, future3);
        any.thenAccept(result -> System.out.println("anyOf: First completed = " + result));

        // 10. exceptionally(): Handle exception and recover
        CompletableFuture<String> failedFuture = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Something went wrong!");
        });

        failedFuture
                .exceptionally(ex -> "Recovered from: " + ex.getMessage())
                .thenAccept(msg -> System.out.println("exceptionally: " + msg));

        // 11. handle(): Handle success or exception both
        CompletableFuture<String> handled = CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) throw new RuntimeException("Random failure!");
            return "Success!";
        }).handle((res, ex) -> ex != null ? "Handled: " + ex.getMessage() : res);
        handled.thenAccept(System.out::println);

        // 12. whenComplete(): Called after completion (success or error), no transformation
        future1.whenComplete((res, ex) -> {
            if (ex == null)
                System.out.println("whenComplete: Completed with " + res);
            else
                System.out.println("whenComplete: Failed with " + ex.getMessage());
        });

        // 13. complete(): Manually complete future
        CompletableFuture<String> manualFuture = new CompletableFuture<>();
        manualFuture.complete("Manual Result");
        System.out.println("complete(): " + manualFuture.get());

        // 14. completeExceptionally(): Complete with error
        CompletableFuture<String> errorFuture = new CompletableFuture<>();
        errorFuture.completeExceptionally(new RuntimeException("Forced failure"));
        errorFuture.exceptionally(ex -> {
            System.out.println("completeExceptionally: " + ex.getMessage());
            return null;
        });

        // 15. join(): Like get() but doesn't throw checked exceptions
        String joinedResult = future1.join();
        System.out.println("join(): " + joinedResult);

        executor.shutdown();

        combined.join();
        composed.join();
    }




}

/*
Method                 | Description
----------------------+--------------------------------------------------
supplyAsync()         | Async task that returns a result
runAsync()            | Async task with no result
thenApply()           | Transform result
thenAccept()          | Consume result
thenRun()             | Run after completion (no input/output)
thenCombine()         | Combine 2 futures' results
thenCompose()         | Flatten nested futures
allOf()               | Wait for all futures
anyOf()               | Proceed on first completed
exceptionally()       | Handle exception and recover
handle()              | Handle result or exception
whenComplete()        | Observe completion
complete()            | Manually complete with value
completeExceptionally()| Manually complete with error
join() / get()        | Block and get result
*/

