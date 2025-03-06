package Practice;

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0, "Red", true);
        System.out.println("Circle: " + circle);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Circumference of Circle: " + circle.circumference());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        System.out.println("\nRectangle: " + rectangle);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
    }
}
