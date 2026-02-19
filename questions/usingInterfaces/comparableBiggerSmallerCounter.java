public class BiggerSmallerCounter {
    private Comparable start;
    private int large = 0;
    private in small = 0;

    public BiggerSmallerCounter(Comparable input) {
        start = input;
        // System.out.println(start);
    }

    public void add(Comparable input) {
        // System.out.println(start.compareTo(input));
        if (start.compareTo(input) < 0) {
            large++;
        } else if (start.compareTo(input) > 0) {
            small++;
        }
    }
    public int bigger() {
        // System.out.println(large);
        return large;
    }

    public int smaller() {
        return small;
    }
}