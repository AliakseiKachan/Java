package fundamentals.mainTask;

import java.util.Scanner;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startPosition; // Начальное значение диапазона
        int endPosition; // Конечное значение диапазона
        int countOfNumbers; // Количество  генерируемых случайных чисел
        String answer;

        do {

            System.out.println("Input start position of range:");
            while (!input.hasNextInt()) {
                System.out.println("Input correct number, not string or char!");
                input.next();
            }

            startPosition = input.nextInt();

            System.out.println("Input end position of range:");
            while (!input.hasNextInt()) {
                System.out.println("Input correct number, not string or char!");
                input.next();
            }

            endPosition = input.nextInt();

            System.out.println("Input count of numbers:");
            while (!input.hasNextInt()) {
                System.out.println("Input correct number, not string or char!");
                input.next();
            }

            countOfNumbers = input.nextInt();

            for (int i = 0; i < countOfNumbers; i++) {
                int randomNumber = startPosition + (int) (Math.random() * ((endPosition - startPosition) + 1));

// -500 + (int) (Math.random() * ((500-(-500)) + 1))
// -500 + (int) (Math.random() * 1001)
// По умолчанию генерируются вещественные значения [0, 1), 1 исключительно
// 1001 * 0 = 0, 1001 * 1 = 1001, получаем [0, 1001), 1001 исключительно
// В результате приведения к типу int получаем [0, 1000], 1000 включительно
// -500 + 0 = -500, -500 + 1000 = 500, получаем [-500, 500]

                System.out.print(" " + randomNumber); // Без перехода на новую строку
            }

            System.out.println();

            for (int i = 0; i < countOfNumbers; i++) {
                int randomNumber = startPosition + (int) (Math.random() * ((endPosition - startPosition) + 1));
                System.out.println(randomNumber); // C переходом на новую строку
            }

            System.out.println("Would you like to run this program again?\nIf yes type y, if no type any other char:");

            answer = input.next();

        } while ("y".equals(answer));
    }
}