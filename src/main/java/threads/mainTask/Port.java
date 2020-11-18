package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Port {

    public static final int portContainersCapacity = 100;
    public static final int countPiers = 5;
    public static final boolean[] controlPiers = new boolean[countPiers];
    public static Semaphore semaphore = null;
    public static int currentContainersNumberInPort = 50;
}