public class CounterRunnable implements Runnable {

    private int process;
    private int millis;

    @Override
    public void run(){

        for (int counter = 1; counter <= 100; counter ++ ) {
            System.out.println("Process: " + process + ". Counter: " + counter);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public CounterRunnable(int process, int millis){
        this.process = process;
        this.millis = millis;
    }
}
