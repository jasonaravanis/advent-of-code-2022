package adventofcode2022.day2;

import java.util.stream.Stream;

public class StrategyEvaluator {

    public static int evaluateStrategy(String strategy) {
        String[] blocks = strategy.split("\n");


        return Stream.of(blocks).mapToInt(StrategyEvaluator::getGameScore).sum();
    }

    private static int getGameScore(String game) {
        Shape enemyMove = Shape.of(game.charAt(0));
        Shape myMove = Shape.of(game.charAt(2));
        return Game.getResult(enemyMove, myMove);
    }

    public static int getGameScorePartTwo(String game) {
        Shape enemyMove = Shape.of(game.charAt(0));
        Game targetOutcome = Game.of(game.charAt(2));
        Shape myMove = null;
        if (targetOutcome.equals(Game.DRAW)) {
            myMove = enemyMove;
        }
        else if (targetOutcome.equals(Game.WIN)) {
            switch (enemyMove) {
                case ROCK -> myMove = Shape.PAPER;
                case PAPER -> myMove = Shape.SCISSORS;
                case SCISSORS -> myMove = Shape.ROCK;
            }
        }
        else if (targetOutcome.equals(Game.LOSS)) {
            switch (enemyMove) {
                case ROCK -> myMove = Shape.SCISSORS;
                case PAPER -> myMove = Shape.ROCK;
                case SCISSORS -> myMove = Shape.PAPER;
            }
        }
        return Game.getResult(enemyMove, myMove);
    }

    public static int evaluateStrategyPartTwo(String strategy) {
        String[] blocks = strategy.split("\n");
        return Stream.of(blocks).mapToInt(StrategyEvaluator::getGameScorePartTwo).sum();
    }
}