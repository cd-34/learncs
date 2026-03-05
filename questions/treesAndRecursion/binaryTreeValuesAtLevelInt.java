import cs125.trees.BinaryTree;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeAtLevel {
    public static List<Integer> valuesAtLevel(BinaryTree<Integer> tree, int level) {
        if (tree == null || level < 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> list = new ArrayList<>();
        valuesAtLevelHelper(tree, level, 0, list);
        Collections.sort(list);
        return list;
    }

    private static void valuesAtLevelHelper(
        BinaryTree<Integer> tree, int level, int currentLevel, List<Integer> list) {
        if (tree == null) {
            return;
        }
        if (currentLevel == level) {
            list.add(tree.getValue());
            return;
        }
        // at this point, currentLevel is < level 
        // and level is definitely a legal positive number
        valuesAtLevelHelper(tree.getLeft(), level, currentLevel + 1, list);
        valuesAtLevelHelper(tree.getRight(), level, currentLevel + 1, list);
    }
}