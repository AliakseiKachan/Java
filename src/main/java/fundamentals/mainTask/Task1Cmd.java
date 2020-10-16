package fundamentals.mainTask;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Task1Cmd {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + args[i] + "!");
        }
    }
}