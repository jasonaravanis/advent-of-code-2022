package adventofcode2022.day5;

import java.io.IOException;

public class ShipYard {
    private final int stackCount = 9;
    private final Stack[] stacks;

    public ShipYard(String initialState) throws IOException {
        this.stacks = new Stack[stackCount];
        // create the stacks
        for (int i = 0; i < stackCount; i++) {
            stacks[i] = new Stack(i+1);
        }
        // load the initial stack state
        String[] rows = initialState.split("\n");
        for (String row : rows) {
            for (int i = 0; i < stackCount; i++) {
                char currentChar = row.charAt((4 * i) + 1);
                if (Character.isLetter(currentChar)) {
                    Stack stack = stacks[i];
                    stack.crates.addLast(new Crate(currentChar));
                }
            }
        }
    }
}