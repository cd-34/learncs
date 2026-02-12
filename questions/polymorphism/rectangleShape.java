public class Rectangle extends Shape {
    private double width; 
    private double height;

    public Rectangle(double setWidth, double setHeight) {
        super("rectangle");
        width = setWidth;
        height = setHeight;
    }

    public double area() {
        return width * height;
    }

    @Override 
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Rectangle)) {
            return false;
        }
        Rectangle o = (Rectangle) other;
        return o.height == height && o.width == width;
    }
}