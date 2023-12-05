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
        assertEquals(2, treesAbove[0].height);
        assertEquals(5, treesAbove[1].height);
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


}