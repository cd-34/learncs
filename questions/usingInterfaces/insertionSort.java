// still need to heavily review this 
// makes sense in my head after heavy googling 
// but probably wouldn't be able to solve again fresh

public class InsertionSorter {
    public static int sort(Comparable[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        }

        int swapCount = 0;
        for (int i = 1; i < array.length; i++) {
            int j = 1;
            while (j > 0 && array[j].compareTo(array[j - 1]) < 0) {
                swapCount++;
                Comparable tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
        return swapCount;
    }
}