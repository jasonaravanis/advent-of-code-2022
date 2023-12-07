package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForestNorthTest {

    String testInput = """
                123
                456
                789""";
    Forest testForest = new Forest(testInput);

    @Test
    void getsTreesAboveTree() {
        Tree[] treesAbove = testForest.getTreesNorth(testForest.forest[2][1]);
        assertEquals(5, treesAbove[0].height);
        assertEquals(2, treesAbove[1].height);
    }
    @Test
    void getsTreesAboveTree_returnsEmptyArrayIfOnTopEdgeOfForest() {
        Tree[] treesAbove = testForest.getTreesNorth(testForest.forest[0][1]);
        assertEquals(0, treesAbove.length);
    }

    @Test
    void isVisibleFromAbove_returnsTrueIfVisibleFromAbove() {
        assertTrue(testForest.isVisibleFromNorth(testForest.forest[2][2]));
    }

    @Test
    void isVisibleFromAbove_returnsFalseIfNotVisibleFromAbove() {
        String testInput = """
                001
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromNorth(testForest.forest[2][2]));
    }

    @Test
    void isVisibleFromAbove_returnsFalseIfEqualHeight() {
        String testInput = """
                001
                000
                001""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromNorth(testForest.forest[2][2]));
    }

    @Test
    void isVisibleFromAbove_returnsTrueIfOnTopEdgeOfForest() {
        assertTrue(testForest.isVisibleFromNorth(testForest.forest[0][0]));
    }

    @Test
    void getsScoreNorth() {
        String testInput = """
                30373
                25512
                65332
                33549
                35390""";
        Forest testForest = new Forest(testInput);
        Tree testTree = testForest.forest[3][2];
        Tree[] treesAbove = testForest.getTreesNorth(testTree);
        assertEquals(2, testForest.getScoreFromDirection(testTree, treesAbove));
    }
//
//    @Test
//    void getsBlockedScoreNorth() {
//        String testInput = """
//                020
//                010
//                000""";
//        Forest testForest = new Forest(testInput);
//        assertEquals(0, testForest.getScoreNorth(testForest.forest[1][1]));
//    }
//
//    @Test
//    void getsEqualScoreNorth() {
//        String testInput = """
//                010
//                010
//                000""";
//        Forest testForest = new Forest(testInput);
//        assertEquals(0, testForest.getScoreNorth(testForest.forest[1][1]));
//    }
//
//    @Test
//    void includesEqualHeightTreeInScore() {
//        String testInput = """
//                30373
//                25512
//                65332
//                33549
//                35390""";
//        Forest testForest = new Forest(testInput);
//        assertEquals(2, testForest.getScoreNorth(testForest.forest[3][2]));
//    }
}