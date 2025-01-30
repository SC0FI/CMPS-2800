package Project_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCircle c = new MyCircle(); // default circle
        System.out.println("Circle attributes are: radius = " + c.getRadius() + ", center = ("+c.getX()+", "+c.getY()+")");
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println("Is point (" +x+ ", " +y+ ") inside the circle object? " + c.contains(x,y));

        c.setX(input.nextDouble());
        c.setY(input.nextDouble());
        c.setRadius(input.nextDouble());

        System.out.println("Circle attributes are: radius = " + c.getRadius() + ", center = ("+c.getX()+", "+c.getY()+")");
        System.out.println("Is point (" +x+ ", " +y+ ") inside the circle object? " + c.contains(x,y));
    }
}