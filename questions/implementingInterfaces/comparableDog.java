public class Dog implements Comparable {
    private double weight;
    public Dog(double setWeight) {
        assert setWeight > 0;
        weight = setWeight;
    }

    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Dog)) {
            return 0;
        }

        Dog o = (Dog) other;
        if (weight > o.weight) {
            return 1;
        } else if (weight == o.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}