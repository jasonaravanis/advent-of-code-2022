package adventofcode2022.day5;

public class ShipYard {
    public final Stack[] stacks;

    public ShipYard(String initialState) {
        int stackCount = 9;
        this.stacks = new Stack[stackCount];
        for (int i = 0; i < stackCount; i++) {
            stacks[i] = new Stack();
        }
        String[] rows = initialState.split("\n");
        for (String row : rows) {
            for (int i = 0; i < stackCount; i++) {
                char currentChar = row.charAt((4 * i) + 1);
                if (Character.isLetter(currentChar)) {
                    Stack stack = stacks[i];
                    stack.crates.addFirst(new Crate(currentChar));
                }
            }
        }
    }

    public void processInstruction(Instruction instruction) {
        Stack sourceStack = stacks[instruction.stackSource - 1];
        Stack destinationStack = stacks[instruction.stackDestination - 1];
        for (int i = 0; i < instruction.crateCount; i++) {
            Crate crate = sourceStack.crates.pollLast();
            if (crate != null) {
                destinationStack.crates.addLast(crate);
            }
        }
    }
}