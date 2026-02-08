// checking for a tie is really messy 
// maybe I could clean it up to not have to loop over the map twice for the max then a tie check
// with this method, I would not know who tied so thankfully it didn't ask

import java.util.Map;
import java.util.HashMap;

public class Question {
    public static String winner(String input) {
        if (input == null || input.length() <= 0) {
            return null;
        }
    
        String trimmed = input.trim();
        // looked up the regex for this instead of 
        // having to do split() and trim() multiple times
        String[] splitArray = trimmed.split("[,\\s]+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < splitArray.length - 1; i+= 2) {
            // Should've made a variable for splitArray[i] maybe?
            map.put(splitArray[i], map.getOrDefault(splitArray[i], 0) + Integer.parseInt(splitArray[i + 1]));
        }
        int max = 0;
        String player = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                player = entry.getKey();
            }
        }
        int tiecheck = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                tiecheck++;
            }
        }
        if (tiecheck > 1) {
            return "Tie";
        } else { 
            return player;
        }
    }
}