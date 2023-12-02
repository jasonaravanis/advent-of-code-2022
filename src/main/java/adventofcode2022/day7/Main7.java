package adventofcode2022.day7;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = FileLoader.getFileAsReader("adventofcode2022/day7/input.txt");
        int partOneSolution = InputParser.getPartOneSolution(reader);
        System.out.println("Day 7 part 1 solution: " + partOneSolution);
    }
}