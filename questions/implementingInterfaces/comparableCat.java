public class Cat implements Comparable {
    private double age;

    public Cat(double setAge) {
        assert setAge >= 0;
        age = setAge;
    }

    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Cat)) {
            return 0;
        }
        Cat o = (Cat) other;
        if (age < o.age) {
            return -1;
        } else if (age == o.age) {
            return 0;
        } else {
            return 1;
        }
    }
}