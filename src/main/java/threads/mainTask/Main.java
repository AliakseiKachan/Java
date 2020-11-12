package threads.mainTask;

public class Main {

    public static void main(String[] args) {

        Port port = new Port(1000, 5);
        System.out.println("Current number of containers in port: " + port.getCurrentNumberOfContainersInPort() + "\n");

        for (int i = 0; i < 10; i++) {

            Ship ship = new Ship(50, port.getPort());
        }
   }
}