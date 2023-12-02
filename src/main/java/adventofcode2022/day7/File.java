package adventofcode2022.day7;

public class File implements FolderItem {
    public String name;
    public int size;

    public Folder parent;

    public File (int size, String name, Folder parent) {
        this.name = name;
        this.size = size;
        this.parent = parent;
    }


    public Folder getParent() {
        return parent;
    }


    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}