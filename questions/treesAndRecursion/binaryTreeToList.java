import cs125.trees.BinaryTree;
import java.util.List;
import java.util.ArrayList;

public class BinaryTreeToList {
    public static List<Object> toList(BinaryTree tree) {
        // check for null
        if (tree == null) {
            throw new IllegalArgumentException;
        }

        // create your list
        List<Object> list = new ArrayList<>();
        // call the helper method to populate the list
        toList(tree, list);
        // return the list
        return list;
    }

    // helper method
    private static void toList(BinaryTree tree, List<Object> values) {
        if (tree == null) {
            return;
        }

        values.add(tree.getValue());
        toList(tree.getLeft(), values);
        toList(tree.getRight(), values);
    }
}