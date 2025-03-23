/**
 * Controller class for the CLI-based Towers of Hanoi game.
 * Handles user input, invokes solver logic, and delegates display to the view.
 */

package com.dylancanfield.hanoi.controller;

import com.dylancanfield.hanoi.model.HanoiSolver;
import com.dylancanfield.hanoi.view.AsciiView;
import java.util.Scanner;

// Main interaction loop
public class TowerCLIController {

    private final Scanner scanner = new Scanner(System.in);
    private final AsciiView view = new AsciiView();

    public void run() {
        view.printIntro();

        boolean runAgain = true;
        while (runAgain) {
            int discs = getUserDiscInput();
            HanoiSolver solver = new HanoiSolver(discs);
            solver.solve();
            view.printSolution(solver.getSteps());
            runAgain = askPlayAgain();
        }

        view.printGoodbye(); // Thanks for playing
    }

    // Number of discs to solve (1 - 5)
    private int getUserDiscInput() {
        view.askForDiscCount();
        while (true) {
            try {
                int discs = Integer.parseInt(scanner.nextLine().trim());
                if (discs >= 1 && discs <= 5) return discs;
                view.printInvalidDiscCount();
            } catch (NumberFormatException e) {
                view.printInvalidInput();
            }
        }
    }

    // Any response not starting with 'y' exits
    private boolean askPlayAgain() {
        System.out.print("Play again? (y/n): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.startsWith("y");
    }
}
// End of TowerCLIController