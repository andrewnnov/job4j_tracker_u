package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas10Then1() {
        int[] data = new int[] {5, 10, 3};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas7ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int element = 7;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

}