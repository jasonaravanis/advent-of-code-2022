package adventofcode2022.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileLoader {

    private static InputStreamReader getInputStreamReader(URL resourceURL) throws IOException {
        if (resourceURL == null) {
            throw new RuntimeException("Failed to get path to file");
        }
        InputStream inputStream = resourceURL.openStream();
        if (inputStream == null) {
            throw new RuntimeException("This should never happen, I know this file exists");
        }
        return new InputStreamReader(inputStream);
    }

    public static BufferedReader getFileAsReader(String path) throws IOException {
        BufferedReader reader;
        ClassLoader classLoader = FileLoader.class.getClassLoader();
        URL resourceURL = classLoader.getResource(path);
        InputStreamReader inputStreamReader = getInputStreamReader(resourceURL);
        reader = new BufferedReader(inputStreamReader);
        return reader;
    }



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