package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Port {

    public static int countPiers = 5;
    public static boolean[] controlPiers = new boolean[countPiers];
    public static Semaphore semaphore = null;
    public static int currentContainersNumberInPort = 50;

    public int getPortContainersCapacity() {
        return 100;
    }
}