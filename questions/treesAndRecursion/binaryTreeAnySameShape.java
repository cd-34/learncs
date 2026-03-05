import cs125.trees.BinaryTree;

public class BinarutreeSameShape {
    public static boolean sameShape(BinaryTree<?> tree1, BinaryTree<?> tree2) {
        if (tree1 == null || tree2 == null) {
            throw new IllegalArgumentException();
        }
        return sameShapeHelper(tree1, tree2);
    }

    private static boolean sameShapeHelper(BinaryTree<?> tree1, BinaryTree<?> tree2) {
        /* 
         * if both nodes are null, return true
         * if left1 different from left2 || right1 different from right2
            * return false
         * if both nodes not empty, recurse through left and right
         */
        
        // this covers the case where both are null
        if (tree1 == null && tree2 == null) {
            return true;
        }

        // the case where both are null is already covered above
        // therefore this covers where only one is null
        if (tree1 == null || tree2 == null) {
            return false;
        }
        return sameShapeHelper(tree1.getLeft(), tree2.getLeft())
            && sameShapeHelper(tree1.getRight(), tree2.getRight());
    }
}