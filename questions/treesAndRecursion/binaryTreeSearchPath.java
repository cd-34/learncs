import cs125.trees.BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public static List<Object> pathToValue(BinaryTree<Object> tree, Object value) {
        if (tree == null || value == null) {
            throw new IllegalArgumentException();
        }

        List<Object> path = new ArrayList<>();
        if (pathToValue(tree, value, path)) {
            return path;
        } else {
            return null;
        }
    }

    // returns true if value is in the tree
    // if true, add to List<Object> path
    private static boolean pathToValue(BinaryTree<Object> tree, Object value, List<Object> path) {
        // if you reach an empty tree, return false as it does not contain the value
        if (tree == null) {
            return false;
        }

        // otherwise, if this node contains the value, add to the list
        // stop recursing, and return true
        // otherwise, search right subtree. 
        // If that succeeds, that node would also be part of the path and should be added
        // if not try left subtree
        if (tree.getValue().equals(value)
            || pathToValue(tree.getRight(), value, path)
            || pathToValue(tree.getLeft(), value, path)) {
            path.add(0, tree.getValue());
            return true;
        }

        // if neither left nor right contain node, return false and do not modify list
        return false;
    }
}