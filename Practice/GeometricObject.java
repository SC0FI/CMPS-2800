package Practice;

// Superclass: GeometricObject
public class GeometricObject {
    private String color;
    private boolean filled;

    // Default constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    // Constructor with parameters
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and setter for filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method to return a string description of the object
    public String toString() {
        return "Color: " + color + ", Filled: " + filled;
    }
}

// Subclass: Circle
class Circle extends GeometricObject {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with parameters
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Calling the superclass constructor
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Override the toString method to include Circle-specific details
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}

// Subclass: Rectangle
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with parameters
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled); // Calling the superclass constructor
        this.width = width;
        this.height = height;
    }

    // Getter and setter for width and height
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate area of the rectangle
    public double area() {
        return width * height;
    }

    // Method to calculate perimeter of the rectangle
    public double perimeter() {
        return 2 * (width + height);
    }

    // Override the toString method to include Rectangle-specific details
    @Override
    public String toString() {
        return super.toString() + ", Width: " + width + ", Height: " + height;
    }
}

class Square extends Rectangle{}    
