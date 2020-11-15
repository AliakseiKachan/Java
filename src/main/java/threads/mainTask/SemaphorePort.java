package threads.mainTask;

import java.util.concurrent.Semaphore;

public class SemaphorePort {

    public static final int COUNT_PIERS = 5;
    public static final int COUNT_SHIPS = 10;

    /**
     * Piers control flags
     */

    public static boolean[] controlPiers = null;

    /**
     * Semaphore
     */

    public static Semaphore semaphore = null;

    private static final int PORT_CONTAINERS_CAPACITY = 50;
    private static int currentContainersNumberInPort = 40;

    public static class Ship implements Runnable {

        private final int SHIP_CONTAINERS_CAPACITY = 15;
        private int currentContainersNumberOnShip = 10;
        private int shipNumber;

        public Ship(int shipNumber)  {

            this.shipNumber = shipNumber;
        }

        @Override
        public void run() {

            System.out.printf("Ship %d arrived to port\n", shipNumber);

            try {

                /**
                 * Request for pier availability
                 */

                semaphore.acquire();

                System.out.printf("The crew of the ship %d requests a free pier\n", shipNumber);

                int controlNum = 0;

                /**
                 * Request the availability of a free pier and going to it
                 */

                synchronized (controlPiers) {

                    for (int i = 0; i < COUNT_PIERS; i++) {

                        /**
                         * Are there free piers?
                         */

                        if (controlPiers[i]) {

                            /**
                             * Take a pier
                             */

                            controlPiers[i] = false;

                            controlNum = i;

                            System.out.printf("Ship %d arrived to pier %d\n", shipNumber, i + 1);

                            break;
                        }
                    }
                }

                for (int i = currentContainersNumberOnShip; i > 0; i--) {

                    while (currentContainersNumberInPort == PORT_CONTAINERS_CAPACITY) {

                        System.out.printf("Port overloaded. Ship %d waiting while trucks take containers." +
                                        " Containers in port: %d\n", shipNumber, currentContainersNumberInPort);

                        Thread.sleep(1000);

                        System.out.printf("Truck took %d container\n", currentContainersNumberInPort
                                - --currentContainersNumberInPort);

                        Thread.sleep(1000);
                    }

                    synchronized (controlPiers) {

                        currentContainersNumberInPort++;
                    }

                    System.out.printf("Ship %d unload container %d. Containers in port: %d\n", shipNumber, i,
                            currentContainersNumberInPort);

                    currentContainersNumberOnShip--;

                    if (currentContainersNumberOnShip == 0) {

                        System.out.printf("Ship %d finished unloading\n", shipNumber);
                    }

                    Thread.sleep(500);
                }

                if (currentContainersNumberOnShip == 0) {

                    for (int i = 0; i < SHIP_CONTAINERS_CAPACITY; i++) {

                        while (currentContainersNumberInPort == 0) {

                            System.out.printf("Port is empty. Ship %d waiting while trucks add containers." +
                                    " Containers in port: %d\n", shipNumber, currentContainersNumberInPort);

                            Thread.sleep(1000);

                            System.out.printf("Truck add %d container\n", -currentContainersNumberInPort
                            + ++currentContainersNumberInPort);

                            Thread.sleep(1000);
                        }

                        synchronized (controlPiers) {

                            currentContainersNumberInPort--;
                        }

                        System.out.printf("Ship %d load container %d. Containers in port: %d\n", shipNumber, i + 1,
                                currentContainersNumberInPort);

                        currentContainersNumberOnShip++;

                        if (currentContainersNumberOnShip == SHIP_CONTAINERS_CAPACITY) {

                            System.out.printf("Ship %d finished loading\n", shipNumber);
                        }

                        Thread.sleep(500);
                    }
                }

                /**
                 * Leaving pier
                 */

                synchronized (controlPiers) {

                    controlPiers[controlNum] = true;
                }

                /**
                 * Release pier
                 */

                semaphore.release();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}