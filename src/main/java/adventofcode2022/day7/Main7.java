package adventofcode2022.day7;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = FileLoader.getFileAsReader("adventofcode2022/day7/input.txt");
        System.out.println(InputParser.getSolution(reader));
    }
}