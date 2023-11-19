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

    public static Game getResult(Shape enemyMove, Shape myMove) {
        if(enemyMove == myMove) {
            return Game.DRAW;
        }
        else if(isWin(enemyMove, myMove)) {
            return Game.WIN;
        } else {
            return Game.DRAW;
        }
    }
}