package adventofcode2022.day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public enum FoldersList {
    LIST;

//   Implemented as a HashSet as never want to have duplicate references to same folder
    private final Set<Folder> folders = new HashSet<>();

    public void addFolder(Folder folder) {
        folders.add(folder);
    }

    public int getSumOfSmallFolderSizes() {
        return folders.stream().mapToInt(Folder::getSize).filter(i -> i < 100000).sum();
    }

}