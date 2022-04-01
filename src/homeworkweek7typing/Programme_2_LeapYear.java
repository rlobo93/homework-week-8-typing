package homeworkweek7typing;

import java.util.Scanner;

/**
 *  *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */





public class Programme_2_LeapYear {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Year:");
        int year = sc.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        // closing the scanner object
        sc.close();
    }


    // Checking is it leap year or not

    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The Year " + year + " is Leap Year ");
            return;
        }
        System.out.println("The Year " + year + " is not a Yeap Year ");
    }


}
