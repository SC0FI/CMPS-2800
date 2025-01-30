package Project_4;

public class MyCircle {
    /* Attributes/Data fields/Properties */
    // YOUR CODE HERE
    private double x;
    private double y;
    private double radius;
    /* Constructor(s) */
    public MyCircle () {
        x = 0;
        y = 0;
        radius = 1;
    }

    public MyCircle (double inputRadius) {
        x = 0;
        y = 0;
        if (inputRadius > 0) {
            radius = inputRadius;
        } else {
            radius = 1;
        }
    }
    public MyCircle (double inputX, double inputY) {
        x = inputX;
        y = inputY;
        radius = 1;
    }
    public MyCircle (double inputX, double inputY, double inputRadius) {
        x = inputX;
        y = inputY;
        if(inputRadius > 0) {
            radius = inputRadius;
        } else {
            radius = 1;
        }
    }

    /* Method(s) */
    // Getters and Setters
    public void setRadius(double inputRadius) {
        if(inputRadius > 0) {
            radius = inputRadius;
        }
    }
    public double getRadius() {
        return radius;
    }
    public void setX(double inputX) {
        x = inputX;
    }
    public double getX() {
        return x;
    }
    public void setY(double inputY) {
        y = inputY;
    }
    public double getY() {
        return y;
    }
    // Other helpful methods
    public boolean contains(double inputX, double inputY) {
        double distance = Math.sqrt(Math.pow(inputX - x, 2) + Math.pow(inputY - y,2));
        return distance <= radius;
    }
}