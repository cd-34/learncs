import java.util.Map;
import java.util.HashMap;

public class CountLetters {
    public static Map<String, Integer> countLetters(String[] input) {
        assert input != null : "Input string array is null";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > 0) {
                String key = input[i].substring(0, 1);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        return map;
    }
}