// instantiating boolean bool = true feels very wrong
// probably a much cleaner way to do this

public class Same {
    public static boolean orDifferent(Object[] values) {
        if (values == null || values.length == 0) {
            return false;
        }
        boolean bool = true;
        for (int i = 0; i < values.length; i++) {
            if (values[0] != values[i]) {
                bool = false;
            }
        }
        return bool;
    }
}