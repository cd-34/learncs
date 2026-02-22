public class Car implements Comparable {
    private int odo;
    public Car(int setOdo) {
        assert setOdo >= 0;
        odo = setOdo;
    }

    @Override 
    public int compareTo(Object other) {
        if (!(other instanceof Car)) {
            return 0;
        }
        Car o = (Car) other;
        return odo - o.odo;
    }
}