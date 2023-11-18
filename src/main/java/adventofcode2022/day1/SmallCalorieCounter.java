package adventofcode2022.day1;


import java.util.Arrays;

// Small calculator used if input file is small (< 1GB)
public class SmallCalorieCounter {

    public static int findElfWithMostCalories(String input) {
        String[] blocks = input.split("\\n\\n");
        return Arrays.stream(blocks).mapToInt(SmallCalorieCounter::getElfSum).max().orElse(0);
    }

    private static int getElfSum(String elfBlock) {
        return elfBlock.lines().mapToInt(Integer::valueOf).sum();
    }
}