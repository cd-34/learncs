public class Modifier {
    public static Modify adder(int input) {
        // Modify other = (value) -> value + input;
        // return other;
        return value -> value + input;
    }
}