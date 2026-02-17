public class InsertionSorter {
    public static int sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        }

        int swapCount = 0;

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swapCount++;
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
        return swapCount;
    }
}

/* 
 * [5, 2, 1, 3, 4]
 * j > 0 because j = 1
 * array[j] (2) < array[j - 1] (5) 
 * tmp = 2
 * array[1] = 5
 * array[0] = 2
 * j--
 * j no longer > 0, goes to next array[i]
 * probably would've been much easier to solve this with a second for loop instead of while
 */