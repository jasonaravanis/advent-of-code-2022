package adventofcode2022.day1;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String filePath = "adventofcode2022/day1/input.txt";
        String fileContents = FileLoader.getFileAsString(filePath);
        BufferedReader readerOne = FileLoader.getFileAsReader(filePath);
        BufferedReader readerTwo = FileLoader.getFileAsReader(filePath);

//        LargeCalorieCounter should be used if input file greater than 1GB
        int largeSolution = LargeCalorieCounter.findElfWithMostCalories(readerOne);
        System.out.println("Large calculator solution part 1: " + largeSolution);
        int largeSolutionPartTwo = LargeCalorieCounter.findSumOfTopThreeElves(readerTwo);
        System.out.println("Large calculator solution part 2: " + largeSolutionPartTwo);

//        SmallCalorieCounter should be used if input file smaller than 1GB
        int smallSolutionPartOne = SmallCalorieCounter.findElfWithMostCalories(fileContents);
        System.out.println("Small calculator solution part 1: " + smallSolutionPartOne);
        int smallSolutionPartTwo = SmallCalorieCounter.findSumOfTopThreeElves(fileContents);
        System.out.println("Small calculator solution part 2: " + smallSolutionPartTwo);

    }
}