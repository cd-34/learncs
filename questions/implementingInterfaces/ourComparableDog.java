public class Dog implements OurComparable {
    private double weight;
    
    public Dog(double setWeight) {
        assert setWeight > 0;
        weight = setWeight;
    }

    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Dog)) {
            throw new IllegalArgumentException("not dog");
        }
    }
    Dog o = (Dog) other;
    if (weight > o.weight) {
        return 1;
    } else if (weight < o.weight) {
        return -1;
    } else {
        return 0;
    }
}