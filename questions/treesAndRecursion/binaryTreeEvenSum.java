import cs125.trees.BinaryTree;

public class BinaryTreeEvenSum {
    public static int evenSum(BinaryTree<Integer> tree) {
        if (tree == null) {
            return 0;
        }

        if (tree.getValue() % 2 == 0) {
            return tree.getValue() + evenSum(tree.getRight()) + evenSum(tree.getLeft());
        } else {
            return evenSum(tree.getRight()) + evenSum(tree.getLeft());
        }
    }
}