package threads.mainTask;

public class Main {

    public static void main(String[] args) {

        Port port = new Port(500, 5);

        for (int i = 0; i < 10; i++) {

            Ship ship = new Ship(50, port.getPort());
        }
   }
}