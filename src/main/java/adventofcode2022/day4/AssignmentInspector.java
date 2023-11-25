package adventofcode2022.day4;

import java.io.BufferedReader;

public class AssignmentInspector {
    public static long getCountOfBadAssignments(BufferedReader reader) {
        return reader.lines()
                .map(Pair::new)
                .filter(Pair::isFullyContained)
                .count();
    }
    public static long getCountOfAnyOverlap(BufferedReader reader) {
        return reader.lines()
                .map(Pair::new)
                .filter(Pair::hasAnyOverlap)
                .count();
    }
}