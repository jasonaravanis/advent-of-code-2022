package adventofcode2022.day5;

import adventofcode2022.utils.FileLoader;


public class Main5 {
    public static void main(String[] args) {
        String input = FileLoader.getFileAsString("adventofcode2022/day5/input.txt");
        String partOneSolution = Solver.getPartOneSolution(input);
        System.out.println("Day 5 part 1 solution: " + partOneSolution);
        String partTwoSolution = Solver.getPartTwoSolution(input);
        System.out.println("Day 5 part 2 solution: " + partTwoSolution);
    }
}