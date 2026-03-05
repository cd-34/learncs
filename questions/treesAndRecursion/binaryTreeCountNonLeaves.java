import cs125.trees.BinaryTree;

public class BinaryTreeCounter {
    public static int countNonLeaves(BinaryTree<Object> tree) {
        if (tree == null) {
            return 0;
        }

        // if getLeft or getRight == null (is a leaf)
        // return 0
        // else 
        // return 1, recursive call
        if (tree.getLeft() != null || tree.getRight() != null) {
            return 1 + countNonLeaves(tree.getLeft()) + countNonLeaves(tree.getRight());
        } else {
            return 0;
        }
    }
}