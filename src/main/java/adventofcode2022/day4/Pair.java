package adventofcode2022.day4;

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
}
/*
 * input looks like 2-4, 6-8
 *
 * if alpha is contained in beta
 * * the lower number in alpha will be equal to or less than the lowest number in beta
 * the highest number in alpha will be equal to or less than the highest number in beta
 *
 * vice versa if beta is contained in alpha
 *
 * */