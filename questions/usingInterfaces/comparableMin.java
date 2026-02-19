public class Min {
    public static Comparable min(Comparable[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Comparable minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum.compareTo(array[i]) > 0) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}