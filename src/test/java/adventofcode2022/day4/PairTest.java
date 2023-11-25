package adventofcode2022.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PairTest {
    @Test
    void determinesIfFirstAssignmentContainsSecondAssignment() {
        Pair testPair = new Pair("2-8,3-7");
        assertTrue(testPair.isFullyContained());
    }
    @Test
    void determinesIfSecondAssignmentContainsFirstAssignment() {
        Pair testPair = new Pair("3-7,2-8");
        assertTrue(testPair.isFullyContained());
    }
}