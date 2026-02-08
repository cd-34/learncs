public class Exceptioner {
    public static Exception exceptionable(int input) {
        assert input >= 0 && input <= 3;
        if (input == 0) {
            return new IllegalStateException();
        } else if (input == 1) {
            return new NullPointerException();
        } else if (input == 2) {
            return new ArithmeticException();
        } else {
            return new IllegalArgumentException();
        }
    }
}