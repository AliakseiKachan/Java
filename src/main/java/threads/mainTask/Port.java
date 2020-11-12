package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Port {

    private int currentNumberOfContainersInPort;
    private int portContainersCapacity;
    private int numberOfPiers;
    private Semaphore port;

    public Port(int portContainersCapacity, int numberOfPiers) {
        this.currentNumberOfContainersInPort = (int) (Math.random() * portContainersCapacity);
        this.portContainersCapacity = portContainersCapacity;
        this.numberOfPiers = numberOfPiers;
        this.port = new Semaphore(numberOfPiers);
    }

    public int getCurrentNumberOfContainersInPort() {
        return currentNumberOfContainersInPort;
    }

    public int getPortContainersCapacity() {
        return portContainersCapacity;
    }

    public int getNumberOfPiers() {
        return numberOfPiers;
    }

    public Semaphore getPort() {
        return port;
    }
}