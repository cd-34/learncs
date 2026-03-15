import cs1.graphs.GraphNode;
import cs1.graphs.UnweightedGraph;
import java.util.HashSet;
import java.util.Set;

public class GraphCount {
    public static int count(UnweightedGraph<Integer> graph, int atLeast) {
        if (graph == null || atLeast <= 0) {
            throw new IllegalArgumentException();
        }

        int total = 0;
        for (GraphNode<Integer> node : graph.getNodes()) {
            // Create a new visited set
            Set<GraphNode<Integer>> seen = new HashSet();
            count(node, seen, 2);
            // Check size of seen
            if (seen.size() - 1 >= atLeast) {
                total++;
            }
        }
        return total;
    }

    private static void count(GraphNode<Integer> node, set<GraphNode<Integer>> seen, int distance) {
        seen.add(node);
        
        if (distance == 0) {
            return;
        }

        for (GraphNode<Integer> neighbor : node.getNeighbors()) {
            count(neighbor, seen, distance - 1);
        }
    }
}