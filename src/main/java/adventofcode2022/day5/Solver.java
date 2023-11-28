package adventofcode2022.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Objects;

public class Solver {
    private final int stackCount = 9;
    private Stack[] stacks = new Stack[stackCount];

    // x -> y
    // 0 -> 1
    // 1 -> 5
    // 2 -> 9
    // 3 -> 13
    // 4 -> 17

    // y = 4x + 1

    public Solver(BufferedReader reader) throws IOException {
        // create the stacks
        for (int i = 0; i < stackCount; i++) {
            stacks[i] = new Stack(i+1);
        }
        // load the initial stack state
        String line;
        while (!Objects.equals(line = reader.readLine(), "")) {
            for (int i = 0; i < stackCount; i++) {
                char currentChar = line.charAt((4 * i) + 1);
                if (Character.isLetter(currentChar)) {
                    Stack stack = stacks[i];
                    stack.crates.addLast(new Crate(currentChar));
                }
            }
        }
        for (Stack stack : stacks) {
            System.out.println(stack);
            System.out.println("\n");
        }
    }
}

//    Deque<Crate> testDeque = new ArrayDeque<>();
//
//    Crate crateA = new Crate('A');
//    Crate crateB = new Crate('B');
//    Crate crateC = new Crate('C');
//
////        testDeque.addFirst(crateA);
////        testDeque.addFirst(crateB);
////        testDeque.addFirst(crateC);
//
////        testDeque.addLast(crateA);
////        testDeque.addLast(crateB);
////        testDeque.addLast(crateC);
//
//        for (Crate element : testDeque) {
//                System.out.println(element);
//                }
//
//                Crate firstCrate = testDeque.peekFirst();
//
//                System.out.println("first crate: " + firstCrate);