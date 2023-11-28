package adventofcode2022.day5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class Stack {
    public final int number;
    public Deque<Crate> crates = new ArrayDeque<>();

    public Stack(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return crates.stream().map(Crate::toString).collect(Collectors.joining("\n"));

    }
}