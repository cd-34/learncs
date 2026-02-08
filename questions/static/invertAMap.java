import java.util.Map;
import java.util.HashMap;

public class Inverter {
    public static Map<Integer, String> invert(Map<String, Integer> map) {
        assert map != null;

        Map(Integer, String) inv = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inv.put(entry.getValue(), entry.getKey());
        }
        return inv;
    }
}