# Towers of Hanoi - Recursive Puzzle Solver

_A Java-based command-line application demonstrating recursion using the Towers of Hanoi problem._

## Project Overview

This application demonstrates a **recursive algorithm** using the classic **Towers of Hanoi** puzzle. The goal is to move a stack of discs from one tower to another under the following rules:

- Only one disc may be moved at a time.
- A larger disc may **not** be placed on top of a smaller disc.
- The user selects the number of discs (1–5), and the program **automatically solves the puzzle**.

Originally developed as an academic assignment, the project has been **refactored** with an emphasis on readability, logical separation, and **industry-standard practices**.

---

## Features

- Recursive algorithm with step-by-step disc movement
- **User input validation** with integer constraints (max: 5 discs)
- **ASCII tower graphics** before and after solving
- Modular design using **MVC principles**
- **Minimal main method** in `TowerApp.java`
- Clean error handling and loop control

## Installation and Usage

### Prerequisites
- Java 17 or later (Java 22+ recommended)

### Clone the Repository

## Getting Started

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/dcan-tech/towers-of-hanoi.git
    ```

# Compile all Java source files to the 'out' directory
javac -d out src/com/dylancanfield/hanoi/*.java

# Run the main application
java -cp out com.dylancanfield.hanoi.TowerApp

## Project Structure
```
towers-of-hanoi/
├── src/
│   └── com/dylancanfield/hanoi/
│       ├── TowerApp.java               # Minimal entry point (main method)
│       ├── controller/
│       │   └── TowerCLIController.java # Handles input flow and game loop
│       ├── model/
│       │   └── HanoiSolver.java        # Recursive logic for solving the puzzle
│       └── view/
│           └── AsciiView.java          # Responsible for all console output
├── out/                                # Compiled class files (ignored via .gitignore)
├── README.md
├── .gitignore
```

## How It Works

* A welcome message and ASCII representation of the towers are displayed.
* The program prompts the user to enter a disc count (1–5), with input validation.
* A recursive algorithm determines the steps required to solve the puzzle.
* Each move is printed step by step in the correct order.
* The final solved tower is shown using ASCII graphics.
* The user is then asked whether they'd like to play again or exit.

## Planned Enhancements

* Support for more than 5 discs
* Graphical visualization (GUI) in place of ASCII
* Real-time disc movement simulation
* Cleaner spacing/alignment in ASCII output

## Author

Dylan Canfield
