package adventofcode2022.day9;

import java.util.HashSet;
import java.util.List;

public class Solver {

    public static int getPartOneSolution(String input) {
        List<Instruction> instructions = input.lines().map(Instruction::new).toList();

        HashSet<Position> previousTailPositions = new HashSet<>();

        Position headPosition = new Position(0,0);
        Position tailPosition = new Position(0, 0);

        previousTailPositions.add(tailPosition);

        for (Instruction instruction : instructions) {
            for (int stepCount = 0; stepCount < instruction.steps; stepCount++) {
                Position newHead = headPosition.move(instruction.direction);
                if (!tailPosition.isAdjacentTo(newHead)) {
                    tailPosition = headPosition;
                }
                headPosition = newHead;
                previousTailPositions.add(tailPosition);
            }
        }

        return previousTailPositions.size();
    }
}