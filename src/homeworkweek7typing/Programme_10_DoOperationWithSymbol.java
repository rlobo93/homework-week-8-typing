package homeworkweek7typing;

import java.util.Scanner;

/**
 *
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else).
 *
 */

public class Programme_10_DoOperationWithSymbol {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char symbol = sc.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        //Closing the scanner object
        sc.close();
    }

    // Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {

        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please Enter Correct Symbol +,-,*,/");
        }

    }

}
