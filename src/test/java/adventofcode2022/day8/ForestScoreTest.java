package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForestScoreTest {

    String testInput = """
            30373
            25512
            65332
            33549
            35390""";
    Forest testForest = new Forest(testInput);


    @Test
    void getsWestScore() {
        Tree testTree = testForest.forest[1][0];
        Tree[] westTrees = testForest.getTreesWest(testTree);
        assertEquals(0, testForest.getScoreFromDirection(testTree, westTrees));
    }

    @Test
    void getsScore() {

        Tree testTree = testForest.forest[3][2];


        assertEquals(8, testForest.getScenicScore(testTree));

    }

    @Test
    void getsScoreOtherExample() {
        Tree testTree = testForest.forest[1][2];
                Tree[] treesNorth = testForest.getTreesNorth(testTree);
        Tree[] treesEast = testForest.getTreesEast(testTree);
        Tree[] treesSouth = testForest.getTreesSouth(testTree);
        Tree[] treesWest = testForest.getTreesWest(testTree);
        assertEquals(1, testForest.getScoreFromDirection(testTree, treesNorth));
        assertEquals(1, testForest.getScoreFromDirection(testTree, treesWest));
        assertEquals(2, testForest.getScoreFromDirection(testTree, treesEast));
        assertEquals(2, testForest.getScoreFromDirection(testTree, treesSouth));
        assertEquals(4, testForest.getScenicScore(testTree));
    }
}