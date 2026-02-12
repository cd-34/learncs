public class Square extends Shape {
    private double side;

    public Square(double setSide) {
        super("square");
        side = setSide;
    }

    public double area() {
        return side * side;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Square)) {
            return false;
        }
        Square o = (Square) other;
        return o.side == side;
        // return o.area() == area();
    }
}