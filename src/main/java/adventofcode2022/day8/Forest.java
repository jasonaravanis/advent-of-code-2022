package adventofcode2022.day8;


import java.util.Arrays;

public class Forest {

    Tree[][] forest;

    public Forest(String input) {
        String[] inputRows = input.lines().toArray(String[]::new);
        int colCount = inputRows[0].split("").length;

        forest = new Tree[inputRows.length][colCount];

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
}