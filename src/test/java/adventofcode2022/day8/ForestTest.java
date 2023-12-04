package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForestTest {

    String testInput = """
                123
                456
                789""";
    Forest testForest = new Forest(testInput);

    @Test
    void loadsData() {
        assertEquals(1, testForest.forest[0][0].height);
        assertEquals(3, testForest.forest[0][2].height);
        assertEquals(7, testForest.forest[2][0].height);
        assertEquals(9, testForest.forest[2][2].height);
    }

    @Test
    void getsTreesAboveTree() {
        Tree[] treesAbove = testForest.getTreesAbove(2, 1);
        assertEquals(2, treesAbove[0].height);
        assertEquals(5, treesAbove[1].height);
    }
    @Test
    void getsTreesAboveTree_returnsEmptyArrayIfOnTopEdgeOfForest() {
        Tree[] treesAbove = testForest.getTreesAbove(0, 1);
        assertEquals(0, treesAbove.length);
    }

    @Test
    void returnsTrueIfVisibleFromAbove() {
        assertTrue(testForest.isVisibleFromAbove(2,2));
    }

    @Test
    void returnsFalseIfNotVisibleFromAbove() {
        String testInput = """
                001
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromAbove(2,2));
    }

    @Test
    void returnsFalseIfEqualHeight() {
        String testInput = """
                001
                000
                001""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromAbove(2,2));
    }
}