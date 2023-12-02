package adventofcode2022.day7;

import java.io.BufferedReader;
import java.io.IOException;

public class InputParser {

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

    public static int getPartOneSolution(BufferedReader reader) throws IOException {

        String line;
        while ((line = reader.readLine()) != null) {
            parseInputLine(line);
        }
        rootDirectory.getSize();

        return FoldersList.LIST.getSumOfSmallFolderSizes();
    }
}