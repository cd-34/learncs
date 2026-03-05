import cs125.trees.BinaryTree;

public class BinaryTreeNegativeSum {
    public static int negativeSum(BinaryTree<Integer> input) {
        if (input == null) {
            return 0;
        }

        if (input.getValue() < 0) {
            return input.getValue() + negativeSum(input.getRight()) + negativeSum(input.getLeft());
        } else {
            return negativeSum(input.getRight()) + negativeSum(input.getLeft());
        }
    }
}