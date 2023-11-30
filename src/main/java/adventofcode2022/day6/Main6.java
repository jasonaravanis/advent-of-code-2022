package adventofcode2022.day6;

import adventofcode2022.utils.FileLoader;

public class Main6 {
    public static void main(String[] args) {
        String input = FileLoader.getFileAsString("adventofcode2022/day6/input.txt");
        System.out.println("Day 6 part 1 solution: " + PacketParser.getStartOfPacketIndex(input));
        System.out.println("Day 6 part 2 solution: " + PacketParser.getStartOfMessageIndex(input));

    }
}