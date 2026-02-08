public class Comparison {
    public static int compare(Object one, Object two) {
        if (one == two) {
            return 0;
        } else if (one != null && one.equals(two)) {
            return 1;
        } else {
            return -1;
        }
    }
}