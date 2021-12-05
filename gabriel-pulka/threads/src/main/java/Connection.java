import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Connection implements Runnable {

    static Connection connection;
    static AtomicInteger numberOfConnections = new AtomicInteger();
    static final int MAXNUMBEROFCONNECTIONS = 5;



    @Override
    public void run() {
        int connectStatus;
        int attempts = 0;
        connectStatus = GetConnections();

        while (connectStatus == 0){
            attempts ++;

            System.out.println("Thread #" + Thread.currentThread().getId() + " - Too many Connections. Waiting for Connect...Attempt #" + attempts );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            connectStatus = GetConnections();
        }

        Random random = new Random();

        System.out.println("Thread #" + Thread.currentThread().getId() + " - Connecting...");
        try {
            Thread.sleep(random.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread #" + Thread.currentThread().getId() + " - Successfully Connected");
        try {
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread #" + Thread.currentThread().getId() + " - Disconnected");
        ReleaseConnections();

    }

    private Connection(){
    }

    public static Connection newConnection(){
        if(connection ==null){
            connection = new Connection();
        }
        return connection;
    }

    private static synchronized int GetConnections(){
        if(numberOfConnections.longValue() < MAXNUMBEROFCONNECTIONS){
            numberOfConnections.getAndIncrement();
            return 1;
        }else {
            return 0;
        }
    }
    private static synchronized void ReleaseConnections(){
        numberOfConnections.getAndDecrement();
    }


}
