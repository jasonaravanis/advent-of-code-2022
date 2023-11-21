package adventofcode2022.day2;

public enum Game {
    WIN(6),
    LOSS(0),
    DRAW(3);
    public final int score;
    Game(int score) {
        this.score = score;
    }

    private static boolean isWin(Shape enemyMove, Shape myMove) {
        if (enemyMove == Shape.ROCK && myMove == Shape.PAPER) {
            return true;
        }
        if (enemyMove == Shape.PAPER && myMove == Shape.SCISSORS) {
            return true;
        }
        if (enemyMove == Shape.SCISSORS && myMove == Shape.ROCK) {
            return true;
        }
        return false;
    }

    public static int getResult(Shape enemyMove, Shape myMove) {
        int outcomeScore;
        if(enemyMove == myMove) {
            outcomeScore = Game.DRAW.score;
        }
        else if(isWin(enemyMove, myMove)) {
            outcomeScore = Game.WIN.score;
        } else {
            outcomeScore = Game.LOSS.score;
        }
        return outcomeScore + myMove.score;
    }

    public static Game of(char symbol) {
        return switch (symbol) {
            case 'X' -> Game.LOSS;
            case 'Y' -> Game.DRAW;
            case 'Z' -> Game.WIN;
            default -> throw new RuntimeException("Could not lookup game symbol");
        };
    }
}