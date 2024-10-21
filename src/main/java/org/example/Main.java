package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Please enetr a number between 0-9");
        Scanner myscan = new Scanner(System.in);
        String input = myscan.nextLine();

        int myNum = Integer.parseInt(input);
        if(myNum >= 0 && myNum <= 9){
            System.out.println("you entered " + myNum);
        }

        else {
            System.out.println("Not a valid number");
        }

    }
}