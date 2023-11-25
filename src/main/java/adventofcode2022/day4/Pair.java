package adventofcode2022.day4;

import java.util.stream.IntStream;

public class Pair {
    Assignment assignmentOne;
    Assignment assignmentTwo;

    public Pair(String input) {
        String[] inputParts = input.split(",");
        this.assignmentOne = new Assignment(inputParts[0]);
        this.assignmentTwo = new Assignment(inputParts[1]);
    }

    public boolean isFullyContained() {
        if (assignmentOne.lowerBound <= assignmentTwo.lowerBound && assignmentOne.upperBound >= assignmentTwo.upperBound) {
            return true;
        }
        return assignmentTwo.lowerBound <= assignmentOne.lowerBound && assignmentTwo.upperBound >= assignmentOne.upperBound;
    }

    public boolean hasAnyOverlap() {
        IntStream assignmentOneZones = IntStream.rangeClosed(assignmentOne.lowerBound, assignmentOne.upperBound);
        long matches = assignmentOneZones.filter(i -> i >= assignmentTwo.lowerBound && i <= assignmentTwo.upperBound)
                .count();
        return matches > 0;
    }
}