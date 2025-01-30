package Quiz52;

import java.util.Scanner;

//Assignment: Assume a Scanner input has already been declared and instantiated
// (i.e., Scanner input = new Scanner(System.in); is given),
// write a code snippet that reads 10 input values from the user,
// without a prompt. Your program should only
// print back the input if it is a multiple of 5.
// No further input validation is required here.
// Declare all necessary variables. Do not prompt the user with text.
// Print each number on a separate line.
public class Question3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(i <=10) {
            int number = input.nextInt();
            if (number % 5 == 0) {
                System.out.println(number);
            }
        i++;
        }
    }
}
