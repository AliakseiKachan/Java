package fundamentals.mainTask;

import java.util.Scanner;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Please, input your name here:");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello " + input.nextLine() + "!");

    }
}