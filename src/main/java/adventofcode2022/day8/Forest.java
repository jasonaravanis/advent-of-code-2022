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
        if (isVisibleFromNorth(tree)) {
            return true;
        }
        if (isVisibleFromSouth(tree)) {
            return true;
        }
        if (isVisibleFromWest(tree)) {
            return true;
        }
        if (isVisibleFromEast(tree)) {
            return true;
        }
        return  false;
    }

    public Tree[] getTreesNorth(Tree tree) {
        Tree[] subArray = new Tree[tree.rowIndex];
        for (int i = 0; i < tree.rowIndex; i++) {
            subArray[i] = forest[i][tree.colIndex];
        }
        return subArray;
    }

    public boolean isVisibleFromNorth(Tree tree) {
        Tree[] treesAbove = getTreesNorth(tree);
        if (treesAbove.length == 0) {
            return true;
        }
        Tree tallestTreeAbove = Arrays.stream(treesAbove).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return tree.height > tallestTreeAbove.height;
    }

    public Tree[] getTreesSouth(Tree tree) {
        Tree[] subArray = new Tree[rowCount - (tree.rowIndex + 1)];
        for (int i = 0; i + (tree.rowIndex + 1) < rowCount; i++) {
            subArray[i] = forest[i + (tree.rowIndex + 1)][tree.colIndex];
        }
        return subArray;
    }

    public boolean isVisibleFromSouth(Tree tree) {
        Tree[] treesBelow = getTreesSouth(tree);
        if (treesBelow.length == 0) {
            return true;
        }
        Tree tallestTreeBelow = Arrays.stream(treesBelow).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return tree.height > tallestTreeBelow.height;
    }

    public Tree[] getTreesWest(Tree tree) {
        Tree[] subArray = new Tree[tree.colIndex];
        System.arraycopy(forest[tree.rowIndex], 0, subArray, 0, tree.colIndex);
        return subArray;
    }

    public boolean isVisibleFromWest(Tree tree) {
        Tree[] treesWest = getTreesWest(tree);
        if (treesWest.length == 0) {
            return true;
        }
        Tree tallestTreeAbove = Arrays.stream(treesWest).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return tree.height > tallestTreeAbove.height;
    }

    public Tree[] getTreesEast(Tree tree) {
        Tree[] subArray = new Tree[colCount - (tree.colIndex + 1)];
        System.arraycopy(forest[tree.rowIndex], tree.colIndex + 1, subArray, 0, subArray.length);
        return subArray;
    }

    public boolean isVisibleFromEast(Tree tree) {
        Tree[] treesEast = getTreesEast(tree);
        if (treesEast.length == 0) {
            return true;
        }
        Tree tallestTreeAbove = Arrays.stream(treesEast).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return tree.height > tallestTreeAbove.height;
    }
}