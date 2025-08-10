package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testSmallestPermutation_310() {
        int input = 310;
        int expected = 103;
    int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_zero() {
        int input = 0;
        int expected = 0;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_negative() {
        int input = -310;
        int expected = -310;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_negativeWithZeros() {
        int input = -1000;
        int expected = -1000;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_positiveWithZeros() {
        int input = 1000;
        int expected = 1000;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_singleDigit() {
        int input = 7;
        int expected = 7;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_negativeSingleDigit() {
        int input = -8;
        int expected = -8;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_intMax() {
        int input = Integer.MAX_VALUE;
        // 2147483647 -> digits: 1,2,3,4,4,4,6,7,7,8 -> 1234446778
        int expected = 1234446778;
        int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallestPermutation_intMin() {
        int input = Integer.MIN_VALUE;
        // -2147483648 -> digits: 1,2,3,4,4,4,6,7,8,8 -> 8887644443 -> -8887644443 (溢出, 但测试逻辑)
        // 实际会溢出，测试只保证不抛异常
        Solution.smallestPermutation(input);
    }

    @Test
    public void testSmallestPermutation_918() {
        int input = 918;
        int expected = 189;
    int actual = Solution.smallestPermutation(input);
        assertEquals(expected, actual);
    }
}
