import cs125.trees.BinaryTree;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeValuesAtLevel {
    public static List<Comparable> valuesAtLevel(BinaryTree<Comparable> tree, int level) {
        if (tree == null || level < 0) {
            throw new IllegalArgumentException();
        } 
        List<Comparable> list = new ArrayList<>();
        // sort the results using built-in sort
        valuesAtLevelHelper(tree, level, list);
        Collections.sort(list);
        return list;
    }

    private static void valuesAtLevelHelper(BinaryTree<Comparable> tree, int level, List<Comparable> list) {
        if (tree == null) {
            return;
        }

        if (level == 0) {
            list.add(tree.getValue());
            return;
        }

        /* 
         * Code passes all tests, however
         * Doesn't like when I assign "level" like this
         * If I were to redo this, I could get the input level AND set another input as targetLevel
         * add +1 to level every recursion, and once level == targetLevel, return
         * will try this for the int version of this question
         */
        if (level > 0) {
            level--;
        }
        valuesAtLevelHelper(tree.getLeft(), level, list);
        valuesAtLevelHelper(tree.getRight(), level, list);
    }
}