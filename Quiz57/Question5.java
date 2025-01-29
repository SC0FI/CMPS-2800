package Quiz57;
import java.util.Scanner;
//Goal: Learn to write for loops.
//
//Assignment: Assume a Scanner stdin has already been declared and instantiated. Write some code that takes two int inputs from the user and then uses a for loop to calculate their Greatest Common Denominator. Print the result.

public class Question5 {
    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int number1 = stdin.nextInt();
        int number2 = stdin.nextInt();
        int gcd = 1;
        for(int i = 1; i <= number1+number2; i++) {
            if(number1%i == 0) {
                if(number2%i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.println("GCD is: " + gcd);

    }
}
