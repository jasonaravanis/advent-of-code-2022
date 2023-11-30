package adventofcode2022.day5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Stack {

    public Deque<Crate> crates = new ArrayDeque<>();

    @Override
    public String toString() {
        return crates.stream().map(Crate::toString).collect(Collectors.joining("\n"));

    }

    public String getTopCrate() {
        Crate topCrate = crates.peekLast();
        if (topCrate != null) {
            return topCrate.toString();
        }
        return " ";
    }
}