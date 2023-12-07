package adventofcode2022.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

    @Test
    void findsIfTwoPositionsAreTheSame() {
        // Testing overridden equals method
        Position alpha = new Position(1,1);
        Position beta = new Position(1,1);
        Position charlie = new Position(2,2);
        assertTrue(alpha.equals(beta));
        assertTrue(beta.equals(alpha));
        assertFalse(alpha.equals(charlie));
    }
}