package homeworkweek7typing;

import java.util.Scanner;

public class Programme_13_FindTheDayName {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7: ");
        int day = sc.nextInt();
        findTheDaysName(day);
        //Closing the scanner object
        sc.close();
    }

    // Finding the name of the day
    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }

}
