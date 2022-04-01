package homeworkweek7typing;

import java.util.Scanner;

/**
 *
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 *
 */

public class Programme_8_PrintCityName {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F: ");
        char city = sc.next().charAt(0);
        // Object creation
        Programme_8_PrintCityName cityName = new Programme_8_PrintCityName();
        cityName.printCityName(city);

        //Closing the scanner object
        sc.close();
    }

    //Printing city name
    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("America");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Birmingham");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Canada");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Dubai");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Farnborough");
        } else {
            System.out.println("The Alphabet you enter is not between A to F");
        }
    }


}
