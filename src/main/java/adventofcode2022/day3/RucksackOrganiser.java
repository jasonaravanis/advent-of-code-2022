package adventofcode2022.day3;

import java.io.BufferedReader;
import java.util.Objects;

public class RucksackOrganiser {

    public static int getSumOfItemPriorities(BufferedReader reader) {
        return reader.lines()
                .map(Rucksack::new)
                .map(Rucksack::getMisplacedItem)
                .filter(Objects::nonNull)
                .map(item -> item.priority)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}