# Smallest Permutation Track Number

## Problem Description

Given a car registration number (an integer, possibly negative), generate the smallest possible track number by permuting its digits (ignoring the sign), such that the result does not start with zero.

- Input: An integer `num` (−10⁷ ≤ num ≤ 10⁷)
- Output: The smallest integer formed by permuting the digits of `num` (ignoring sign), not starting with zero.

### Example

**Input:**
```
934
```
**Output:**
```
349
```

## Solution Approach

1. Take the absolute value of the input number.
2. Extract all digits.
3. Find the smallest permutation of these digits that does not start with zero.
4. Output the result as the track number.

## Project Structure

```
src/
  main/
    java/
      com/
        example/
          Solution.java      # Main solution implementation
  test/
    java/
      com/
        example/
          SolutionTest.java  # Unit tests for the solution
assets/
  question.jpeg             # Problem screenshot
```

## How to Run

This project uses Java 11. To run the solution:

1. Compile the code:
   ```sh
   javac -d target/classes src/main/java/com/example/Solution.java
   ```
2. Run the solution (you may need to add a main method for manual testing):
   ```sh
   java -cp target/classes com.example.Solution
   ```

## Testing

Unit tests are provided in `SolutionTest.java`. To run tests:

- Use your preferred Java test runner (e.g., JUnit via Maven or your IDE).

## License

This project is for educational purposes.
