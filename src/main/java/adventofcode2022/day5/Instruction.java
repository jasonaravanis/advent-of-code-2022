package adventofcode2022.day5;

public class Instruction {

    public int crateCount;
    public int stackSource;
    public int stackDestination;

    public Instruction(String description) {
        String[] words = description.split(" ");
        this.crateCount = Integer.parseInt(words[1]);
        this.stackSource = Integer.parseInt(words[3]);
        this.stackDestination = Integer.parseInt(words[5]);
    }
}