package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Ship extends Thread {

    private int currentNumberOfContainersOnShip;
    private int shipContainersCapacity;
    private Semaphore port;

    public Ship(int shipContainersCapacity, Semaphore port) {
        this.currentNumberOfContainersOnShip = (int) (Math.random() * shipContainersCapacity);
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

    private void unloadingContainersToPort() {

        System.out.println(this.getName() + " arrives to pier and start process of unloading containers to port");

        try {
            this.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (currentNumberOfContainersOnShip != 0) {

            System.out.println(this.getName() + " in process of unloading: " + --currentNumberOfContainersOnShip);

            try {
                this.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (currentNumberOfContainersOnShip == 0) {

            System.out.println(this.getName() + " finish process of unloading");
        }
    }

    private void loadingContainersToShip() {

        if (currentNumberOfContainersOnShip == 0 && currentNumberOfContainersOnShip < shipContainersCapacity) {

            System.out.println(this.getName() + " start process of loading containers on ship");

            while (currentNumberOfContainersOnShip != shipContainersCapacity) {

                System.out.println(this.getName() + " in process of loading: " + ++currentNumberOfContainersOnShip);

                try {
                    this.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if (currentNumberOfContainersOnShip == shipContainersCapacity) {

            System.out.println(this.getName() + " finish process of loading");
        }
    }
}