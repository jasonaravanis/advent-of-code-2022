package adventofcode2022.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacketParserTest {

    @Test
    void findsIndexOfPacketStart() {

        assertEquals(5, PacketParser.getStartOfPacketIndex("bvwbjplbgvbhsrlpgdmjqwftvncz"));
        assertEquals(6, PacketParser.getStartOfPacketIndex("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(10, PacketParser.getStartOfPacketIndex("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(11, PacketParser.getStartOfPacketIndex("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }

    @Test
    void findsIndexOfMessageStart() {
        assertEquals(19, PacketParser.getStartOfMessageIndex("mjqjpqmgbljsphdztnvjfqwrcgsmlb"));
        assertEquals(23, PacketParser.getStartOfMessageIndex("bvwbjplbgvbhsrlpgdmjqwftvncz"));

        assertEquals(23, PacketParser.getStartOfMessageIndex("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(29, PacketParser.getStartOfMessageIndex("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(26, PacketParser.getStartOfMessageIndex("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }
}