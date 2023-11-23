package adventofcode2022.day3;

public class Item {
    public char symbol;
    public int priority;

    public Item(char symbol) {
        this.symbol = symbol;

        if ((int) symbol > 64 && (int) symbol < 91) {
            this.priority = (int) symbol - 38;
        } else if ((int) symbol > 96 && (int) symbol < 123) {
            this.priority = (int) symbol - 96;
        } else {
            throw new RuntimeException("Could not lookup ascii value of char");
        }
        System.out.println("priority: " + priority);
    }
}