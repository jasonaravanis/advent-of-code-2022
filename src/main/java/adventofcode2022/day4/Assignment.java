package adventofcode2022.day4;

public class Assignment {
    public final int lowerBound;
    public final int upperBound;

    public Assignment(String input) {
        String[] inputParts = input.split("-");
        this.lowerBound = Integer.parseInt(inputParts[0]);
        this.upperBound = Integer.parseInt(inputParts[1]);
    }
}