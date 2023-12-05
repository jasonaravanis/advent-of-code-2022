package adventofcode2022.day8;

import java.util.ArrayList;

public class Solver {

    public static int getPartOneSolution(String input) {
        Forest forest = new Forest(input);

        ArrayList<Tree> visibleTrees = new ArrayList<>();

        for (int i = 0; i < forest.rowCount; i++) {
            for (int j = 0; j < forest.colCount; j++) {
                Tree testTree = forest.forest[i][j];
                if (forest.isTreeVisible(testTree)) {
                    visibleTrees.add(testTree);
                }
            }
        }

        return visibleTrees.size();
    }
}