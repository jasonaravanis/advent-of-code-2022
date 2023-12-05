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
        Tree testTree = testForest.forest[2][1];
        Tree[] treesAbove = testForest.getTreesAbove(testTree);
        assertEquals(2, treesAbove[0].height);
        assertEquals(5, treesAbove[1].height);
    }
    @Test
    void getsTreesAboveTree_returnsEmptyArrayIfOnTopEdgeOfForest() {
        Tree testTree = testForest.forest[0][1];
        Tree[] treesAbove = testForest.getTreesAbove(testTree);
        assertEquals(0, treesAbove.length);
    }

    @Test
    void isVisibleFromAbove_returnsTrueIfVisibleFromAbove() {
        Tree testTree = testForest.forest[2][2];
        assertTrue(testForest.isVisibleFromAbove(testTree));
    }

    @Test
    void isVisibleFromAbove_returnsFalseIfNotVisibleFromAbove() {
        String testInput = """
                001
                000
                000""";
        Forest testForest = new Forest(testInput);
        Tree testTree = testForest.forest[2][2];
        assertFalse(testForest.isVisibleFromAbove(testTree));
    }

    @Test
    void isVisibleFromAbove_returnsFalseIfEqualHeight() {
        String testInput = """
                001
                000
                001""";
        Forest testForest = new Forest(testInput);
        Tree testTree = testForest.forest[2][2];
        assertFalse(testForest.isVisibleFromAbove(testTree));
    }

    @Test
    void isVisibleFromAbove_returnsTrueIfOnTopEdgeOfForest() {
        assertTrue(testForest.isVisibleFromAbove(testForest.forest[0][0]));
    }

    @Test
    void getsTreesBelowTree() {
        Tree[] treesBelow = testForest.getTreesBelow(testForest.forest[0][1]);
        assertEquals(5, treesBelow[0].height);
        assertEquals(8, treesBelow[1].height);
    }

    @Test
    void getsTreesBelowTree_returnsEmptyArrayIfOnBottomEdgeOfForest() {
        assertEquals(0, testForest.getTreesBelow(testForest.forest[2][1]).length);
    }

    @Test
    void isVisibleFromBelow_returnsTrueIfVisibleFromBelow() {
        String testInput = """
                001
                000
                000""";
        Forest testForest = new Forest(testInput);
        Tree testTree = testForest.forest[0][2];
        assertTrue(testForest.isVisibleFromBelow(testTree));
    }

    @Test
    void isVisibleFromBelow_returnsFalseIfNotVisibleFromBelow() {
        String testInput = """
                001
                000
                002""";
        Forest testForest = new Forest(testInput);
        Tree testTree = testForest.forest[0][2];
        assertFalse(testForest.isVisibleFromBelow(testTree));
    }

    @Test
    void isVisibleFromBelow_returnsFalseIfEqualHeight() {
        String testInput = """
                001
                000
                001""";
        Forest testForest = new Forest(testInput);
        Tree testTree = testForest.forest[0][2];
        assertFalse(testForest.isVisibleFromBelow(testTree));
    }

    @Test
    void isVisibleFromBelow_returnsTrueIfOnBottomEdgeOfForest() {
        assertTrue(testForest.isVisibleFromAbove(testForest.forest[2][2]));
    }
}