package adventofcode2022.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

// Large calculator is used if input file is large (> 1GB)
public class LargeCalorieCounter {

    private static IntStream getElfSums (BufferedReader reader) throws IOException {
        try (reader) {
            ArrayList<Integer> elves = new ArrayList<>();
            String line;
            ArrayList<Integer> elfItems = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    Integer elfTotal = elfItems.stream().mapToInt(Integer::intValue).sum();
                    elves.add(elfTotal);
                    elfItems.clear();
                } else {
                    Optional<Integer> result = Optional.of(Integer.parseInt(line));
                    elfItems.add(result.orElse(0));
                }
            }

            return elves.stream().mapToInt(Integer::intValue);

        }
    }
    public static int findElfWithMostCalories (BufferedReader reader) throws IOException {
        IntStream elves = getElfSums(reader);
        Integer fattestElf = elves.boxed().max(Integer::compareTo).orElse(null);
        if (fattestElf != null) {
            return fattestElf;
        } else {
            throw new RuntimeException("Could not find fattest elf");
        }
    }

    public static int findSumOfTopThreeElves(BufferedReader reader) throws IOException {
        IntStream elves = getElfSums(reader);
        return elves.boxed().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::intValue).sum();
    }
}