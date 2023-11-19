package adventofcode2022.day2;

public enum Shape {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);
    public final int score;


    Shape(int score) {
        this.score = score;
    }

    public static Shape of(char move) {
        return switch (move) {
            case 'A', 'X' -> Shape.ROCK;
            case 'B', 'Y' -> Shape.PAPER;
            case 'C', 'Z' -> Shape.SCISSORS;
            default -> throw new RuntimeException("Unable to lookup shape based on input");
        };
    }
}