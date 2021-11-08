package Models.Interfaces;

import java.util.concurrent.TimeUnit;

public interface Training {

    default void startTraining() throws InterruptedException {

        class TrainingStarted {

        public void warmUp() throws InterruptedException {
            System.out.println("Players are warming up...");
            TimeUnit.SECONDS.sleep(2);
            }

        public void fastTraining() throws InterruptedException {
            System.out.println("Players are doing exercises...");
            TimeUnit.SECONDS.sleep(2);
             }

        public void prepareStrategy() throws InterruptedException {
            System.out.println("Players are discussing strategies...");
            TimeUnit.SECONDS.sleep(2);
            }

        public void stretching() throws InterruptedException {
            System.out.println("Training is about to finish. Players are stretching...");
            TimeUnit.SECONDS.sleep(2);
            }
        }

        System.out.println("----------------------Training Report----------------------");
        System.out.println("Training will be starting soon!. Total duration: 8 seconds.");
        new TrainingStarted().warmUp();
        new TrainingStarted().fastTraining();
        new TrainingStarted().prepareStrategy();
        new TrainingStarted().stretching();
        System.out.println("Training has finished.");
        System.out.println("-----------------------------------------------------------");
    }


}
