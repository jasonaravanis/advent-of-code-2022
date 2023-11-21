package adventofcode2022.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class RucksackOrganiser {

    public static int getSumOfItemPriorities(BufferedReader reader) throws IOException {
        String line;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            rucksacks.add(new Rucksack(line));
        }
        int answer = rucksacks.stream().map(Rucksack::getIncorrectItem).map(item -> item.priority).mapToInt(Integer::valueOf).sum();
        System.out.println(answer);
        return answer;
        // Item is stubbed, all priority is 1.
    }
}

// create a reader
// read in a line
// generate a rucksack with the line
// have an array of rucksacks
// forEach rucksack
// call rucksack.findItem() to get an Item

// have an array of Items
// for each Item
// get the priority and the sum