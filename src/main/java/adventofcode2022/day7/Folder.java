package adventofcode2022.day7;

import java.util.ArrayList;

public class Folder extends FolderItem {

    Folder parent;

    ArrayList<FolderItem> items = new ArrayList<>();

    @Override
    public int getSize() {
        return 0;
    }

}