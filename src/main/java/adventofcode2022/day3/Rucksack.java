package adventofcode2022.day3;

import java.util.OptionalInt;
import java.util.stream.IntStream;


public class Rucksack {
    public String content;
    public Rucksack(String content) {
        this.content = content;
    }

    public Item getMisplacedItem() {
        int compartmentItemLimit = content.length() / 2;
        String compartmentOne = content.substring(0, compartmentItemLimit);
        String compartmentTwo = content.substring(compartmentItemLimit);
        IntStream chars = compartmentOne.chars();
        OptionalInt symbol = chars.filter(i -> compartmentTwo.contains(Character.toString(i))).findFirst();
        if (symbol.isPresent()) {
            return new Item((char) symbol.getAsInt());
        }
        return null;
    }

    public boolean containsItem(Character symbol) {
        return content.contains(String.valueOf(symbol));
    }
}