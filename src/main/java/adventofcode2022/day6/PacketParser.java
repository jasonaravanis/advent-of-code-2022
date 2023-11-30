package adventofcode2022.day6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PacketParser {

    private static List<Character> loadFirstFourCharacters(String input) {
        return input.substring(0,4).chars().mapToObj(i -> (char) i).toList();
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
        List<Character> firstFourChars = loadFirstFourCharacters(input);

        LinkedList<Character> sample = new LinkedList<>(firstFourChars);

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
}