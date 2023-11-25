package adventofcode2022.day4;

import java.io.BufferedReader;

public class AssignmentInspector {
    public static long getCountOfBadAssignments(BufferedReader reader) {
        return reader.lines()
                .map(Pair::new)
                .filter(Pair::isFullyContained)
                .count();
        /*
        * input looks like 2-4, 6-8
        *
        * if alpha is contained in beta
        * the highest number in alpha will be equal to or less than the highest number in beta
        * the lower number in alpha will be equal to or less than the lowest number in beta
        *
        * vice versa if beta is contained in alpha
        *
        * */

    }
}