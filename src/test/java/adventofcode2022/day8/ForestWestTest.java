package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForestWestTest {

    String testInput = """
                123
                456
                789""";
    Forest testForest = new Forest(testInput);

    @Test
    void getsTreesToTheLeft() {
        String testInput = """
                40373
                25512
                65332
                33549
                35390""";
        Forest testForest = new Forest(testInput);
        Tree[] treesWest = testForest.getTreesWest(testForest.forest[0][3]);
        assertEquals(3, treesWest.length);
        assertEquals(3, treesWest[0].height);
        assertEquals(4, treesWest[treesWest.length - 1].height);
    }

    @Test
    void getsTreesWest_returnsEmptyArrayIfOnLeftEdgeOfForest() {
        Tree[] treesWest = testForest.getTreesWest(testForest.forest[1][0]);
        assertEquals(0, treesWest.length);
    }

    @Test
    void isVisibleFromWest_returnsTrueIfVisibleFromWest() {
        assertTrue(testForest.isVisibleFromWest(testForest.forest[2][2]));
    }

    @Test
    void isVisibleFromWest_returnsFalseIfNotVisibleFromWest() {
        String testInput = """
                201
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromWest(testForest.forest[0][2]));
    }

    @Test
    void isVisibleFromWest_returnsFalseIfEqualHeight() {
        String testInput = """
                101
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromWest(testForest.forest[0][2]));
    }

    @Test
    void isVisibleFromWest_returnsTrueIfOnLeftEdgeOfForest() {
        assertTrue(testForest.isVisibleFromWest(testForest.forest[1][0]));
    }

}