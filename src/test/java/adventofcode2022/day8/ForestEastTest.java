package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForestEastTest {

    String testInput = """
                123
                456
                789""";
    Forest testForest = new Forest(testInput);

    @Test
    void getsTreesToTheRight() {
        Tree[] treesEast = testForest.getTreesEast(testForest.forest[1][0]);
        assertEquals(5, treesEast[0].height);
        assertEquals(6, treesEast[1].height);
    }

    @Test
    void getsTreesEast_returnsEmptyArrayIfOnRightEdgeOfForest() {
        Tree[] treesEast = testForest.getTreesEast(testForest.forest[1][2]);
        assertEquals(0, treesEast.length);
    }

    @Test
    void isVisibleFromEast_returnsTrueIfVisibleFromEast() {
        String testInput = """
                210
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertTrue(testForest.isVisibleFromEast(testForest.forest[0][1]));
    }

    @Test
    void isVisibleFromEast_returnsFalseIfNotVisibleFromEast() {
        String testInput = """
                012
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromEast(testForest.forest[0][1]));
    }

    @Test
    void isVisibleFromEast_returnsFalseIfEqualHeight() {
        String testInput = """
                101
                000
                000""";
        Forest testForest = new Forest(testInput);
        assertFalse(testForest.isVisibleFromEast(testForest.forest[0][0]));
    }

    @Test
    void isVisibleFromEast_returnsTrueIfOnRightEdgeOfForest() {
        assertTrue(testForest.isVisibleFromEast(testForest.forest[0][2]));
    }

}