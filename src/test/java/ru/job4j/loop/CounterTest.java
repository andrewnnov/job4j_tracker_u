package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.loop.Counter.sumByEven;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTen() {
        int result = sumByEven(1, 10);
        assertEquals(30, result); // Even numbers: 2, 4, 6, 8, 10; Sum = 30
    }

    @Test
    public void whenSumEvenNumbersFromZeroToFive() {
        int result = sumByEven(0, 5);
        assertEquals(6, result); // Even numbers: 0, 2, 4; Sum = 6
    }

    @Test
    public void whenStartAndFinishAreTheSameAndEven() {
        int result = sumByEven(4, 4);
        assertEquals(4, result); // Only one even number: 4
    }

    @Test
    public void whenStartAndFinishAreTheSameAndOdd() {
        int result = sumByEven(5, 5);
        assertEquals(0, result); // No even numbers in range
    }

    @Test
    public void whenRangeIsNegative() {
        int result = sumByEven(-10, -1);
        assertEquals(-30, result); // Even numbers: -10, -8, -6, -4, -2; Sum = -30
    }

    @Test
    public void whenRangeHasNoEvenNumbers() {
        int result = sumByEven(1, 1);
        assertEquals(0, result); // No even numbers in range
    }

    @Test
    public void whenFinishIsLessThanStart() {
        int result = sumByEven(10, 5);
        assertEquals(0, result); // Invalid range, should return 0
    }

}