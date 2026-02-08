// Definitely incorrect. Need to come back to this later.

public class Partitioner {
    public static int[] partition(int[] values) {
        // take int[0] value as the pivot
        if (values == null || values.length == 0) {
            return new int[]{-1};
        } else {
            int pivot = values[0];
            int count = 0;
            int[] newArray = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                if (values[i] < pivot) {
                    newArray[count] = values[i];
                    count++;
                }
            }
            newArray[count] = pivot;
            count++;
            for (int i = 0; i < values.length; i++) {
                if (values[i] >= pivot) {
                    newArray[count] = values[i];
                    count++;
                }
            }
            return newArray;
        }
    }
}