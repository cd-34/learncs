public class Max {
    public static OurComparable max(OurComparable[] array) {
        assert array != null && array.length > 0 : "input array is null";
        OurComparable max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}