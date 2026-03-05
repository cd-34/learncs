import cs125.trees.BinaryTree;

public class BinaryTreeCounter {
    public static int countLeaves(BinaryTree<Object> tree) {
        if (tree == null) {
            return 0;
        }

        // if both left + right == null (leaf)
        // return 1 
        // else 
        // recursively check left and right
        if (tree.getLeft() == null && tree.getRight() == null) {
            return 1;
        } else {
            return countLeaves(tree.getLeft()) + countLeaves(tree.getRight());
        }
    }
}