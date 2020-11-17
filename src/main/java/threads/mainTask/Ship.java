package threads.mainTask;

public class Ship implements Runnable {

    private int shipContainersCapacity = 10;
    private int[] currentContainersNumberOnShip = {0, 10};
    private int element = (int) Math.floor(Math.random() * currentContainersNumberOnShip.length);
    private int shipNumber;
    private Port port;

    public Ship() {
    }

    public Ship(int shipNumber, Port port) {

        this.shipNumber = shipNumber;
        this.port = port;
    }

    public int getCountShips() {
        return 10;
    }

    @Override
    public void run() {

        System.out.printf(ConsoleColors.BLUE_BOLD + "Ship %d arrived to port\n" + ConsoleColors.RESET, shipNumber);

        try {

            port.getSemaphore().acquire();

            System.out.printf(ConsoleColors.BLUE_UNDERLINED + "The crew of the ship %d requests a free pier\n"
                    + ConsoleColors.RESET, shipNumber);

            int controlNum = 0;

            synchronized (port.getControlPiers()) {

                for (int i = 0; i < port.getCountPiers(); i++) {

                    if (port.getControlPiers()[i]) {

                        port.getControlPiers()[i] = false;

                        controlNum = i;

                        System.out.printf(ConsoleColors.CYAN_BOLD + "Ship %d arrived to pier %d\n"
                                + ConsoleColors.RESET, shipNumber, i + 1);

                        break;
                    }
                }
            }

            if (currentContainersNumberOnShip[element] != 0) {

                for (int i = currentContainersNumberOnShip[element]; i > 0; i--) {

                    while (Port.currentContainersNumberInPort == port.getPortContainersCapacity()) {

                        System.out.printf("Port overloaded. Ship %d waiting while other ships load containers." +
                                " Containers in port: %d\n", shipNumber, Port.currentContainersNumberInPort);

                        Thread.sleep(3000);
                        port.getSemaphore().release(1);
                    }

                    synchronized (port.getControlPiers()) {

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
                        port.getSemaphore().release(1);
                    }

                    synchronized (port.getControlPiers()) {

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

            synchronized (port.getControlPiers()) {

                port.getControlPiers()[controlNum] = true;
            }

            port.getSemaphore().release();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}