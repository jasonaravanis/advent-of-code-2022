package adventofcode2022.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacketParserTest {

    @Test
    void findsWhereAllFourCharsAreDifferent() {

        assertEquals(5, PacketParser.getStartOfPacketIndex("bvwbjplbgvbhsrlpgdmjqwftvncz"));
        assertEquals(6, PacketParser.getStartOfPacketIndex("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(10, PacketParser.getStartOfPacketIndex("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(11, PacketParser.getStartOfPacketIndex("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }
}