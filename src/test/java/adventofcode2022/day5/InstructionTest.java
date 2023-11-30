package adventofcode2022.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstructionTest {

    @Test
    void parsesInstruction() {
        Instruction instruction = new Instruction("move 1 from 8 to 4");
        assertEquals(1, instruction.crateCount);
        assertEquals(8, instruction.stackSource);
        assertEquals(4, instruction.stackDestination);
    }
}