public class Partitioner {
    public static int partition(int[] values) {
        if (values == null || values.length == 0) {
            return -1;
        }

        int pivot = values[0];
        int boundary = 1;
        for (int i = boundary; i < values.length; i++) {
            if (values[i] < pivot) {
                int temp = values[boundary];
                values[boundary] = values[i];
                values[i] = temp;

                boundary++;
            }
        }

        int temp = values[boundary - 1];
        values[boundary - 1] = pivot;
        values[0] = temp;

        return boundary - 1;
    }
}