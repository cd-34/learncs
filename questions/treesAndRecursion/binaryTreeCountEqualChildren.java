import cs125.trees.BinaryTree;

public class BinaryTreeCounter {
    public static int countEqualChildren(BinaryTree<?> tree) {
        if (tree == null) {
            return 0;
        }

        if (tree.getLeft() != null && tree.getRight() != null) {
            if (tree.getLeft().getValue().equals(tree.getRight().getValue())) {
                return 1 + countEqualChildren(tree.getLeft()) + countEqualChildren(tree.getRight());
            }
        }
        return countEqualChildren(tree.getLeft()) + countEqualChildren(tree.getRight());
    }
}