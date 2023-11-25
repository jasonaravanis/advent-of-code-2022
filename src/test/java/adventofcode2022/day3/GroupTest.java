package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupTest {
    @Test
    void returnsPriorityOfBadge() {
        List<Rucksack> testInput = new ArrayList<>();
        testInput.add(new Rucksack("abc"));
        testInput.add(new Rucksack("ade"));
        testInput.add(new Rucksack("afg"));
        Group testGroup = new Group(testInput);
        assertEquals(1, testGroup.getPriorityOfGroupBadge());
    }
}