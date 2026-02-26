public class RangeSum {
    public static int sum(int input) {
        if (input < 0 || input > 128) {
            throw new IllegalArgumentException();
        }
        if (input == 1) {
            return 1;
        }
        return input + sum(input - 1);
    }
}