package adventofcode2022.day3;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public static int getSumOfGroupBadges(BufferedReader reader) {
        List<Rucksack> rucksacks = reader.lines()
                .map(Rucksack::new)
                .toList();

        List<List<Rucksack>> groupsList = new ArrayList<>();

        for (int i = 0; i < rucksacks.size(); i += 3 ) {
            int subListEndIndex = i + 3;
            groupsList.add(rucksacks.subList(i, subListEndIndex));
        }

        Stream<Group> groupsStream = groupsList.stream().map(Group::new);


        return groupsStream.mapToInt(Group::getPriorityOfGroupBadge).sum();

    }
}