package adventofcode2022.day7;

import java.util.ArrayList;

public enum SmallFoldersSingletonList {
    LIST;

    private final ArrayList<Integer> smallFolderSizes = new ArrayList<>();

    public void addSizeToList(int size) {
        smallFolderSizes.add(size);
    }

    public int getSumOfSmallFolderSizes() {
        return smallFolderSizes.stream().mapToInt(Integer::valueOf).sum();
    }

}