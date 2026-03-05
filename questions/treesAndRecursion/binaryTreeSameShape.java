import cs125.trees.BinaryTree;

public class BinaryTreeSameShape {
    public static boolean sameShape(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null || tree2 == null) {
            throw new IllegalArgumentException();
        }

        return sameShapeHelper(tree1, tree2);
    }

    private static boolean sameShapeHelper(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }

        return sameShapeHelper(tree1.getLeft(), tree2.getLeft()) 
            && sameShapeHelper(tree1.getRight(), tree2.getRight());
    }
}