# mybookhandler
Mybookhandler is a is a Java Spring Boot-based web application that allows users to upload, edit, and manage their text-based books. The application provides a user-friendly interface for file operations such as uploading, viewing, editing, and deleting books stored on the server. It also includes features for searching and analyzing book content.

Features

Upload Books:

Supports uploading .txt files through the web interface.

Ensures duplicate files are not uploaded.

View Books:

Displays the content of uploaded books in a scrollable text area.

Automatically calculates and displays document length and word count.

Edit Books:

Allows editing the content of uploaded books directly from the interface.

Saves edited content back to the server.

Delete Books:

Users can delete unwanted books from the server.

Search Functionality:

Highlights and counts keyword occurrences within book content.

Content Analysis:

Identifies and displays the most and least used words in the text.

Technologies Used

Backend:

Java Spring Boot

Frontend:

HTML, CSS, JavaScript

Bootstrap for responsive design

Database:

MySQL (for storing application data)

Other:

File storage for handling .txt files

How to Run

Clone the repository:

bash

Copy code

git clone https://github.com/cmckeague07/MyBookHandler.git

Navigate to the project directory:

bash

Copy code

cd MyBookHandler

Set up the database:

Create a MySQL database named demo.

Update the application.properties file with your MySQL credentials:

properties

Copy code

spring.datasource.url=jdbc:mysql://localhost:3306/demo

spring.datasource.username=<your-username>

spring.datasource.password=<your-password>

Build and run the application:

bash

Copy code

mvn spring-boot:run

Access the application in your browser at:

arduino

Copy code

http://localhost:8080

Folder Structure

Backend:

MyBookController.java: Handles user interactions such as uploading, deleting, and editing books.

MybookhandlerApplication.java: Initializes and runs the Spring Boot application.

Frontend:

index.html: The main interface for interacting with the application.

style.css and myStyle.css: Styling for the web pages.

scripts.js: Implements client-side functionality, including search, file loading, and word analysis.

Configuration:

application.properties: Contains database and application configuration settings.

Key Functionalities

File Upload Validation:

Ensures uploaded files are .txt.

Prevents duplicate filenames.

Interactive Book Viewer:

Displays book content dynamically.

Supports keyword search and content scrolling.

Content Editing:

Enables real-time editing of book content.

Saves changes back to the server.

File Operations:

Allows users to upload, delete, and save books through an intuitive interface.

Statistical Analysis:

Calculates document length and word count.

Identifies frequently and infrequently used words.
# Snake Game
A simple Snake Game built using Java Swing. The game features grid-based movement, dynamic snake growth, and collision detection.

This project demonstrates core Java programming concepts, including object-oriented design, event handling, and game loops.

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
