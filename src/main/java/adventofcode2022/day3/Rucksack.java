package adventofcode2022.day3;

public class Rucksack {
    public String content;
    public Rucksack(String content) {
        this.content = content;
    }

    public Item getIncorrectItem() {
        return new Item('A', 1);
    }
}