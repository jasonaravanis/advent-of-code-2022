package adventofcode2022.day4;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = FileLoader.getFileAsReader("adventofcode2022/day4/input.txt");
        long partOneSolution = AssignmentInspector.getCountOfBadAssignments(reader);
        System.out.println("Day 4 part 1 solution: " + partOneSolution);

        BufferedReader readerTwo = FileLoader.getFileAsReader("adventofcode2022/day4/input.txt");
        long partTwoSolution = AssignmentInspector.getCountOfAnyOverlap(readerTwo);
        System.out.println("Day 4 part 2 solution: " + partTwoSolution);
    }
}