public class BinarySearcher {
    public static boolean search(SearchList list, Comparable input) {
        if (list == null || input == null || list.size() == 0) {
            throw new IllegalArgumentException();
        }

        int start = 0;
        int end = list.size();

        while (start < end) {
            int mid = (start + end) / 2;
            Comparable midValue = list.get(mid);
            if (input.compareto(midValue) == 0) {
                return true;
            } else if (input.compareTo(midValue) > 0) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return false;
    }
}