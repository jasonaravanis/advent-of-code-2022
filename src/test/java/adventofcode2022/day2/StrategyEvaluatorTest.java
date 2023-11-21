package adventofcode2022.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyEvaluatorTest {

    static final String testString = """
            B Z
            C Z
            B X
            A Y
            """;

    @Test
    void givenSampleInputReturnsCorrectScore() {
        assertEquals(24, StrategyEvaluator.evaluateStrategy(testString));
    }

    @Test
    void givenSampleInputReturnsPartTwoScore() {
        assertEquals(21, StrategyEvaluator.evaluateStrategyPartTwo(testString));
    }
}