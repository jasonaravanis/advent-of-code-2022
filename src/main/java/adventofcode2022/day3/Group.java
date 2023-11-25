package adventofcode2022.day3;

import java.util.List;

public class Group {
    List<Rucksack> rucksacks;

    public Group(List<Rucksack> rucksacks) {
        this.rucksacks = rucksacks;
    }

    public int getPriorityOfGroupBadge() {

        return rucksacks
                .get(0).content.chars()
                .filter(
                        i -> rucksacks.get(1).containsItem((char) i) &&
                                rucksacks.get(2).containsItem((char) i))
                .mapToObj(j -> new Item((char) j))
                .findFirst()
                .map(item -> item.priority).orElse(0);
    }
}