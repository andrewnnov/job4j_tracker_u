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
        assertEquals(30, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToFive() {
        int result = sumByEven(0, 5);
        assertEquals(6, result);
    }

    @Test
    public void whenStartAndFinishAreTheSameAndEven() {
        int result = sumByEven(4, 4);
        assertEquals(4, result);
    }

    @Test
    public void whenStartAndFinishAreTheSameAndOdd() {
        int result = sumByEven(5, 5);
        assertEquals(0, result);
    }

    @Test
    public void whenRangeIsNegative() {
        int result = sumByEven(-10, -1);
        assertEquals(-30, result);
    }

    @Test
    public void whenRangeHasNoEvenNumbers() {
        int result = sumByEven(1, 1);
        assertEquals(0, result);
    }

    @Test
    public void whenFinishIsLessThanStart() {
        int result = sumByEven(10, 5);
        assertEquals(0, result);
    }

}