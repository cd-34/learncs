import cs125.trees.BinaryTree;

public class BinaryTreeCounter {
    public static int countEqualToEitherChild(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }

        // this looks like slop
        // probably better to initialize int count = 0 and add to that
        if (tree.getLeft() != null && tree.getValue().equals(tree.getLeft().getValue())) {
            return 1 + countEqualToEitherChild(tree.getLeft()) + countEqualToEitherChild(tree.getRight());
        }
        if (tree.getRight() != null && tree.getValue().equals(tree.getRight().getValue())) {
            return 1 + countEqualToEitherChild(tree.getLeft()) + countEqualToEitherChild(tree.getRight()); 
        }
    }
}