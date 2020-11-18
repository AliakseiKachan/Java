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

        Ship ship = new Ship();

        for (int i = 0; i < Port.countPiers; i++) {

            Port.controlPiers[i] = true;
        }

        Port.semaphore = new Semaphore(Port.countPiers, true);

        for (int i = 1; i <= ship.getCountShips(); i++) {

            new Thread(new Ship(i)).start();

            Thread.sleep(500);
        }
    }
}