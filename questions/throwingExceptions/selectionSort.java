import java.util.List;
import java.util.ArrayList;

public class SelectionSorter {
    public static List<Integer> selectionSort(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            /* 
             * For example, if we have [5, 2, 1, 1, 3]
             * We'd start at index 0 (value = 5)
             * but the second j loop lets us go and parse through index 1 > 4
             * Then, as we sort the first value
             * We go back to the i loop starting at the next index
             * loop i starts at index 1 (value = 2), while j loop goes from that index to the end
             */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]) >= array[minIndex]) {
                    continue;
                }
                minIndex = j;
            }

            list.add(minIndex);
            // Swap the lowest into the remaining leftmost value
            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
        return list;
    }
}