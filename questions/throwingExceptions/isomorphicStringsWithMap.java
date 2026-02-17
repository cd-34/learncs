import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean areIsometric(String one, String two) {
        if (one == null || two == null) {
            throw new IllegalArgumentException();
        }
        if (one.length() != two.length()) {
            return false;
        }

        Map<Character, Character> mapOne = new HashMap<>();
        Map<Character, Character> mapTwo = new HashMap<>();

        for (int i = 0; i < one.length(); i++) {
            char c1 = one.charAt(i);
            char c2 = two.charAt(i);
            if (mapOne.containsKey(c1) && !mapOne.containsValue(c2) 
            || mapTwo.containsKey(c2) && !mapTwo.containsValue(c1)) {
                return false;
            }
            mapOne.put(c1, c2);
            mapTwo.put(c2, c1);
        }
        return true;
    }
}