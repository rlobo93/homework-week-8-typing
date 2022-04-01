package homeworkweek7typing;

import java.util.Scanner;

/**
 *
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 *
 */

public class Programme_9_PrintCityNameWithSwitch {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F: ");
        String city = sc.next().toUpperCase();
        //Create object and call instance method
        Programme_9_PrintCityNameWithSwitch cityName = new Programme_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        //Closing the scanner object
        sc.close();

    }

    //Printing city name
    public void printCityName(String city) {

        switch (city) {
            case "A":
                System.out.println("America");
                break;
            case "B":
                System.out.println("Birmingham");
                break;
            case "C":
                System.out.println("Canada");
                break;
            case "D":
                System.out.println("Dubai");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Farnborough");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }

    }



}
