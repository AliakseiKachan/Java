package threads.mainTask;

import java.util.concurrent.Semaphore;

public class Port {

    public static final int PORT_CONTAINERS_CAPACITY = 100;
    public static final int COUNT_PIERS = 5;
    public static final boolean[] CONTROL_PIERS = new boolean[COUNT_PIERS];
    public static Semaphore semaphore = null;
    public static int currentContainersNumberInPort = 50;
}