package fundamentals.mainTask;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class Task2Cmd {

    public static void main(String[] args) {

        String reverseArgs = "";

        for (int i = args.length - 1; i >= 0; i--) {
            reverseArgs += args[i] + " ";
        }

        System.out.println(reverseArgs);
    }
}
