DESCRIPTION
A simple Snake Game built using Java Swing. The game features grid-based movement, dynamic snake growth, and collision detection. This project demonstrates core Java programming concepts, including object-oriented design, event handling, and game loops.

Features

Classic Snake Mechanics:

Grow the snake by eating apples.

Avoid collisions with walls and the snake’s own body.

Grid-Based Movement:

Apples and snake segments are positioned on a uniform grid.

Dynamic Gameplay:

The snake grows longer with each apple consumed, increasing the challenge.

How to Run

Clone the repository:

git clone <repository-url>

Navigate to the project directory.

Compile the Java files:

javac snakeMain.java

Run the game:

java snakeMain

Controls

Arrow Keys:

↑ Move Up

↓ Move Down

← Move Left

→ Move Right

Gameplay

The snake starts small and grows each time it eats a red apple.

Avoid collisions with:

The walls.

The snake’s own body.

The game ends when a collision occurs.

File Structure

snakeMain.java:

The main entry point of the application. Sets up the game window and initializes the game panel.

Apple.java:

Represents the apples in the game. Handles positioning and rendering.

body.java:

Represents individual segments of the snake’s body.

gPanel.java:

The core of the game, responsible for game logic, rendering, and user input handling.
