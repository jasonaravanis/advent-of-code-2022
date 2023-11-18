package adventofcode2022.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main1 {
    // we need to scan the text file
    // we need to sum each group of values into a total
    // we need to find the top three totals

    // we need to scan the text file
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;

        try {
            InputStream inputStream = Main1.class.getResourceAsStream("input.txt");
            if (inputStream == null) {
                throw new RuntimeException("This should never happen, I know this file exists");
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            int fattestElfCalories = CalorieCounter.findElfWithMostCalories(reader);
            System.out.println("The elf with the most calories is carrying " + fattestElfCalories + " calories");
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong", e);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }
}