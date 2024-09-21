package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void testNameOfDayMonday() {

        assertEquals("Понедельник", SwitchWeek.nameOfDay(1));
    }

    @Test
    void testNameOfDayTuesday() {

        assertEquals("Вторник", SwitchWeek.nameOfDay(2));
    }

    @Test
    void testNameOfDayInvalidDay() {

        assertEquals("Нет такого дня", SwitchWeek.nameOfDay(0));
        assertEquals("Нет такого дня", SwitchWeek.nameOfDay(3));
        assertEquals("Нет такого дня", SwitchWeek.nameOfDay(7));
        assertEquals("Нет такого дня", SwitchWeek.nameOfDay(-1));
    }

    @Test
    void testNameOfDayBoundaryValues() {

        assertEquals("Нет такого дня", SwitchWeek.nameOfDay(Integer.MIN_VALUE));
        assertEquals("Нет такого дня", SwitchWeek.nameOfDay(Integer.MAX_VALUE));
    }

}