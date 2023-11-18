package adventofcode2022.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallCalorieCounterTest {

    static final String TEST_INPUT = """
            1000
            1000
            1000
            
            50
            300
            5
            
            400
  
            0
            """;

    @Test
    void givenSampleInput_findElfWithMostCalories_returns3000() {
        assertEquals(3000, SmallCalorieCounter.findElfWithMostCalories(TEST_INPUT));
    }



}