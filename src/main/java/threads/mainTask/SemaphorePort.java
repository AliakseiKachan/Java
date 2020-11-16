package threads.mainTask;

import java.util.concurrent.Semaphore;

public class SemaphorePort {

    public static final int COUNT_PIERS = 5;
    public static final int COUNT_SHIPS = 10;
    public static boolean[] controlPiers = null;
    public static Semaphore semaphore = null;

    private static final int PORT_CONTAINERS_CAPACITY = 50;
    private static int currentContainersNumberInPort = 25;

    public static class Ship implements Runnable {

        private final int SHIP_CONTAINERS_CAPACITY = 10;
        private int[] currentContainersNumberOnShip = {0, 10};
        private int element = (int) Math.floor(Math.random() * currentContainersNumberOnShip.length);
        private int shipNumber;

        public Ship(int shipNumber)  {

            this.shipNumber = shipNumber;
        }

        @Override
        public void run() {

            System.out.printf("Ship %d arrived to port\n", shipNumber);

            try {

                semaphore.acquire();

                System.out.printf("The crew of the ship %d requests a free pier\n", shipNumber);

                int controlNum = 0;

                synchronized (controlPiers) {

                    for (int i = 0; i < COUNT_PIERS; i++) {

                        if (controlPiers[i]) {

                            controlPiers[i] = false;

                            controlNum = i;

                            System.out.printf("Ship %d arrived to pier %d\n", shipNumber, i + 1);

                            break;
                        }
                    }
                }

                if (currentContainersNumberOnShip[element] != 0) {

                    unloadShip();

                } else {

                    loadShip();
                }

                synchronized (controlPiers) {

                    controlPiers[controlNum] = true;
                }

                semaphore.release();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        public void unloadShip() throws InterruptedException {

            for (int i = currentContainersNumberOnShip[element]; i > 0; i--) {

                while (currentContainersNumberInPort == PORT_CONTAINERS_CAPACITY) {

                    System.out.printf("Port overloaded. Ship %d waiting while other ships load containers." +
                            " Containers in port: %d\n", shipNumber, currentContainersNumberInPort);

                    Thread.sleep(3000);
                    semaphore.release(1);
                }

                synchronized (controlPiers) {

                    currentContainersNumberInPort++;
                }

                System.out.printf("Ship %d unload container %d. Containers in port: %d\n", shipNumber,
                        currentContainersNumberOnShip[element], currentContainersNumberInPort);

                currentContainersNumberOnShip[element]--;

                if (currentContainersNumberOnShip[element] == 0) {

                    System.out.printf("Ship %d finished unloading\n", shipNumber);
                }

                Thread.sleep(1000);
            }
        }

        public void loadShip() throws InterruptedException {

            for (int i = 0; i < SHIP_CONTAINERS_CAPACITY; i++) {

                while (currentContainersNumberInPort == 0) {

                    System.out.printf("Port is empty. Ship %d waiting while other ships unload containers." +
                            " Containers in port: %d\n", shipNumber, currentContainersNumberInPort);

                    Thread.sleep(3000);
                    semaphore.release(1);
                }

                synchronized (controlPiers) {

                    currentContainersNumberInPort--;
                }

                System.out.printf("Ship %d load container %d. Containers in port: %d\n", shipNumber,
                        currentContainersNumberOnShip[element] + 1, currentContainersNumberInPort);

                currentContainersNumberOnShip[element]++;

                if (currentContainersNumberOnShip[element] == SHIP_CONTAINERS_CAPACITY) {

                    System.out.printf("Ship %d finished loading\n", shipNumber);
                }

                Thread.sleep(1000);
            }
        }
    }
}