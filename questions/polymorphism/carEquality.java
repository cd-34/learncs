public class Car {
    private String make;
    private String model;
    private int mileage;

    public Car(String setMake, String setModel, int setMileage) {
        assert setMake != null && setModel != null;
        make = setMake;
        model = setModel;
        mileage = setMileage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Car)) {
            return false;
        }
        Car other = (Car) o;
        return other.make.equals(make) && other.model.equals(model);
    }
}