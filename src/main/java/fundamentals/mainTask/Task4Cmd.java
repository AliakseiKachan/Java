package fundamentals.mainTask;

/**
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class Task4Cmd {

    public static void main(String[] args) {

        int sum = 0;
        int multiplication = 1;

        System.out.print("Your arguments are: ");

        for(int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
            multiplication = multiplication * Integer.parseInt(args[i]);
            System.out.print(args[i] + " ");
        }
        System.out.println("\n\nSum is: " + sum);
        System.out.println("Multiplication is: " + multiplication);

    }
}
