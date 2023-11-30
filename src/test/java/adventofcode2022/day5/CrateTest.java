package adventofcode2022.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrateTest {

    @Test
    void returnsCrateAsString() {
        Crate testCrate = new Crate('A');
        assertEquals("A", testCrate.toString());
    }
}