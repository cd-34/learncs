import cs125.trees.BinaryTree;

public class BinaryTreeCounter {
    public static int countChildSumToEven(BinaryTree<Integer> tree) {
        if (tree == null) {
            return 0;
        }
        int count = 0;
        // if either left or right is not null
        // check if even -> add +1 to count
        // recurse
        if (tree.getLeft() != null || tree.getRight() != null) {
            int sum = 0;
            if (tree.getLeft() != null) {
                sum += tree.getLeft().getValue();
            }
            if (tree.getRight() != null) {
                sum += tree.getRight().getValue();
            }
            if (sum % 2 == null) {
                count++;
            }
        }
        return count + countChildSumToEven(tree.getLeft()) + countChildSumToEven(tree.getRight());
    }
}