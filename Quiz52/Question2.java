package Quiz52;

import java.util.Scanner;

//Goal: Learn to write while loops.
//
//Assignment: Assuming a Scanner stdin has already been declared and instantiated
// (i.e., Scanner stdin = new Scanner(System.in); is given),
// write a snippet of code that continuously prompts the user for an integer input,
// until that input is a multiple of 3 and print this number.
// No other input validation is needed in this assignment.
public class Question2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int input = 0;
        System.out.print("Please enter an integer: ");
        input = stdin.nextInt();
        while (input % 3 != 0) {
            System.out.print("That is not a multiple of 3. Please enter an integer: ");
            input = stdin.nextInt();
        }
        System.out.println("The number is: " + input);
    }
}
