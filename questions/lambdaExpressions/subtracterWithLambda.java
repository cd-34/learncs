// the "v" doesn't have to match the "value" name in the interface
public class Modifier {
    public static Modify subtracter(int input) {
        // return v -> v - input;
        Modify other = (v) -> input - v;
        return other;
    }
}