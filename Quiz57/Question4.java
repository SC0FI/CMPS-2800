package Quiz57;

//Goal: Learn to write for loops.
//
//Assignment: Write a for loop that prints all the integers from 300 down to 150 inclusive that are multiples of 3, each separated by exactly one space. There should be no space before the first number and after the last number in the output.

public class Question4 {
    public static void main(String args[]) {
        for(int i = 300; i >= 150; i -=1) {
            if (i%3 == 0) {
                if(i == 150) {
                  System.out.print(i);
                  break;
                }
                System.out.print(i + " ");

            }
        }
    }
}
