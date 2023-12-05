package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForestWestTest {

    String testInput = """
                123
                456
                789""";
    Forest testForest = new Forest(testInput);

    @Test
    void getsTreesToTheLeft() {
        Tree[] treesWest = testForest.getTreesWest(testForest.forest[1][2]);
        assertEquals(4, treesWest[0].height);
        assertEquals(5, treesWest[1].height);
    }

    @Test
    void getsTreesWest_returnsEmptyArrayIfOnLeftEdgeOfForest() {
        Tree[] treesWest = testForest.getTreesWest(testForest.forest[1][0]);
        assertEquals(0, treesWest.length);
    }
}