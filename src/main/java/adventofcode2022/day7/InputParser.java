package adventofcode2022.day7;

import java.io.BufferedReader;
import java.io.IOException;

public class InputParser {

    private static final int TOTAL_DISK_SPACE = 7 * 1000 * 1000 * 10;
    private static final int REQUIRED_DISK_SPACE = 3 * 1000 * 1000 * 10;

    /*
    * potential to replace rootDirectory with a singleton RootFolder that extends Folder with overridden getParent method
    * that returns a reference to itself
    */
    private static final Folder rootDirectory = new Folder("/", null );
    private static Folder currentDirectory = rootDirectory;

    private static void setCurrentDirectory(Folder newDirectory) {
        if (newDirectory != null) {
            currentDirectory = newDirectory;
        }
    }

    private static void parseInputLine(String line) {
        String[] lineParts = line.split(" ");
        if (lineParts[0].equals("$")) {
            if (lineParts[1].equals("cd")) {
                if(lineParts[2].equals("..")) {
                    setCurrentDirectory(currentDirectory.getParent() != null ? currentDirectory.getParent() : rootDirectory);
                    return;
                } else if (lineParts[2].equals("/")) {
                    setCurrentDirectory(rootDirectory);
                    return;
                }
                else {
                    setCurrentDirectory(currentDirectory.resolve(lineParts[2]));
                    return;
                }
            }
            if (lineParts[1].equals("ls")) {
                return;
            }
        }
        if (lineParts[0].equals("dir")) {
            Folder newFolder = new Folder(lineParts[1], currentDirectory);
            currentDirectory.addItem(newFolder);
        }
        if (lineParts[0].chars().allMatch(Character::isDigit)) {
            File newFile = new File(Integer.parseInt(lineParts[0]), lineParts[1], currentDirectory);
            currentDirectory.addItem(newFile);
        }
    }

    public static String getSolution(BufferedReader reader) throws IOException {

        String line;
        while ((line = reader.readLine()) != null) {
            parseInputLine(line);
        }
        rootDirectory.getSize();

        int partOneSolution = FoldersList.LIST.getSumOfSmallFolderSizes();

        int newSpaceNeeded = REQUIRED_DISK_SPACE - (TOTAL_DISK_SPACE - rootDirectory.getSize());

        int partTwoSolution = FoldersList.LIST.getSizeOfSmallestFolderThatIsLargerThan(newSpaceNeeded);

        return String.format("Day 7 part 1 solution: %d\nDay 7 part 2 solution: %d", partOneSolution, partTwoSolution);
    }
}