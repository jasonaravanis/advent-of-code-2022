package adventofcode2022.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallCalorieCounterTest {

    static final String TEST_INPUT = """
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

    @Test
    void givenSampleInput_findElfWithMostCalories_returns2400() {
        assertEquals(2400, SmallCalorieCounter.findElfWithMostCalories(TEST_INPUT));
    }

    @Test
    void givenSampleInt_findSumOfTopThreeElves_returns4500() {
        assertEquals(4500, SmallCalorieCounter.findSumOfTopThreeElves(TEST_INPUT));
    }


}