public class Factorial {
    public static long factorial(long input) {
        if (input < 0 || input > 20) {
            throw new IllegalArgumentException();
        }
        if (input <= 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}