package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RucksackTest {

    @Test
    void returnsMisplacedItem() {
        Rucksack bag = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        Item misplacedItem = bag.getMisplacedItem();
        assertEquals('p', misplacedItem.symbol);
        assertEquals(16, misplacedItem.priority);
    }

    @Test
    void returnsNullIfNoMisplacedItem() {
//        Have removed 'p' from the input string
        Rucksack bag = new Rucksack("vJrwWtwJgWrhcsFMMfFFhF");
        Item misplacedItem = bag.getMisplacedItem();
        assertNull(misplacedItem);
    }

    @Test
    void checksIfRucksackContainsSymbol() {
        Rucksack bag = new Rucksack("Apple");
        assertTrue(bag.containsItem('A'));
        assertFalse(bag.containsItem('B'));
    }
}