public class Dog {
    private double age;

    public Dog(double setAge) {
        assert setAge >= 0.0;
        age = setAge;
    }

    public static boolean isOlder(Dog one, Dog two) {
        assert one != null && two != null;
        return one.age > two.age;
    }
}