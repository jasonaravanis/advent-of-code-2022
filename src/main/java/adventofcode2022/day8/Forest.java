package adventofcode2022.day8;


import java.util.Arrays;
import java.util.Comparator;

public class Forest {

    public final int rowCount;
    public final int colCount;
    Tree[][] forest;

    public Forest(String input) {
        String[] inputRows = input.lines().toArray(String[]::new);
        this.rowCount = inputRows.length;
        this.colCount = inputRows[0].split("").length;

        forest = new Tree[rowCount][colCount];

        /*
        *  i = row number
        *  j = col number
        */

        for (int i = 0; i < inputRows.length; i++) {
            String[] chars = inputRows[i].split("");
            Tree[] trees = new Tree[chars.length];
            for (int j = 0; j < trees.length; j++) {
                trees[j] = new Tree(Integer.parseInt(chars[j]), i ,j);
            }
            System.arraycopy(trees, 0, forest[i], 0, colCount);
        }

    }

    public boolean isTreeVisible(Tree tree) {
        if (isVisibleFromAbove(tree)) {
            return  true;
        }
        return  false;
    }

    public Tree[] getTreesAbove(Tree tree) {
        Tree[] subArray = new Tree[tree.rowIndex];
        for (int i = 0; i < tree.rowIndex; i++) {
            subArray[i] = forest[i][tree.colIndex];
        }
        return subArray;
    }

    public boolean isVisibleFromAbove(Tree tree) {
        Tree[] treesAbove = getTreesAbove(tree);
        if (treesAbove.length == 0) {
            return true;
        }
        Tree tallestTreeAbove = Arrays.stream(treesAbove).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return tree.height > tallestTreeAbove.height;
    }

    public Tree[] getTreesBelow(Tree tree) {
        Tree[] subArray = new Tree[rowCount - (tree.rowIndex + 1)];
        for (int i = 0; i + (tree.rowIndex + 1) < rowCount; i++) {
            subArray[i] = forest[i + (tree.rowIndex + 1)][tree.colIndex];
        }
        return subArray;
    }
}