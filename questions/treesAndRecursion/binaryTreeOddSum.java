import cs125.trees.BinaryTree;

public class BinaryTreeOddSum {
    public static int oddSum(BinaryTree<Integer> tree) {
        if (tree == null) {
            return 0;
        }

        if (tree.getValue() % 2 != 0) {
            return tree.getValue() + oddSum(tree.getLeft()) + oddSum(tree.getRight());
        } else {
            return oddSum(tree.getLeft()) + oddSum(tree.getRight());
        }
    }
}