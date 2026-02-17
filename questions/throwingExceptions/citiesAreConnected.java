import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Connections {
    private Map<String, Set<String>> graph = new HashMap<>();

    public Connections(String setCSV) {
        if (setCSV == null) {
            throw new IllegalArgumentException();
        }

        // gives us Source, City, City, City
        String[] lines = setCSV.split("\n");
        // parse through each line
        for (int i = 0; i < lines.length; i++) {
            String[] parts = lines[i].split(",");
            String source = parts[0].trim();
            // now separated by source and city
            // iterate through to grab all the cities and put them into a set
            Set<String> city = new HashSet<>();
            for (int j = 1; j < parts.length; j++) {
                city.add(parts[j].trim());
            }
            // we now have source 
            // and all of the cities connected to the source
            // place them into a map as keys and values
            graph.put(source, city);
        
        }
    }

    public boolean isConnected(String source, String connected) {
        if (source == null || connected == null) {
            throw new IllegalArgumentException();
        }
        if (!graph.containsKey(source)) {
            throw new IllegalArgumentException();
        }
        
        return graph.get(source).contains(connected);
    }
}