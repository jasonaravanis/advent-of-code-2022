package adventofcode2022.day1;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String filePath = "adventofcode2022/day1/input.txt";
        String fileContents = FileLoader.getFileAsString(filePath);
        BufferedReader reader = FileLoader.getFileAsReader(filePath);

//        LargeCalorieCounter should be used if input file greater than 1GB
        int largeSolution = LargeCalorieCounter.findElfWithMostCalories(reader);
        System.out.println("Large calculator solution: " + largeSolution);

//        SmallCalorieCounter should be used if input file smaller than 1GB
        int smallSolutionPartOne = SmallCalorieCounter.findElfWithMostCalories(fileContents);
        System.out.println("Small calculator solution part 1: " + smallSolutionPartOne);
        int smallSolutionPartTwo = SmallCalorieCounter.findSumOfTopThreeElves(fileContents);
        System.out.println("Small calculator solution part 2: " + smallSolutionPartTwo);

    }
}