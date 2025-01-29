package Quiz57;

//Goal: Learn to write for loops.
//
//Assignment: Given an int variable n already declared and initialized. Write a for loop that prints the first n Lucas numbers. They are defined as follows: U0=2, U1=1, Un+2=Un+1 + Un. Declare and initialize all other necessary variables.
//
//For example, if n is 5, your code should print:

public class Question2 {
    public static void main(String args[]) {
        int u0 = 2;
        int u1 = 1;
        int un = 0;
        int n = 5;
        System.out.println("u0 = " + u0);
        System.out.println("u1 = " + u1);
        for (int i = 2; i <= n; i++) {
            un = u1 + u0;
            System.out.println("u" + i + " = " + un);
            u0 = u1;
            u1 = un;
        }
    }
}
