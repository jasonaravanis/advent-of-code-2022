package adventofcode2022.day7;

public interface FolderItem {
    int getSize();

    Folder getParent();

    String getName();
}