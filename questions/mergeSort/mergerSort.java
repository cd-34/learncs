public class Mergesort extends Merge {
    public int[] mergesort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
    
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = copyOfRange(array, 0, mid);
        int[] right = copyOfRange(array, mid, array.length);

        return merge(mergesort(left), mergesort(right));
    }

}