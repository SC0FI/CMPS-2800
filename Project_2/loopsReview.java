package Project_2;
import java.util.Scanner;
// homework calculate average and display to user. then provide a letter grade.
//completed homework 3:21 PM 1/28/25
public class loopsReview {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double count = 0;
        double average = 0;
        while(grade >= 0) {
            System.out.println("please input grade from 0 to 110 (-1 to terminate)");
            grade = input.nextDouble();
            if (grade > 110) {
                System.out.println("Invalid");
            }
            else {
                sum += grade;
                count++;
                System.out.println("sum is " + sum);
                average = sum/count;
                System.out.println("average is " + average);
                if (average >=90) {
                    System.out.println("Letter Grade is A");
                }
                else if (average >= 80) {
                    System.out.println("Letter Grade is B");
                }
                else if (average >= 70) {
                    System.out.println("Letter Grade is C");
                }
                else if (average >= 60) {
                    System.out.println("Letter Grade is F");
                }
            }
        }
    }
}