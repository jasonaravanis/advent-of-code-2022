package adventofcode2022.day5;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipYardTest {

    private final ShipYard shipYard = new ShipYard("""
            [V]     [B]                     [F]
            [N] [Q] [W]                 [R] [B]
            [F] [D] [S]     [B]         [L] [P]
            [S] [J] [C]     [F] [C]     [D] [G]
            [M] [M] [H] [L] [P] [N]     [P] [V]
            [P] [L] [D] [C] [T] [Q] [R] [S] [J]
            [H] [R] [Q] [S] [V] [R] [V] [Z] [S]
            [J] [S] [N] [R] [M] [T] [G] [C] [D]
             1   2   3   4   5   6   7   8   9
            """);

    @Test
    void loadsInitialState() {

        String firstStackTopCrate = shipYard.stacks[0].getTopCrate();
        String firstCrateLastCrate = Objects.requireNonNull(shipYard.stacks[0].crates.pollFirst()).toString();
        String lastStackTopCrate = shipYard.stacks[8].getTopCrate();
        String lastCrateLastCrate = Objects.requireNonNull(shipYard.stacks[8].crates.pollFirst()).toString();
        assertEquals("V", firstStackTopCrate);
        assertEquals("J", firstCrateLastCrate);
        assertEquals("F", lastStackTopCrate);
        assertEquals("D", lastCrateLastCrate);
    }

    @Test
    void processesInstruction() {

        Instruction instruction = new Instruction("move 1 from 8 to 4");
        shipYard.processInstruction(instruction);
        String sourceStackTopCrate = shipYard.stacks[7].getTopCrate();
        String destinationStackTopCrate = shipYard.stacks[3].getTopCrate();
        assertEquals("L", sourceStackTopCrate);
        assertEquals("R", destinationStackTopCrate);
    }

    @Test
    void processesMultiCrateInstructions() {

        Instruction instruction = new Instruction("move 2 from 6 to 5");
        shipYard.processMultiCrateInstruction(instruction);
        String sourceStackTopCrate = shipYard.stacks[5].getTopCrate();
        String destinationStackTopCrate = shipYard.stacks[4].getTopCrate();
        assertEquals("Q", sourceStackTopCrate);
        assertEquals("C", destinationStackTopCrate);
    }
}