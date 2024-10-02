package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);

        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when11to31then2() {
        double expected = 2;
        Point a = new Point(1, 1);
        Point b = new Point(3, 1);

        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when22to66then0() {
        double expected = 4;
        Point a = new Point(2, 2);
        Point b = new Point(6, 2);

        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}