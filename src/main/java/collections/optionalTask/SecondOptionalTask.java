package collections.optionalTask;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 * 2. Enter a number, push its digits onto the stack. Print a number with digits in reverse order.
 */

public class SecondOptionalTask {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        int number = 0;
        System.out.println("Input number here:");
        Scanner scanner = new Scanner(System.in);

        try { number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect value!");
        }

        char [] digitsOfNumber = String.valueOf(number).toCharArray();
        for(char digit : digitsOfNumber) {
            stack.push(digit);
        }

        while(!stack.empty()) {
            char reverseNumber = stack.pop();
            System.out.print(reverseNumber);
        }
    }
}