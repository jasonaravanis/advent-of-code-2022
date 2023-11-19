package adventofcode2022.day1;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargeCalorieCounterTest {

    static final String testString = """
            100
            200
            300
            
            400
            500
            600
            
            700
            800
            900
            
            10
            20
            30
            """;
    static final BufferedReader TEST_INPUT = new BufferedReader(new StringReader(testString));

    @Test
    void givenSampleInput_findElfWithMostCalories_returns2400() throws IOException {
        assertEquals(2400, LargeCalorieCounter.findElfWithMostCalories(TEST_INPUT));
    }

    @Test
    void givenSampleInput_findSumOfTopThreeElves_returns4500() throws IOException {
        assertEquals(4500, LargeCalorieCounter.findSumOfTopThreeElves(TEST_INPUT));
    }
}