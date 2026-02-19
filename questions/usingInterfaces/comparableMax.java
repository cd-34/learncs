public class Max {
    public static Comparable max(Comparable[] array) {
        assert array != null && array.length > 0;
        Comparable maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            // System.out.println(array[i]);
            if (maximum.compareTo(array[i]) < 0) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}