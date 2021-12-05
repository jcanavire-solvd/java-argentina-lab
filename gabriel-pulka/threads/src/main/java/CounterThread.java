public class CounterThread extends Thread{

    private int process;
    private int millis;

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

    public CounterThread(int process, int millis){
        this.process = process;
        this.millis = millis;
    }



}
