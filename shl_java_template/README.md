# SHL Java Template

This project is a simple Java template for SHL-style coding challenges. It uses Maven for build and dependency management, and JUnit 5 for testing.

## Project Structure

```
pom.xml
src/
  main/
    java/
      com/
        example/
          Solution.java
  test/
    java/
      com/
        example/
          SolutionTest.java
target/
```

- `Solution.java`: Main class where you implement your solution. Reads input from standard input and prints output to standard output.
- `SolutionTest.java`: JUnit 5 test class for unit testing your solution.
- `pom.xml`: Maven configuration file with dependencies and build plugins.

## Requirements

- Java 17 or higher
- Maven 3.6+

## How to Build

```
mvn clean compile
```

## How to Run

```
mvn exec:java -Dexec.mainClass="com.example.Solution"
```

Or, compile and run manually:

```
mvn clean package
java -cp target/classes com.example.Solution
```

## How to Test

```
mvn test
```

## Example Usage

When you run the program, it expects a single word as input (e.g., a name):

```
$ java -cp target/classes com.example.Solution
Alice
Hello! Alice
```

## License

This project is provided as a template and does not include a specific license.
