package adventofcode2022.day2;

import adventofcode2022.utils.FileLoader;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "adventofcode2022/day2/input.txt";
        String fileContents = FileLoader.getFileAsString(filePath);
        int partOneSolution = StrategyEvaluator.evaluateStrategy(fileContents);
        System.out.println("Part one solution: " + partOneSolution);
        int partTwoSolution = StrategyEvaluator.evaluateStrategyPartTwo(fileContents);
        System.out.println("Part two solution: " + partTwoSolution);
    }
}