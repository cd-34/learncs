public class MinMax {
    private Comparable minimum;
    private Comparable maximum;
    
    public MinMax(Comparable setMinMax) {
        minimum = setMinMax;
        maximum = setMinMax;
    }

    public void add(Comparable input) {
        if (input.compareTo(minimum) < 0) {
            minimum = input;
        }
        if (input.compareTo(maximum) > 0) {
            maximum = input;
        }
    }

    public Comparable min() {
        return minimum;
    }

    public Comparable max() {
        return maximum;
    }
}