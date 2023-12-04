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
            Tree[] trees = Arrays.stream(chars).mapToInt(Integer::valueOf).mapToObj(Tree::new).toArray(Tree[]::new);
            System.arraycopy(trees, 0, forest[i], 0, colCount);
        }

    }

    public Tree getTreeIfVisible(int rowIndex, int colIndex) {
        Tree testTree = forest[rowIndex][colIndex];

        // Probably worth giving each tree knowledge of it's own location
        // so we can pass trees around instead of rowIndex/colIndex all the time
        return  testTree;
    }

    public Tree[] getTreesAbove(int rowIndex, int colIndex) {
        Tree[] subArray = new Tree[rowIndex];
        for (int i = 0; i < rowIndex; i++) {
            subArray[i] = forest[i][colIndex];
        }
        return subArray;
    }

    public boolean isVisibleFromAbove(int rowIndex, int colIndex) {
        Tree referenceTree = forest[rowIndex][colIndex];
        Tree[] treesAbove = getTreesAbove(rowIndex, colIndex);
        if (treesAbove.length == 0) {
            return true;
        }
        Tree tallestTreeAbove = Arrays.stream(treesAbove).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return referenceTree.height > tallestTreeAbove.height;
    }
}