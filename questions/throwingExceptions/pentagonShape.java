public class Pentagon extends Shape {
    private double side;

    public Pentagon(double sideLength) {
        super("pentagon");
        if (sideLength <= 0) {
            throw new IllegalArgumentException();
        }
        side = sideLength;
    }

    public double area() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    @Override 
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Pentagon)) {
            return false;
        }
        Pentagon o = (Pentagon) other;
        return o.side == side;
    }
}