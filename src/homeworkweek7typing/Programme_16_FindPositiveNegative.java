package homeworkweek7typing;

import java.util.Scanner;
/**
 *
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”.
 *
 */

public class Programme_16_FindPositiveNegative {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        sc.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " Is a POSITIVE Number");
        } else if (number < 0) {
            System.out.println(number + " Is a NEGATIVE Number");
        } else {
            System.out.println(number + " Is ZERO");
        }
    }

}
