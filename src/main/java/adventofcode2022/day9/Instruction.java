package adventofcode2022.day9;

public class Instruction {

    Direction direction;
    int steps;

    public Instruction(String input) {
        String[] inputParts = input.split(" ");
        this.direction = Direction.of(input.charAt(0));
        this.steps = Integer.parseInt(inputParts[1]);
    }
}