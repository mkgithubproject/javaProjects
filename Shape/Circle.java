package shapes;

public class Circle implements Shape{
    private double radius;// instance variable
    @Override
    public double perimeter() {
        return 3.14*2*radius;
    }
   // constructor
    public Circle(double radius) {
        this.radius = radius;
    }
// default constructor
    public Circle() {
    }
   // setters and getters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
