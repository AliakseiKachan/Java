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

    public static class Ship implements Runnable {

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

                System.out.printf("\t\t\t\tthe crew of the ship %d requests a free pier\n", shipNumber);

                int controlNum = -1;
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

                            System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tship %d arrived to pier %d\n",
                                    shipNumber, i + 1);
                            break;
                        }
                    }
                }
                /**
                 * Time of unloading and loading
                 */
                Thread.sleep((int) (Math.random() * 10 + 1) * 1000);
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
                System.out.printf("Ship %d finished unloading and loading\n", shipNumber);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}