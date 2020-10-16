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

// -500 + (int) (Math.random() * ((500-(-500)) + 1))
// -500 + (int) (Math.random() * 1001)
// По умолчанию генерируются вещественные значения [0, 1), 1 исключительно
// 1001 * 0 = 0, 1001 * 1 = 1001, получаем [0, 1001), 1001 исключительно
// В результате приведения к типу int получаем [0, 1000], 1000 включительно
// -500 + 0 = -500, -500 + 1000 = 500, получаем [-500, 500]

            System.out.print(" " + randomNumber); // Без перехода на новую строку
        }

        System.out.println();

        for (int i = 0; i < c; i++) {
            int randomNumber = a + (int) (Math.random() * ((b - a) + 1));
            System.out.println(randomNumber); // C переходом на новую строку
        }

    }
}