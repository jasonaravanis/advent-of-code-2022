package adventofcode2022.day5;

public class Crate {
    char symbol;

    public Crate(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "[" + symbol + "]";
    }
}