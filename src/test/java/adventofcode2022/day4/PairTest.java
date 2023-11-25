package adventofcode2022.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    void determinesIfAnyOverlap() {
        Pair testPair = new Pair("1-3,3-6");
        assertTrue(testPair.hasAnyOverlap());
    }

    @Test
    void determinesIfAnyOverlapTwo() {
        Pair testPair = new Pair("5-8,3-6");
        assertTrue(testPair.hasAnyOverlap());
    }

    @Test
    void determinesIfAnyOverlapThree() {
        Pair testPair = new Pair("1-3,5-8");
        assertFalse(testPair.hasAnyOverlap());
    }

    @Test
    void determinesIfAnyOverlapFour() {
        Pair testPair = new Pair("5-7,7-9");
        assertTrue(testPair.hasAnyOverlap());
    }
}