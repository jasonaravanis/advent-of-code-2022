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
    public static void main(String[] args) {


        try {
            InputStream inputStream = Main1.class.getResourceAsStream("input.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("This should never happen, I know this file exists", e);
        }

    }
}