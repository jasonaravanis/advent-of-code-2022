package adventofcode2022.day5;

import adventofcode2022.utils.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException {
        String input = FileLoader.getFileAsString("adventofcode2022/day5/input.txt");
        String partOneSolution = Solver.getPartOneSolution(input);
    }
}

/*
 * Step Zero: load file
 *
 * get the file as a reader
 * initialise a new Solver with the reader as a parameter
 *
 * Step One: get the puzzle input into crates/stacks
 *
 * Solver initialises an array of 9 stacks
 * Solver reads first ten lines of reader
 * For each line:
 *   we can get the value at each char position 1, 6, 10 etc
 *   each position is mapped to one of the 9 stacks
 *   we generate a crate for each char and append it to the stack
 *
 * Step Two: process crate movements
 *
 * For remaining lines:
 *   read each line
 *   split string by spaces, isolate crate count, stack source, stack destination
 *   apply crate movement
 *
 * Step Three: get top crates
 *
 * when reader is empty
 * get top crate from each stack
 * combine and return
 *
 * */