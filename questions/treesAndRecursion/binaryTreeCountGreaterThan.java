import cs125.trees.BinaryTree;

public class BinaryTreeCountGreaterThan {
    public static int countGreaterThan(BinaryTree<Integer> tree, int input) {
        if (tree == null) {
            return 0;
        }

        // count of number of nodes in the tree that contain value > input
        if (tree.getValue() > input) {
            return 1 + countGreaterThan(tree.getRight(), input)
                + countGreaterThan(tree.getLeft(), input);
        } else {
            return countGreaterThan(tree.getRight(), input) 
                + countGreaterThan(tree.getLeft(), input);
        }
    }
}