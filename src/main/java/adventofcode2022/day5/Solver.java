package adventofcode2022.day5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solver {
    public static String getPartOneSolution(String input) {
        String initialShipYardState = input.lines().limit(9).collect(Collectors.joining("\n"));
        ShipYard shipyard = new ShipYard(initialShipYardState);

        String[] craneInstructions = input.lines().skip(10).toArray(String[]::new);

        for (String instructionStr : craneInstructions) {
            Instruction instruction = new Instruction(instructionStr);
            shipyard.processInstruction(instruction);
        }

        return Arrays.stream(shipyard.stacks).map(Stack::getTopCrate).collect(Collectors.joining(""));
    }
}