package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// import com.example.Solution; // 已在同包下无需导入

public class SolutionTest {
    @Test
    void testExample1() {
        int[][] maze = {
            {1,0,1,1,1,0,0,1},
            {1,0,0,0,1,1,1,1},
            {1,0,0,0,0,0,0,0},
            {1,0,1,0,9,0,1,1},
            {1,1,1,0,1,0,1,1},
            {1,0,1,1,0,1,1,1},
            {1,0,0,0,1,0,1,1},
            {1,1,1,1,1,1,1,1}
        };
    assertEquals(0, Solution.canReachCheese(maze));
    }

    @Test
    void testEmptyGrid() {
        int[][] maze = new int[0][0];
        assertEquals(0, Solution.canReachCheese(maze));
    }

    @Test
    void testNullGrid() {
        assertEquals(0, Solution.canReachCheese(null));
    }

    @Test
    void testSingleCellStartOpen() {
        int[][] maze = {{1}};
        assertEquals(0, Solution.canReachCheese(maze));
    }

    @Test
    void testSingleCellCheese() {
        int[][] maze = {{9}};
        assertEquals(1, Solution.canReachCheese(maze));
    }

    @Test
    void testStartBlocked() {
        int[][] maze = {
            {0,1},
            {1,9}
        };
        assertEquals(0, Solution.canReachCheese(maze));
    }

    @Test
    void testNoPath() {
        int[][] maze = {
            {1,0,0},
            {0,0,0},
            {0,0,9}
        };
        assertEquals(0, Solution.canReachCheese(maze));
    }

    @Test
    void testCheeseAtStart() {
        int[][] maze = {
            {9,1,1},
            {1,1,1},
            {1,1,1}
        };
        assertEquals(1, Solution.canReachCheese(maze));
    }

    @Test
    void testSmallMaze() {
        int[][] maze = {
            {1,9},
            {0,1}
        };
        assertEquals(1, Solution.canReachCheese(maze));
    }

    @Test
    void testBlockedCheese() {
        int[][] maze = {
            {1,1,1},
            {1,0,1},
            {1,0,9}
        };
        assertEquals(1, Solution.canReachCheese(maze));
    }

    @Test
    void testOne() {
        int[][] maze = {
            {1,1,1},
            {9,1,1},
            {0,1,0}
        };
        assertEquals(1, Solution.canReachCheese(maze));
    }

    @Test
    void testTwo() {
        int[][] maze = {
            {0,0,0},
            {9,1,1},
            {0,1,1}
        };
        assertEquals(0, Solution.canReachCheese(maze));
    }
}
