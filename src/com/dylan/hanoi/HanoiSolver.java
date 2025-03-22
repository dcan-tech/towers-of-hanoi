// Programmer: Dylan Canfield
// Class: CS &145
// Date 8/**/2022
// Assignment: Towers of Hanoi
// display use of recursive algorithm
// using the "Towers of Hanoi" problem
// puzzle involves moving discs between 3 towers
// discs have incrementing diameters with
// the smallest disc on top.  Larger discs
// cannot be stacked on smaller discs
// User input for amount of discs up to 5
// Display solution for amount of discs

package com.dylan.hanoi;

import java.util.Scanner;

public class HanoiSolver {

    private static boolean stop = false;
    private static boolean asciiTower = false;

    public static void intro() {
        System.out.println("\nWelcome to the Towers of Hanoi");
        System.out.println("Puzzle Solver! This program shows");
        System.out.println("the order in which discs are moved");
        System.out.println("to solve this recursive demonstration!");
        asciiTower(); // ascii tower display to console
    } // end of intro

    public static void asciiTower() {
        System.out.println("   ^         ^        ^");
        System.out.println("   !         !        !");
        System.out.println("   *         !        !");
        System.out.println("  ***        !        !");
        System.out.println(" *****       !        !");
        System.out.println("--------------------------");
    } // end of asciiTower

    public static void menu() { // "main" run of code
        int nDisks = howMany(); // prompt user for # of discs
        printResults(nDisks); // display puzzle solve to console
        while (!stop) {
            playAgain(); } // prompt to playAgain method
    } // end of menu method


    public static int howMany() { // user input for # of discs
        Scanner console = new Scanner(System.in);
        int inputInteger;
        System.out.println("\nThere are five discs available.");
        System.out.print("How many discs shall I solve for ?  ");

        while (true) { // try+catch for integer only
            try {
                String input = console.next();
                inputInteger = Integer.parseInt(input);
                break; } // break if integer was input

            catch (NumberFormatException e) {
                System.out.println("Please Enter A Valid Integer!\n");
                System.out.print("How many discs shall I solve for ?  ");
            } // end of exception catch
        } // end of user integer input check
        if (inputInteger > 5) { // forced max value of 5
            System.out.println();
            System.out.println("That's a few too many discs!");
            System.out.println("Solving for five discs.");
            inputInteger = 5;
        }
        return inputInteger;
    } // end of howMany method

    public static void playAgain() { // prompt user to play again
        Scanner in = new Scanner(System.in);

        System.out.print("\nDo you want to play again? ");
        String pa = in.nextLine();
        String playAgain = pa.replaceAll("\\s", ""); // remove blanks
        playAgain = playAgain.toUpperCase(); // convert $ to upperCase
        String singleChar = playAgain.substring(0, 1); // first char only
        if ("N".equals(singleChar)) { // any answer that begins with 'n' quits
            stop = true;
            System.out.println("\nThanks for Trying the Towers of Hanoi Demo!"); }
        else {
            menu(); } // run program again
    } // end of playAgain method

    public static void printResults(int nDisks) { // display results to console
        System.out.println("\nThe Towers Have Been Solved!\n");
        String solutionSteps = hanoi(nDisks, 1, 3);
        for (String step : solutionSteps.split(";")) { // for steps in solution
            System.out.printf("Disc moved from Tower %s", step);
            System.out.println(); } // end of loop

        if (!asciiTower) // only print asciiTowerSolved once
            asciiTowerSolved();
    } // end of printResults

    public static void asciiTowerSolved() {
        System.out.println();
        System.out.println("   ^         ^        ^");
        System.out.println("   !         !        !");
        System.out.println("   !         !        *");
        System.out.println("   !         !       ***");
        System.out.println("   !         !      *****");
        System.out.println("--------------------------");
        asciiTower = true; // print once
    } // end of asciiTowerSolved method

    public static String hanoi(int nDisks, int fromPeg, int toPeg) { // recursive solver
        if(nDisks == 1) { // one disc completes solve
            return fromPeg + " to Tower " + toPeg + ";"; }
        else {
            String step1, step2, step3;
            int helpPeg = 6 - fromPeg - toPeg; // position of "help" peg

            step1 = hanoi(nDisks - 1, fromPeg, helpPeg); // move to "help" peg
            step2 = fromPeg + " to Tower " + toPeg + ";";
            step3 = hanoi(nDisks - 1, helpPeg, toPeg); // move to "target" peg

            return step1 + step2 + step3; }
    } // end of hanoi method
} // end of class TowerManager
