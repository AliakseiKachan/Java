package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Ship extends Thread {

    private int currentNumberOfContainersOnShip;
    private int shipContainersCapacity;
    private Semaphore port;

    public Ship(int shipContainersCapacity, Semaphore port) {
//        this.currentNumberOfContainersOnShip = (int) (Math.random() * shipContainersCapacity);
        this.currentNumberOfContainersOnShip = shipContainersCapacity / 2;
        this.shipContainersCapacity = shipContainersCapacity;
        this.port = port;
        this.start();
    }

    public int getCurrentNumberOfContainersOnShip() {
        return currentNumberOfContainersOnShip;
    }

    public int getShipContainersCapacity() {
        return shipContainersCapacity;
    }

    public void run() {

        printWaiting();

        try {

            port.acquire();
            unloadingContainersToPort();
            loadingContainersToShip();
            port.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printWaiting() {

        System.out.println(this.getName() + " waiting for free pier in port");
    }

    private void unloadingContainersToPort() throws InterruptedException {

        System.out.println(this.getName() + " arrives to pier and start process of unloading containers to port");

        this.sleep(5000);

        while (currentNumberOfContainersOnShip != 0) {

            int containersInPortCounter = ++Port.currentNumberOfContainersInPort;

            System.out.println(this.getName() + " in process of unloading: " + currentNumberOfContainersOnShip--
                    + ". Current number of containers in port: " + containersInPortCounter);

            this.sleep(100);
        }

        if (currentNumberOfContainersOnShip == 0) {

            System.out.println(this.getName() + " finish process of unloading");
        }
    }

    private void loadingContainersToShip() throws InterruptedException {

        if (currentNumberOfContainersOnShip == 0 && currentNumberOfContainersOnShip < shipContainersCapacity) {

            System.out.println(this.getName() + " start process of loading containers on ship");

            while (currentNumberOfContainersOnShip != shipContainersCapacity) {

                int containersInPortCounter = --Port.currentNumberOfContainersInPort;

                System.out.println(this.getName() + " in process of loading: " + currentNumberOfContainersOnShip++
                        + ". Current number of containers in port: " + containersInPortCounter
                );

                this.sleep(100);
            }
        }

        if (currentNumberOfContainersOnShip == shipContainersCapacity) {

            System.out.println(this.getName() + " finish process of loading");
        }
    }
}