package fundamentals.mainTask;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class Task3 {

    public static void main(String[] args) {

        int a = -500; // Начальное значение диапазона
        int b = 500; // Конечное значение диапазона
        int c = 10; // Количество  генерируемых случайных чисел

        for (int i = 0; i < c; i++) {
            int randomNumber = a + (int) (Math.random() * ((b - a) + 1));
            System.out.print(" " + randomNumber); // Без перехода на новую строку
        }

        System.out.println();

        for (int i = 0; i < c; i++) {
            int randomNumber = a + (int) (Math.random() * ((b - a) + 1));
            System.out.println(randomNumber); // C переходом на новую строку
        }

    }
}