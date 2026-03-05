import cs125.trees.BinaryTree;
import java.util.Map;
import java.util.HashMap;

public class BinaryTreeToMap {
    public static Map<Object, Integer> toMap(BinaryTree<?> tree) {
        // check for null
        if (tree == null) {
            throw new IllegalArgumentException();
        }

        // create your map
        Map<Object, Integer> map = new HashMap<>();
        // call the helper method to populate the map
        toMap(tree, map); 
        // return the map
        return map;
    }

    // helper method
    private static void toMap(BinaryTree<?> tree, Map<Object, Integer> values) {
        if (tree == null) {
            return;
        }
        int count = values.getOrDefault(tree.getValue(), 0);
        values.put(tree.getValue(), count + 1);
        toMap(tree.getLeft(), values);
        toMap(tree.getRight(), values);
    }
}