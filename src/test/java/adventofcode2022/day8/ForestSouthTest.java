package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForestSouthTest {

    String testInput = """
                123
                456
                789""";
    Forest testForest = new Forest(testInput);


    @Test
    void getsTreesBelowTree() {
        Tree[] treesBelow = testForest.getTreesSouth(testForest.forest[0][1]);
        assertEquals(5, treesBelow[0].height);
        assertEquals(8, treesBelow[1].height);
    }

    @Test
    void getsTreesBelowTree_returnsEmptyArrayIfOnBottomEdgeOfForest() {
        assertEquals(0, testForest.getTreesSouth(testForest.forest[2][1]).length);
    }

    @Test
    void isVisibleFromBelow_returnsTrueIfVisibleFromBelow() {
        String testInput = """
                001
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertTrue(testForest.isVisibleFromSouth(testForest.forest[0][2]));
    }

    @Test
    void isVisibleFromBelow_returnsFalseIfNotVisibleFromBelow() {
        String testInput = """
                001
                000
                002""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromSouth(testForest.forest[0][2]));
    }

    @Test
    void isVisibleFromBelow_returnsFalseIfEqualHeight() {
        String testInput = """
                001
                000
                001""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromSouth(testForest.forest[0][2]));
    }

    @Test
    void isVisibleFromBelow_returnsTrueIfOnBottomEdgeOfForest() {
        assertTrue(testForest.isVisibleFromNorth(testForest.forest[2][2]));
    }
}