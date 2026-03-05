import cs125.trees.BinaryTree;

public class BinaryTreeCountNotEqual {
    public static int countNotEqual(BinaryTree<Integer> tree, int nodes) {
        if (tree == null) {
            return 0;
        }

        if (tree.getValue() != nodes) {
            return 1 + countNotEqual(tree.getRight(), nodes) + countNotEqual(tree.getLeft(), nodes);
        } else {
            return countNotEqual(tree.getRight(), nodes) + countNotEqual(tree.getLeft(), nodes);
        }
    }
}