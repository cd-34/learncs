public class BinarySearcher {
    public static boolean search(SearchList list, int input) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException();
        }

        int start = 0;
        int end = list.size();

        while (start < end) {
            int mid = (start + end) / 2;
            int midValue = list.get(mid);

            if (input == midValue) {
                return true;
            } else if (input > midValue) { 
                // imagine this would start the search at 75% of the initial array
                // we're now starting at the middle, and we'll search the middle of that
                start = mid + 1;
            } else {
                // imagine this would start the search at 25% of the initial array
                // we're now only looking at the first half of the initial array
                end = mid; 
            }
        }
        return false;
    }
}