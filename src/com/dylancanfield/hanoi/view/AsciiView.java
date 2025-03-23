/**
 * View class responsible for all console output and ASCII display.
 * Handles intro, solution output, and user prompts.
 */

package com.dylancanfield.hanoi.view;

import java.util.List;

public class AsciiView {
    private boolean hasPrintedSolved = false;

    public void printIntro() {
        System.out.println("\nWelcome to the Towers of Hanoi");
        System.out.println("Puzzle Solver! This program shows");
        System.out.println("the order in which discs are moved");
        System.out.println("to solve this recursive demonstration!");
        printAsciiTower();
    }

    public void printAsciiTower() {
        System.out.println("   ^         ^        ^");
        System.out.println("   !         !        !");
        System.out.println("   *         !        !");
        System.out.println("  ***        !        !");
        System.out.println(" *****       !        !");
        System.out.println("--------------------------");
    }

    private void printAsciiTowerSolved() {
        System.out.println();
        System.out.println("   ^         ^        ^");
        System.out.println("   !         !        !");
        System.out.println("   !         !        *");
        System.out.println("   !         !       ***");
        System.out.println("   !         !      *****");
        System.out.println("--------------------------");
        hasPrintedSolved = true;
    }

    public void printSolution(List<String> steps) {
        System.out.println("\nThe Towers Have Been Solved!\n");

        for (String step : steps) {
            System.out.println(step);
        }

        if (!hasPrintedSolved) {
            printAsciiTowerSolved(); // output completed tower ascii
        }
    }

    public void askForDiscCount() {
        System.out.print("Enter number of discs (1–5): ");
    }

    public void printInvalidDiscCount() {
        System.out.println("Please enter a number between 1 and 5.");
    }

    public void printInvalidInput() {
        System.out.println("Invalid input. Try again.");
    }

    public void printGoodbye() {
        System.out.println("\nThanks for playing the Towers of Hanoi!");
    }
}

// end of AsciiView