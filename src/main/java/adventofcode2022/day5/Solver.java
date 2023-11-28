package adventofcode2022.day5;

import java.io.IOException;
import java.util.stream.Collectors;

public class Solver {
    public static String getPartOneSolution(String input) throws IOException {
        String initialShipYardState = input.lines().limit(9).collect(Collectors.joining("\n"));
        ShipYard shipyard = new ShipYard(initialShipYardState);
        return "placeholder";
    }
}