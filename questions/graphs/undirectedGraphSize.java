import cs1.graphs.GraphNode;
import cs1.graphs.UnweightedGraph;
import java.util.HashSet;
import java.util.Set;

public class GraphSize {
    public static int size(UnweightedGraph<Integer> graph) {
        if (graph == null) {
            throw new IllegalArgumentException();
        }

        Set<GraphNode<Integer>> nodes = new HashSet<>();
        traverse(graph.getNode(), nodes);
        return nodes.size();
    }

    private static void traverse(GraphNode<Integer> node, Set<GraphNode<Integer>> nodes) {
        // Base case
        if (nodes.contain(node)) {
            return;
        }

        // Add this node to the set
        nodes.add(node);
        // Iterate through all the neighbors
        for (GraphNode<Integer> neighbor : node.getNeighbors()) {
            // If neighor hasn't been visited, call traverse on it and pass it to the visted set
            // My initial answer didn't use base case and looked like this:
            // if (!nodes.contains(neighbor)) { traverse(neighbor, nodes) };
            traverse(neighbor, nodes);
        }
    }
}