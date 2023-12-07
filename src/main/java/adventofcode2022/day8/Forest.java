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

    private boolean isTreeTallerThanTrees(Tree tree, Tree[] trees) {
        if (trees.length == 0) {
            return true;
        }
        Tree tallestTreeAbove = Arrays.stream(trees).max(Comparator.comparingInt(t -> t.height)).orElse(null);
        return tree.height > tallestTreeAbove.height;
    }

    public Tree[] getTreesNorth(Tree tree) {
        Tree[] subArray = new Tree[tree.rowIndex];
        for (int i = 0; i < tree.rowIndex; i++) {
            subArray[i] = forest[tree.rowIndex - 1 - i][tree.colIndex];
        }
        return subArray;
    }

    public Tree[] getTreesSouth(Tree tree) {
        Tree[] subArray = new Tree[rowCount - (tree.rowIndex + 1)];
        for (int i = 0; i + (tree.rowIndex + 1) < rowCount; i++) {
            subArray[i] = forest[i + (tree.rowIndex + 1)][tree.colIndex];
        }
        return subArray;
    }

    public Tree[] getTreesWest(Tree tree) {
        Tree[] subArray = new Tree[tree.colIndex];
        for (int j = 0; j < (tree.colIndex); j++ ) {
            subArray[j] = forest[tree.rowIndex][tree.colIndex - 1 - j];
        }

        return subArray;
    }

    public Tree[] getTreesEast(Tree tree) {
        Tree[] subArray = new Tree[colCount - (tree.colIndex + 1)];
        System.arraycopy(forest[tree.rowIndex], tree.colIndex + 1, subArray, 0, subArray.length);
        return subArray;
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
        return isVisibleFromEast(tree);
    }


    public boolean isVisibleFromNorth(Tree tree) {
        return isTreeTallerThanTrees(tree, getTreesNorth(tree));
    }

    public boolean isVisibleFromSouth(Tree tree) {
        return isTreeTallerThanTrees(tree, getTreesSouth(tree));
    }

    public boolean isVisibleFromWest(Tree tree) {
        return isTreeTallerThanTrees(tree, getTreesWest(tree));
    }

    public boolean isVisibleFromEast(Tree tree) {
        return isTreeTallerThanTrees(tree, getTreesEast(tree));
    }

    public int getScoreFromDirection(Tree tree, Tree[] trees) {
        int score = 0;
        for (Tree value : trees) {
            if (tree.height > value.height) {
                score++;
            } else {
                score++;
                break;
            }
        }
        return  score;
    }

    public int getScenicScore(Tree tree) {
        int scoreNorth = getScoreFromDirection(tree, getTreesNorth(tree));
        int scoreEast = getScoreFromDirection(tree, getTreesEast(tree));
        int scoreSouth = getScoreFromDirection(tree, getTreesSouth(tree));
        int scoreWest= getScoreFromDirection(tree, getTreesWest(tree));

        return scoreNorth * scoreEast * scoreSouth * scoreWest;
    }
}