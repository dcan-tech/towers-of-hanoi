# Towers of Hanoi - Recursive Puzzle Solver

_A Java-based command-line application demonstrating recursion using the Towers of Hanoi problem._

## Project Overview

This program is a **recursive algorithm demonstration** using the **Towers of Hanoi** puzzle. The goal of the game is to move a stack of discs from one tower to another following specific rules:

- Only one disc can be moved at a time.
- A larger disc **cannot** be placed on top of a smaller disc.
- The user selects the number of discs (up to 5), and the program **automatically solves the puzzle**.

This project was originally developed for an academic assignment and has been structured for **readability, logic flow, and industry best practices**.

## Features

- Recursive algorithm to solve the Towers of Hanoi puzzle
- **User input validation** with integer constraints (max 5 discs)
- **ASCII tower graphics** to visualize the problem before and after solving
- **Minimal main method** (found in `TowerTester.java`)
- **Boolean expressions & exception handling** for improved logic flow

## Installation and Usage

### Prerequisites
- Java 17 or later

### Clone the Repository

## Getting Started

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/dcan-tech/towers-of-hanoi.git
    ```

2.  **Compile and Run:**

    ```bash
    javac -d out src/com/dylancanfield/towersofhanoi/*.java
    java -cp out com.dylancanfield.towersofhanoi.TowerTester
    ```

## Project Structure
```
towers-of-hanoi/
├── src/
│   └── com/dylancanfield/towersofhanoi/
│       ├── model/          # Core logic (recursive solver)
│       ├── view/           # ASCII rendering and user interaction
│       ├── controller/     # Handles user input and game flow
│       ├── TowerManager.java  # Main game logic & recursive solver
│       ├── TowerTester.java   # Minimal main method to run the program
├── out/                    # Compiled output (ignored in .gitignore)
├── README.md
├── .gitignore
```

## How It Works

* The program welcomes the user with an ASCII representation of the three towers.
* The user enters the number of discs (1-5).
* The program validates the input and automatically solves the puzzle.
* It prints each move taken to solve the puzzle.
* The final solved tower is displayed using ASCII graphics.
* The user is prompted to play again or exit.

## Planned Enhancements

* Add support for more than 5 discs for advanced users.
* Implement graphical visualization instead of ASCII output.
* Improve display formatting for a cleaner output.

## Author

Dylan Canfield
