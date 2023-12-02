package adventofcode2022.day7;

import java.util.ArrayList;

public class Folder implements FolderItem {
    private final Folder parent;
    private final String name;

    private final ArrayList<FolderItem> items = new ArrayList<>();

    public Folder(String name, Folder parent) {
        this.parent = parent;
        this.name = name;
    }

    public void addItem(FolderItem item) {
        items.add(item);
    }
    public String getName() {
        return name;
    }

    public Folder resolve(String folderName) {
        return items.stream()
                .filter(Folder.class::isInstance)
                .map(Folder.class::cast)
                .filter(i -> i.getName().equals(folderName))
                .findFirst()
                .orElse(null);
    }


    public Folder getParent() {
        return parent;
    }

    public int getSize() {
        int result = items.stream().mapToInt(FolderItem::getSize).sum();
        if (result <= 100000) {
            SmallFoldersSingletonList.LIST.addSizeToList(result);
        }
        return result;
    }

}