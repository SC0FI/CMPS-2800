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
                System.out.println("Letter grade is " + LetterGrade(average));

            }
        }
    }
    public static char LetterGrade(double grade) {
        if (grade >=90) {
            return('A');
        }
        else if (grade >= 80) {
            return('B');
        }
        else if (grade >= 70) {
            return('C');
        }
        else if (grade >= 60) {
            return('D');
        }
        else {
            return('F');
        }
    }
}