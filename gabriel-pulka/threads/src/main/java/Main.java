import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        //2 threads, one extends Thread, the other implements Runnable
        /*
        CounterThread thread1 = new CounterThread(1, 100);

        CounterRunnable run1 = new CounterRunnable(2, 120);
        Thread thread2 = new Thread(run1);

        thread1.start();
        thread2.start();
        */
        ConcurrentHashMap<Integer, Thread> map = new ConcurrentHashMap<>();
        for (int i = 1; i<= 7; i++){
            map.put(i, new Thread( Connection.newConnection()));
        }

        map.forEach((k,v) -> v.start());
    }
}
