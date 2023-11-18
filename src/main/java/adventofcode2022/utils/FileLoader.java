package adventofcode2022.utils;

import adventofcode2022.day1.Main1;

import javax.swing.text.html.Option;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class FileLoader {
    // static method that takes a string and return a reader to the file
//    public static BufferedReader getFileReader(String path) {
//
//    }

    public static String getFileAsString (String filePath) {
        ClassLoader classLoader = FileLoader.class.getClassLoader();
        URL resourceURL = classLoader.getResource(filePath);
        if (resourceURL == null) {
            throw new RuntimeException("Failed to get path to file");
        }
        try {
            Path path = Paths.get(resourceURL.getPath());
            List<String> lines = Files.readAllLines(path);
            return String.join(System.lineSeparator(), lines);

        } catch (IOException e) {
            throw new RuntimeException("Something went wrong when reading file into a string", e);
        }


//        // If I need to access a file in a relative directory I can do it like this
//        URL something = FileLoader.class.getResource("/adventofcode2022/day1/input.txt");
//        System.out.println("URL: " + something);

    }
}