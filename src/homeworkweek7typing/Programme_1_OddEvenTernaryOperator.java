package homeworkweek7typing;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number: ");
        int number = sc.nextInt();
        isItOddOrEvenNumber(number);
        // closing the scanner object
        sc.close();
    }

    // Checking the number is even or odd

    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " Number");
    }


}
