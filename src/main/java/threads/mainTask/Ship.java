package threads.mainTask;

public class Ship implements Runnable {

    private int shipContainersCapacity = 10;
    private int[] currentContainersNumberOnShip = {0, 10};
    private int element = (int) Math.floor(Math.random() * currentContainersNumberOnShip.length);
    private int shipNumber;

    public Ship() {
    }

    public Ship(int shipNumber) {

        this.shipNumber = shipNumber;
    }

    public int getCountShips() {
        return 10;
    }

    @Override
    public void run() {

        System.out.printf(ConsoleColors.BLUE_BOLD + "Ship %d arrived to port\n" + ConsoleColors.RESET, shipNumber);

        try {

            Port.semaphore.acquire();

            System.out.printf(ConsoleColors.BLUE_UNDERLINED + "The crew of the ship %d requests a free pier\n"
                    + ConsoleColors.RESET, shipNumber);

            int controlNum = 0;

            synchronized (Port.controlPiers) {

                for (int i = 0; i < Port.countPiers; i++) {

                    if (Port.controlPiers[i]) {

                        Port.controlPiers[i] = false;

                        controlNum = i;

                        System.out.printf(ConsoleColors.CYAN_BOLD + "Ship %d arrived to pier %d\n"
                                + ConsoleColors.RESET, shipNumber, i + 1);

                        break;
                    }
                }
            }

            if (currentContainersNumberOnShip[element] != 0) {

                for (int i = currentContainersNumberOnShip[element]; i > 0; i--) {

                    while (Port.currentContainersNumberInPort == Port.portContainersCapacity) {

                        System.out.printf("Port overloaded. Ship %d waiting while other ships load containers." +
                                " Containers in port: %d\n", shipNumber, Port.currentContainersNumberInPort);

                        Thread.sleep(3000);
                        Port.semaphore.release(1);
                    }

                    synchronized (Port.controlPiers) {

                        Port.currentContainersNumberInPort++;
                    }

                    System.out.printf(ConsoleColors.GREEN_UNDERLINED
                                    + "Ship %d unload container %d. Containers in port: %d\n"
                                    + ConsoleColors.RESET, shipNumber, currentContainersNumberOnShip[element],
                            Port.currentContainersNumberInPort);

                    currentContainersNumberOnShip[element]--;

                    Thread.sleep(100);

                    if (currentContainersNumberOnShip[element] == 0) {

                        System.out.printf(ConsoleColors.GREEN_BOLD_BRIGHT + "Ship %d finished unloading\n"
                                + ConsoleColors.RESET, shipNumber);
                    }

                    Thread.sleep(500);
                }

            } else {

                for (int i = 0; i < shipContainersCapacity; i++) {

                    while (Port.currentContainersNumberInPort == 0) {

                        System.out.printf("Port is empty. Ship %d waiting while other ships unload containers." +
                                " Containers in port: %d\n", shipNumber, Port.currentContainersNumberInPort);

                        Thread.sleep(3000);
                        Port.semaphore.release(1);
                    }

                    synchronized (Port.controlPiers) {

                        Port.currentContainersNumberInPort--;
                    }

                    System.out.printf(ConsoleColors.RED_UNDERLINED
                                    + "Ship %d load container %d. Containers in port: %d\n"
                                    + ConsoleColors.RESET, shipNumber, currentContainersNumberOnShip[element] + 1,
                            Port.currentContainersNumberInPort);

                    currentContainersNumberOnShip[element]++;

                    Thread.sleep(100);

                    if (currentContainersNumberOnShip[element] == shipContainersCapacity) {

                        System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "Ship %d finished loading\n"
                                + ConsoleColors.RESET, shipNumber);
                    }

                    Thread.sleep(500);
                }
            }

            synchronized (Port.controlPiers) {

                Port.controlPiers[controlNum] = true;
            }

            Port.semaphore.release();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}