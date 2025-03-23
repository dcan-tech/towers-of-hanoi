/**
 * Entry point for the Towers of Hanoi application.
 * Delegates control to the CLI controller.
 */

package com.dylancanfield.hanoi;

import com.dylancanfield.hanoi.controller.TowerCLIController;

public class TowerApp {

    public static void main(String[] args) {
        TowerCLIController controller = new TowerCLIController();
        controller.run();
    }
}
// end of TowerApp