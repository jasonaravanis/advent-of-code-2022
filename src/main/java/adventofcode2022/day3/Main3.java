package adventofcode2022.day3;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) throws IOException {
        String filePath = "adventofcode2022/day3/input.txt";
        BufferedReader reader = FileLoader.getFileAsReader(filePath);
        int sumOfItemPriorities = RucksackOrganiser.getSumOfItemPriorities(reader);
        System.out.println("Day 3 part 1 solution: " + sumOfItemPriorities);

        BufferedReader readerTwo = FileLoader.getFileAsReader(filePath);
        int sumOfBadgePriorities = RucksackOrganiser.getSumOfGroupBadges(readerTwo);
        System.out.println("Day 3 part 2 solution: " + sumOfBadgePriorities);
    }
}