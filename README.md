# Game 2048

System Design for 2048 Game
1. Architecture Overview
The system follows the Model-View-Controller (MVC) pattern:

Model (GameOf2048 & Board): Manages the game state, including the board and game logic.
View (GameOf2048View): Provides the GUI interface for user interaction.
Controller (GameOf2048Controller): Handles user inputs and updates the model and view accordingly.
2. Component Breakdown
2.1 Model Layer
GameOf2048 (Main Game Logic)

Handles game rules (merging tiles, checking game over/win).
Processes user moves (Left, Right, Up, Down).
Maintains score tracking.
Board (Game Board)

Stores the 4x4 grid state.
Manages tile placement and random number generation (2s and 4s).
Checks if the player can still move.
2.2 View Layer
GameOf2048View (GUI)
Renders the board using JFrame and JPanel.
Displays the game state, including the score and tiles.
Handles key press events to send user inputs to the controller.
2.3 Controller Layer
GameOf2048Controller
Receives user input (key presses).
Calls GameOf2048 methods to process moves.
Updates the view after each move.
Ends the game when win/loss conditions are met.
3. Flow of Execution
Game Initialization (Game2048GUI)

Creates instances of GameOf2048View, GameOf2048, and GameOf2048Controller.
Links the components together.
User Input Handling (GameOf2048View)

Listens for key presses (W/A/S/D or Arrow Keys).
Calls handleUserInput() in GameOf2048Controller.
Processing Moves (GameOf2048Controller → GameOf2048)

Determines if the move is valid.
Updates the board and score.
Adds a new tile if a move is made.
Updating UI (GameOf2048View)

Updates the tiles and score display.
Checks for game over or win conditions.
Game End

Displays a popup message if the game is over.
4. Class Diagram
pgsql
Copy
Edit
+-----------------------------------+
|           Game2048GUI             |
+-----------------------------------+
| - main(String[] args)             |
+-----------------------------------+
         |  Instantiates
         ↓
+-----------------------------------+
|     GameOf2048Controller          |
+-----------------------------------+
| - initModel(GameOf2048)           |
| - initView(GameOf2048View)        |
| - handleUserInput(char move)      |
+-----------------------------------+
         | Controls
         ↓
+-----------------------------------+
|          GameOf2048               |
+-----------------------------------+
| - processMove(char move)          |
| - isGameOver()                    |
| - getBoard()                       |
| - getScore()                      |
+-----------------------------------+
         | Has a
         ↓
+-----------------------------------+
|             Board                 |
+-----------------------------------+
| - getBoard()                      |
| - setBoard(int[][])               |
| - addRandomDigit()                |
+-----------------------------------+

+-----------------------------------+
|         GameOf2048View            |
+-----------------------------------+
| - updateBoard(Board, int score)   |
| - showResult(String message)      |
+-----------------------------------+
