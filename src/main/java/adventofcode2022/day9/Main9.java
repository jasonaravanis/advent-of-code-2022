package adventofcode2022.day9;

import adventofcode2022.utils.FileLoader;

public class Main9 {

    public static final String input = FileLoader.getFileAsString("adventofcode2022/day9/input.txt");

    public static void main(String[] args) {
        System.out.println("Day 9 part 1 solution: " + Solver.getPartOneSolution(input));
    }
}