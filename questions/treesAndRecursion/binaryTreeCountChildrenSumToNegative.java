import cs125.trees.BinaryTree;

public class BinaryTreeCounter {
    public static int countChildSumToNegative(BinaryTree<Integer> tree) {
        if (tree == null) {
            return 0;
        }
        if (tree.getLeft() != null || tree.getRight() != null) {
            int sum = 0;
            if (tree.getLeft() != null) {
                sum += tree.getLeft().getValue();
            }
            if (tree.getRight() != null) {
                sum += tree.getRight().getValue();
            }
            if (sum < 0) {
                return 1 + countChildSumToNegative(tree.getLeft()) + countChildSumToNegative(tree.getRight());
            }
        }
        return countChildSumToNegative(tree.getLeft()) + countChildSumToNegative(tree.getRight());
    }
}