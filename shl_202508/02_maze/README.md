# Maze Mouse Path Finder

This project solves the problem of determining whether a mouse can reach a chunk of cheese in a maze, as described below.

## Problem Statement
A mouse is placed in a maze represented as an N x M grid of integers:
- `0` represents a wall (impassable)
- `1` represents a path (passable)
- `9` represents the chunk of cheese (goal)

The mouse starts at the top-left corner (0,0). The task is to determine if there is a path from the mouse's starting position to the cheese, moving only through cells marked `1` or `9` (not through walls or outside the maze).

### Input
- The first line contains two space-separated integers: `maze_row` (N) and `maze_col` (M).
- The next N lines each contain M space-separated integers representing the maze.

### Output
- Print `1` if there is a path from the initial position to the cheese, otherwise print `0`.

#### Example
**Input:**
```
8 8
1 0 1 1 1 0 0 1
1 0 0 0 1 1 1 1
1 0 0 0 0 0 0 0
1 0 0 9 0 1 1 1
1 1 1 0 1 0 1 1
1 0 1 1 0 1 1 0
1 0 0 0 1 0 1 1
1 1 1 1 1 1 1 1
```
**Output:**
```
1
```

### Explanation
The mouse can reach the chunk of cheese, so the output is `1`.

## Project Structure
- `src/main/java/com/example/Solution.java`: Main solution implementation.
- `src/test/java/com/example/SolutionTest.java`: Unit tests for the solution.
- `assets/maze_question.jpeg`: Problem statement image.
- `pom.xml`: Maven project configuration.

## How to Run
1. Ensure you have Java 11 and Maven installed.
2. Build the project:
   ```sh
   mvn clean package
   ```
3. Run the solution (adjust the classpath as needed):
   ```sh
   java -cp target/classes com.example.Solution
   ```
4. To run tests:
   ```sh
   mvn test
   ```

## Notes
- The mouse cannot leave the maze or climb walls.
- The solution uses standard input/output for reading the maze and printing the result.
