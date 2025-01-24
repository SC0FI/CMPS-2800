package Project_1;
import java.util.Scanner;

public class Project_1 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade");
        double score = scanner.nextDouble();
        if (score >= 60) {
            System.out.println("D");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 90) {
            System.out.println("A");
        }
        else if (score < 60) {
            System.out.println("F");
        }
    }

}