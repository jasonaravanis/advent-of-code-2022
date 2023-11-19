package adventofcode2022.day1;


import java.util.Arrays;
import java.util.stream.IntStream;

// Small calculator used if input file is small (< 1GB)
public class SmallCalorieCounter {

    private static IntStream getElfSums (String input) {
        String[] blocks = input.split("\\n\\n");
        return Arrays.stream(blocks).mapToInt(SmallCalorieCounter::getIndividualElfSum);
    }
    public static int findElfWithMostCalories(String input) {
        return getElfSums(input).max().orElse(0);
    }

    private static int getIndividualElfSum(String elfBlock) {
        return elfBlock.lines().mapToInt(Integer::valueOf).sum();
    }

    public static int findSumOfTopThreeElves(String input) {
        IntStream elves = getElfSums(input);
        int elfCount = input.split("\\n\\n").length;
        return elves.sorted().skip(elfCount - 3).sum();
    }
}