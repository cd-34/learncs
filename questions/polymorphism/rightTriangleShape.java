public class RightTriangle extends Shape {
    private double side;

    public RightTriangle(double input) {
        super("righttriangle");
        side = input;
    }

    public double area() {
        return side * side * 0.5;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof RightTriangle)) {
            return false;
        }
        RightTriangle o = (RightTriangle) other;
        // can compare area() or side - both will work
        // return o.side == side;
        return o.area() == area();
    }
}