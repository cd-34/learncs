public class Fish implements Comparable {
    private double length;

    public Fish(double setLength) {
        assert setLength > 0;
        length = setLength;
    }

    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Fish)) {
            return 0;
        }

        Fish o = (Fish) other;
        if (length > o.length) {
            return -1;
        } else if (length == o.length) {
            return 0;
        } else {
            return 1;
        }
    }
}