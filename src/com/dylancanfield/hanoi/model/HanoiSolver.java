/**
 * Model class with recursive solution logic
 * for the Towers of Hanoi puzzle.
 */

package com.dylancanfield.hanoi.model;

import java.util.ArrayList;
import java.util.List;

// Solves puzzle and records moves as string step
public class HanoiSolver {

    private final int numDiscs;
    private final List<String> steps;

    public HanoiSolver(int numDiscs) {
        this.numDiscs = Math.min(numDiscs, 5); // MAX 5 Discs
        this.steps = new ArrayList<>();
    }

    public void solve() {
        moveDiscs(numDiscs, 1, 3);
    }

    private void moveDiscs(int n, int from, int to) {
        if (n == 1) {
            steps.add("Moved disc from Tower " + from + " to Tower " + to);
        } else {
            int aux = 6 - from - to;
            moveDiscs(n - 1, from, aux);
            steps.add("Moved disc from Tower " + from + " to Tower " + to);
            moveDiscs(n - 1, aux, to);
        }
    }

    public List<String> getSteps() {
        return steps;
    }
}

// end of HanoiSolver