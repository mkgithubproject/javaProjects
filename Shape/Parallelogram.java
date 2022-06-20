package shapes;

public class Parallelogram implements Shape{
    // instance variable
    private double length;
    private double width;
  // constructor
    public Parallelogram() {
    }
   // constructor
    public Parallelogram(double length, double width) {
        this.length = length;
        this.width = width;
    }
   // setters and getters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}
