public class Car implements OurComparable {
    private int odo;
    public Car(int setOdo) {
        assert setOdo >= 0;
        odo = setOdo;
    }

    @Override 
    public int compareTo(Object other) {
        if (!(other instanceof Car)) {
            throw new IllegalArgumentException();
        }

        Car o = (Car) other;
        return odo - o.odo;
    }
}