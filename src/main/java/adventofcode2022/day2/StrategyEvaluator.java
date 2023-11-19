package adventofcode2022.day2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrategyEvaluator {

    public static int evaluateStrategy(String strategy) {
//        System.out.println(Shape.ROCK.score);
//        System.out.println(Game.WIN.score);

        String[] blocks = strategy.split("\n");
//        System.out.println(strategy);
//        System.out.println("...");
//        System.out.println(blocks[blocks.length - 1]);

        String testBlock = blocks[0];
        getGameScore(testBlock);

        return Stream.of(blocks).mapToInt(StrategyEvaluator::getGameScore).sum();

        // Currently only totalling scores from game, not including points from moves

    }

    private static int getGameScore(String game) {
        Shape enemyMove = Shape.of(game.charAt(0));
        Shape myMove = Shape.of(game.charAt(2));
        Game result = Game.getResult(enemyMove, myMove);
        return result.score;
    }
}