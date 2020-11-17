package threads.mainTask;

import java.util.concurrent.Semaphore;

public class SemaphorePort {

    public static final int COUNT_PIERS = 5;
    public static final int COUNT_SHIPS = 10;
    public static boolean[] controlPiers = null;
    public static Semaphore semaphore = null;

    private static final int PORT_CONTAINERS_CAPACITY = 100;
    private static int currentContainersNumberInPort = 50;

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

            System.out.printf(ConsoleColors.BLUE_BOLD + "Ship %d arrived to port\n" + ConsoleColors.RESET, shipNumber);

            try {

                semaphore.acquire();

                System.out.printf(ConsoleColors.BLUE_UNDERLINED + "The crew of the ship %d requests a free pier\n"
                        + ConsoleColors.RESET, shipNumber);

                int controlNum = 0;

                synchronized (controlPiers) {

                    for (int i = 0; i < COUNT_PIERS; i++) {

                        if (controlPiers[i]) {

                            controlPiers[i] = false;

                            controlNum = i;

                            System.out.printf(ConsoleColors.CYAN_BOLD + "Ship %d arrived to pier %d\n"
                                    + ConsoleColors.RESET, shipNumber, i + 1);

                            break;
                        }
                    }
                }

                if (currentContainersNumberOnShip[element] != 0) {

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

                        System.out.printf(ConsoleColors.GREEN_UNDERLINED
                                        + "Ship %d unload container %d. Containers in port: %d\n"
                                        + ConsoleColors.RESET, shipNumber, currentContainersNumberOnShip[element],
                                currentContainersNumberInPort);

                        currentContainersNumberOnShip[element]--;

                        Thread.sleep(100);

                        if (currentContainersNumberOnShip[element] == 0) {

                            System.out.printf(ConsoleColors.GREEN_BOLD_BRIGHT + "Ship %d finished unloading\n"
                                    + ConsoleColors.RESET, shipNumber);
                        }

                        Thread.sleep(1000);
                    }

                } else {

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

                        System.out.printf(ConsoleColors.RED_UNDERLINED
                                        + "Ship %d load container %d. Containers in port: %d\n"
                                        + ConsoleColors.RESET, shipNumber, currentContainersNumberOnShip[element] + 1,
                                currentContainersNumberInPort);

                        currentContainersNumberOnShip[element]++;

                        Thread.sleep(100);

                        if (currentContainersNumberOnShip[element] == SHIP_CONTAINERS_CAPACITY) {

                            System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "Ship %d finished loading\n"
                                    + ConsoleColors.RESET, shipNumber);
                        }

                        Thread.sleep(1000);
                    }
                }

                synchronized (controlPiers) {

                    controlPiers[controlNum] = true;
                }

                semaphore.release();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}