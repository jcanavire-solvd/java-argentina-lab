import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*
        ExecutorService service = Executors.newFixedThreadPool(7);
        for (int i = 1; i<= 7; i++){
            Runnable connection = Connection.newConnection();
            service.execute(connection);
        }

        service.shutdown();
*/
      ExecutorService service = Executors.newFixedThreadPool(7);
        for (int i = 1; i<= 7; i++){
            CompletableFuture.runAsync(Connection.newConnection(), service);
        }
        service.shutdown();

    }
}
