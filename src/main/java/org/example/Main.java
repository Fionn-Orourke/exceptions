
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter a number between 0-9");
                String input = scanner.nextLine();
                int myNum = Integer.parseInt(input);

                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    break;
                } else {
                    System.out.println("Invalid input. Number must be between 0 and 9.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number. Please enter a digit.");
            }
        }

        scanner.close();
    }
}
