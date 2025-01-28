package ClassJan28th2025;
import java.util.Scanner;
// homework calculate average and display to user. then provide a letter grade.
public class loopsReview {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double count = 0;
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
            }
        }
    }
}