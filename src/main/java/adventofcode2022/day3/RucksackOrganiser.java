package adventofcode2022.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class RucksackOrganiser {

    public static int getSumOfItemPriorities(BufferedReader reader) throws IOException {
        String line;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            rucksacks.add(new Rucksack(line));
        }
        return rucksacks
                .stream()
                .map(Rucksack::getMisplacedItem)
                .filter(Objects::nonNull)
                .map(item -> item.priority)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}