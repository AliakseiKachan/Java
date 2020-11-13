package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Determine number of piers
         */
        SemaphorePort.CONTROL_PIERS = new boolean[SemaphorePort.COUNT_PIERS];
        /**
         * Piers control flags [true-free, false-busy]
         */
        for (int i = 0; i < SemaphorePort.COUNT_PIERS; i++) {

            SemaphorePort.CONTROL_PIERS[i] = true;
        }
        /**
         * Define a semaphore with the following parameters:
         * number of permissions 5
         * queue flag fair = true (first in first out)
         */
        SemaphorePort.SEMAPHORE = new Semaphore(SemaphorePort.CONTROL_PIERS.length, true);

        for (int i = 1; i <= SemaphorePort.COUNT_SHIPS; i++) {

            new Thread(new SemaphorePort.Ship(i)).start();
            Thread.sleep(500);
        }
    }
}