# Java Code Examples

This repository contains a few small, self-contained Java programs, each demonstrating a different concept.

### Codebase Summary

*   `Main.java`: A standard "Hello, world!" entry point.
*   `DigitCounter.java`: A simple utility that counts the number of times a specific digit appears in an integer.
*   `MissingCharacter.java`: A program that compares two strings and identifies the first character where they differ.
*   `Subsets.java`: An implementation of a common algorithm to find all possible subsets (the power set) of a given set of numbers.

### Interesting Patterns & Techniques

1.  **Backtracking (`Subsets.java`):** This is the most advanced technique in this codebase. The `Subsets.java` file provides a crystal-clear example of a **backtracking algorithm** to solve the "subsets" problem. Backtracking is a powerful, recursive approach for exploring all possible solutions to a problem and is fundamental for solving many algorithmic challenges, like generating permutations, combinations, or solving puzzles like Sudoku. The key pattern is "choose, explore, unchoose."

2.  **Integer Manipulation (`DigitCounter.java`):** The `countDigit` method demonstrates a classic, efficient way to work with the digits of a number mathematically. Instead of converting the number to a string, it uses the modulo (`%`) and division (`/`) operators to isolate and inspect each digit. This is a common and performant pattern in numerical computation.

3.  **Defensive Copying (`Subsets.java`):** In the `backtrack` method, the line `result.add(new ArrayList<>(tempList));` is a subtle but crucial detail. It demonstrates the importance of creating a *copy* of the temporary list before adding it to the final results. If you were to just add `tempList` directly, you would end up with a list of empty lists, because the same `tempList` object would be cleared out by the backtracking process. This highlights a key concept when working with mutable objects in collections.

4.  **Edge Case Handling (`MissingCharacter.java`):** The `findMissingCharacter` method shows good practice in handling various edge cases, such as when the strings are identical, one is empty, or their lengths differ. This is a good, simple example of writing robust methods.
