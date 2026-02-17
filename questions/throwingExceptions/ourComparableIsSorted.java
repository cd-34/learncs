import java.util.List;

public class Sorted {
    public static boolean isSorted(List<OurComparable> input) {
        if (input == null || input.size() == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).compareTo(input.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}