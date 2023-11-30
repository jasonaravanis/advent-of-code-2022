package adventofcode2022.day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    private Stack testStack;

    @BeforeEach
    void setUp() {
        testStack = new Stack();
        Crate crateA = new Crate('A');
        Crate crateB = new Crate('B');
        Crate crateC = new Crate('C');
        testStack.crates.addLast(crateA);
        testStack.crates.addLast(crateB);
        testStack.crates.addLast(crateC);
    }
    @Test
    void stacksCratesInOrder() {
        assertEquals("C", Objects.requireNonNull(testStack.crates.pollLast()).toString());
        assertEquals("A", Objects.requireNonNull(testStack.crates.pollFirst()).toString());
    }

    @Test
    void getsTopCrateAsString() {
        assertEquals("C", testStack.getTopCrate());
    }

    @Test
    void getTopCrateReturnsEmptySpaceIfNoCrates() {
        Stack emptyStack = new Stack();
        assertEquals(" ", emptyStack.getTopCrate());
    }

    @Test
    void outputAsString() {
        assertEquals("""
                A
                B
                C""", testStack.toString());
    }
}