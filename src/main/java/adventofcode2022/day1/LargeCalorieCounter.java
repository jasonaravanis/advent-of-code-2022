package adventofcode2022.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

// Large calculator is used if input file is large (> 1GB)
public class LargeCalorieCounter {

    public static int findElfWithMostCalories (BufferedReader reader) throws IOException {
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
            Integer fattestElf = elves.stream().max(Integer::compareTo).orElse(null);

            if (fattestElf != null) {
                return fattestElf;
            } else {
                throw new RuntimeException("Could not find fattest elf");
            }
        }
    }
}