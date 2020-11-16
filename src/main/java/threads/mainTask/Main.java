package threads.mainTask;

import java.util.concurrent.Semaphore;

/**
 * Create a console multithreaded application.
 * Use the features provided by the java.util.concurrent package.
 * All entities wishing to access the resource must be threads.
 *
 * Port.
 * Ships enter the port to unload / load containers.
 * The number of containers currently in the port and on the ship
 * must be non-negative and in excess of the specified cargo capacity and port capacity.
 * There are several piers in the port.
 * One ship can stay at one pier.
 * The ship can be loaded at the pier, unloaded, or both.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SemaphorePort.controlPiers = new boolean[SemaphorePort.COUNT_PIERS];

        for (int i = 0; i < SemaphorePort.COUNT_PIERS; i++) {

            SemaphorePort.controlPiers[i] = true;
        }

        SemaphorePort.semaphore = new Semaphore(SemaphorePort.controlPiers.length, true);

        for (int i = 1; i <= SemaphorePort.COUNT_SHIPS; i++) {

            new Thread(new SemaphorePort.Ship(i)).start();
            Thread.sleep(500);
        }
    }
}