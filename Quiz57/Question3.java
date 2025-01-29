package Quiz57;

//Goal: Learn to write for loops.
//
//Assignment: Given an int variable n already declared and initialized, write a code snippet that prints integer values from 1 through n that are both multiples of 3 and end in 1.
//
//For example, if n is 100, your code should print:
//
//21 51 81

public class Question3 {
    public static void main(String args[]) {
        int n = 100;
        for(int i = 1; i <= n; i++) {
            if(i%3 == 0) {
                if((i-1)%10 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
