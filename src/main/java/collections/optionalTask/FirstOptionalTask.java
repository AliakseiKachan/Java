package collections.optionalTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * 1. Enter lines from the file, write to the list. Output the lines to a file in reverse order.
 */

public class FirstOptionalTask {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        try (Scanner scanner = new Scanner
                (new File("C:/Java/src/main/java/collections/optionalTask/input.txt"));
             FileWriter writer = new FileWriter
                     (new File("C:/Java/src/main/java/collections/optionalTask/output.txt"))
            ) {

            while (scanner.hasNextLine()) {
                stack.push(scanner.nextLine());
            }

            int sizeOfStack = stack.size();
            for (int i = 0; i < sizeOfStack; i++) {
                writer.write(stack.pop() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}