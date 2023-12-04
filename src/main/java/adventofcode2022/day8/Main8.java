package adventofcode2022.day8;

import adventofcode2022.utils.FileLoader;


public class Main8 {
    public static void main(String[] args) {
        String input = FileLoader.getFileAsString("adventofcode2022/day8/input.txt");
        int partOneSolution = Solver.getPartOneSolution(input);
        System.out.println("Day 8 part 1 solution: " + partOneSolution);
    }
}