import cs125.trees.BinaryTree;

public class BinaryTreeSize {
    public static int size(BinaryTree<?> input) {
        if (input == null) {
            return 0;
        }

        return 1 + size(input.getRight()) + size(input.getLeft());
    }
}