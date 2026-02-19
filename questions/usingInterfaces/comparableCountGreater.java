public class CountGreater {
    public static int count(Comparable[] one, Comparable two) {
        assert one != null && two != null;
        int count = 0;
        for (int = 0; i < one.length; i++) {
            // assert one[i] != null;
            if (one[i].compareTo(two) > 0) {
                count++;
            }
        }
        return count;
    }
}