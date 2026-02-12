public class Circle extends Shape {
    private double rad;

    public Circle(double setRad) {
        super("circle");
        rad = setRad;
    }

    public double area() {
        return Math.PI * rad * rad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) o; 
        return other.rad == rad;
    }
}