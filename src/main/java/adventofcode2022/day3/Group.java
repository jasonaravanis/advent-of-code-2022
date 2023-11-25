package adventofcode2022.day3;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Group {
    List<Rucksack> rucksacks;

    public Group(List<Rucksack> rucksacks) {
        this.rucksacks = rucksacks;
    }

    public int getPriorityOfGroupBadge() {

        int result = rucksacks
                .get(0).content.chars()
                .filter(
                        i -> rucksacks.get(1).containsItem((char) i) &&
                                rucksacks.get(2).containsItem((char) i))
                .mapToObj(j -> new Item((char) j))
                .findFirst()
                .map(item -> item.priority).orElse(0);
        return result;
    }
}