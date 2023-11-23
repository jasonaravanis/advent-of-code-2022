package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    void calculatesPriorityOfLowercaseChar() {
        Item testItem1 = new Item('a');
        Item testItem2 = new Item('m');
        Item testItem3 = new Item('z');
        assertEquals(1, testItem1.priority);
        assertEquals(13, testItem2.priority);
        assertEquals(26, testItem3.priority);
    }

    @Test
    void calculatesPriorityOfUppercaseChar() {
        Item testItem1 = new Item('A');
        Item testItem2 = new Item('M');
        Item testItem3 = new Item('Z');
        assertEquals(27, testItem1.priority);
        assertEquals(39, testItem2.priority);
        assertEquals(52, testItem3.priority);
    }
}