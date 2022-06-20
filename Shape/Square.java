package shapes;

public class Square implements Shape{
   private double side;// instance variable

    public Square() {
    }
   // constructor
    public Square(double side) {
        this.side = side;
    }
   // getters and setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double perimeter() {
        return 4*side;
    }
}
