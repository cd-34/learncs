public class SameCount {
    public static int count (Object[] one, Object[] two) {
        assert one != null : "Passed array is null";
        int count = 0;
        for (int i = 0; i < one.length; i++) {
            if (one[i] == two) {
                count++;
            }
        }
        return count;
    }
}