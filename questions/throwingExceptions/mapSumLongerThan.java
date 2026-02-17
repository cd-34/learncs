import java.util.Map;

public class Summer {
    public static int sumLongerThan(Map<String, Integer> map, int input) {
        int sum = 0;

        if (map == null || input < 0) {
            throw new IllegalArgumentException();
        }

        for (String key : map.keySet()) {
            if (key.length() > input) {
                sum = sum + map.get(key);
            }
        }
        return sum;
    }
}