package adventofcode2022.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}