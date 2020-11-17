package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Port {

    public static int currentContainersNumberInPort = 50;

    public int getPortContainersCapacity() {
        return 100;
    }

    public int getCountPiers() {
        return 5;
    }

    public boolean[] getControlPiers() {
        return new boolean[getCountPiers()];
    }

    public Semaphore getSemaphore() {
        return new Semaphore(getControlPiers().length, true);
    }
}