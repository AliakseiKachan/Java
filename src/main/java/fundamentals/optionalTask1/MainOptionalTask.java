package fundamentals.optionalTask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 * 5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 */

public class MainOptionalTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input quantity of numbers: ");
        int quantity = input.nextInt();

        int[] arrayOfNumbers = new int[quantity];

        System.out.println("Input values: ");

        for (int i = 0; i < quantity; i++) {
            arrayOfNumbers[i] = input.nextInt();
        }

        System.out.println("Your values: " + Arrays.toString(arrayOfNumbers));

        System.out.println("\nTask 1");

        String maxLen = Integer.toString(MainOptionalTask.maxNumber(arrayOfNumbers));
        String minLen = Integer.toString(MainOptionalTask.minNumber(arrayOfNumbers));
        System.out.println("The length of max number is: " + maxLen.length());
        System.out.println("The length of min number is: " + minLen.length());

        System.out.println("\nTask 2");

        Arrays.sort(arrayOfNumbers);
        System.out.print("Sorted numbers from min to max: ");
        System.out.println(Arrays.toString(arrayOfNumbers));

        Arrays.setAll(arrayOfNumbers , i -> ~arrayOfNumbers[i]);
        Arrays.sort(arrayOfNumbers);
        Arrays.setAll(arrayOfNumbers , i -> ~arrayOfNumbers[i]);

        System.out.print("Sorted numbers from max to min: ");
        System.out.println(Arrays.toString(arrayOfNumbers));

        System.out.println("\nTask 3");

        int[] temp = new int[quantity];
        biggerSmallerThanAverage(arrayOfNumbers, quantity, temp);

        System.out.println("\nTask 5");

        findNumbers(arrayOfNumbers);
    }

    private static int maxNumber (int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The max number is: " + max);
        return max;
    }

    private static int minNumber (int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The min number is: " + min);
        return min;
    }

    private static void biggerSmallerThanAverage(int[] arrayOfNumbers, int quantity, int[] temp) {

        double average = 0;
        int sum = 0;
        int count = 0;
        int number;

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            number = arrayOfNumbers[i];
            while ( number > 0) {
                number /= 10;
                count++;
            }
            temp[i] += count;
            sum += count;
            count = 0;
        }

        average = (double) sum/quantity;

        System.out.printf("The sum length of all numbers: " + sum + ", average length: %.2f", average);
        System.out.println();
        System.out.println();
        System.out.println("Numbers with length bigger than average length:");

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(temp[i] > average) {
                String len = Integer.toString(arrayOfNumbers[i]);
                System.out.println(arrayOfNumbers[i] + " and it's length: " + len.length());
            }
        }

        System.out.println();
        System.out.println("Numbers with length smaller than average length:");

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(temp[i] < average) {
                String len = Integer.toString(arrayOfNumbers[i]);
                System.out.println(arrayOfNumbers[i] + " and it's length: " + len.length());
            }
        }
    }

    private static void findNumbers(int[] array) {

        int countEvenDigits = 0;
        int countOddDigits = 0;
        int countNumbersWithOnlyEvenDigits = 0;
        int countNumbersWithEqualEvenOddDigits = 0;

        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> digits = new ArrayList<>();
            while (array[i] != 0) {
                digits.add(array[i] % 10);
                array[i] /= 10;
            }
            for (int j = 0; j < digits.size(); j++) {
                if (digits.get(j) % 2 == 0) {
                    countEvenDigits++;
                } else {
                    countOddDigits++;
                }
            }
            if (countEvenDigits == digits.size()) {
                countNumbersWithOnlyEvenDigits++;
            } else if (countEvenDigits == countOddDigits) {
                countNumbersWithEqualEvenOddDigits++;
            }
            countEvenDigits = 0;
            countOddDigits = 0;
        }

        System.out.println("Quantity of numbers with only even digits: " + countNumbersWithOnlyEvenDigits);
        System.out.println("Quantity of numbers with equal count of even and odd digits: " + countNumbersWithEqualEvenOddDigits);
    }
}