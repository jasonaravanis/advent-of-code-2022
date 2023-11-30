package adventofcode2022.day5;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    void stacksCratesInOrder() {
        Stack testStack = new Stack();
        Crate crateA = new Crate('A');
        Crate crateB = new Crate('B');
        Crate crateC = new Crate('C');
        testStack.crates.addLast(crateA);
        testStack.crates.addLast(crateB);
        testStack.crates.addLast(crateC);
        assertEquals("C", Objects.requireNonNull(testStack.crates.pollLast()).toString());
        assertEquals("A", Objects.requireNonNull(testStack.crates.pollFirst()).toString());
    }

    @Test
    void getsTopCrateAsString() {
        Stack testStack = new Stack();
        Crate crateA = new Crate('A');
        Crate crateB = new Crate('B');
        Crate crateC = new Crate('C');
        testStack.crates.addLast(crateA);
        testStack.crates.addLast(crateB);
        testStack.crates.addLast(crateC);
        assertEquals("C", testStack.getTopCrate());
    }

    @Test
    void getTopCrateReturnsEmptySpaceIfNoCrates() {
        Stack testStack = new Stack();
        assertEquals(" ", testStack.getTopCrate());
    }

    @Test
    void outputAsString() {
        Stack testStack = new Stack();
        Crate crateA = new Crate('A');
        Crate crateB = new Crate('B');
        Crate crateC = new Crate('C');
        testStack.crates.addLast(crateA);
        testStack.crates.addLast(crateB);
        testStack.crates.addLast(crateC);
        assertEquals("""
                A
                B
                C""", testStack.toString());
    }
}