import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Unique {
    public static int uniqueItems(List<Object> inputlist) {
        Map<Object, Integer> unique = new HashMap<>();
        for (int i = 0; i < inputlist.size(); i++) {
            Object key = inputlist.get(i);
            unique.put(key, unique.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Object, Integer> entry : unique.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        return count;
    }
}