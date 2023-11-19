package adventofcode2022.day1;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargeCalorieCounterTest {

    static final String input ="""
        1000
        1000
        1000
        
        50
        300
        5
        
        400

        0
        """;
    static final BufferedReader TEST_INPUT = new BufferedReader(new StringReader(input));

    @Test
    void givenSampleInput_findElfWithMostCalories_returns3000() throws IOException {
        assertEquals(3000, LargeCalorieCounter.findElfWithMostCalories(TEST_INPUT));
    }
}