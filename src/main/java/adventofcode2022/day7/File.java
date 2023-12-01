package adventofcode2022.day7;

public class File extends FolderItem {
    public String name;
    public String extension;
    public int size;

    public File (String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}