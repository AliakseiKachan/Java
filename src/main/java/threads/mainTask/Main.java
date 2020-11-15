package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Determine number of piers
         */

        SemaphorePort.controlPiers = new boolean[SemaphorePort.COUNT_PIERS];

        /**
         * Piers control flags [true-free, false-busy]
         */

        for (int i = 0; i < SemaphorePort.COUNT_PIERS; i++) {

            SemaphorePort.controlPiers[i] = true;
        }

        /**
         * Define a semaphore with the following parameters:
         * number of permissions 5
         * queue flag fair = true (first in first out)
         */

        SemaphorePort.semaphore = new Semaphore(SemaphorePort.controlPiers.length, true);

        for (int i = 1; i <= SemaphorePort.COUNT_SHIPS; i++) {

            new Thread(new SemaphorePort.Ship(i)).start();
            Thread.sleep(500);
        }
    }
}