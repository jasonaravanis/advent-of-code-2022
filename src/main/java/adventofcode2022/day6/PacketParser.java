package adventofcode2022.day6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PacketParser {

    private static List<Character> loadFirstCharacters(String input, int end) {
        return input.substring(0,end).chars().mapToObj(i -> (char) i).toList();
    }

    private static boolean listHasNoDuplicates(List<Character> list) {
        HashSet<Character> seenChars = new HashSet<>();
        for (Character character : list) {
            if(!seenChars.add(character)) {
                return false;
            }
        }
        return true;
    }

    public static int getStartOfPacketIndex(String input) {
        List<Character> firstChars = loadFirstCharacters(input, 4);

        LinkedList<Character> sample = new LinkedList<>(firstChars);

        if (listHasNoDuplicates(sample)) {
            return 4;
        }

        for (int i = 4; i < input.length(); i++) {
            Character testChar = input.charAt(i);
            sample.removeFirst();
            sample.addLast(testChar);
            if (listHasNoDuplicates(sample)) {
                return i + 1;
            }
        }

        return 0;
    }

    public static int getStartOfMessageIndex(String input) {
        List<Character> firstChars = loadFirstCharacters(input, 14);

        LinkedList<Character> sample = new LinkedList<>(firstChars);

        if (listHasNoDuplicates(sample)) {
            return 14;
        }

        for (int i = 14; i < input.length(); i++) {
            Character testChar = input.charAt(i);
            sample.removeFirst();
            sample.addLast(testChar);
            if (listHasNoDuplicates(sample)) {
                return i + 1;
            }
        }

        return 0;
    }
}