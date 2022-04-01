package homeworkweek7typing;

import java.util.Scanner;
/**
 *
 * Write a program that tells us input value is number or an alphabet or symbol.
 *
 */
public class Programme_12_FindInputValue {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character : ");
        char ch = sc.next().charAt(0);
        //Object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        sc.close();
    }

    // Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " Is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " Is a DIGIT.");
        } else {
            System.out.println(ch + " Is a SYMBOL.");
        }

    }


}
