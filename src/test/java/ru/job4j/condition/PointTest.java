package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);
        double expected = 2.0;
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point pointA = new Point(-1, -1);
        Point pointB = new Point(1, 1);
        double expected = 2.83;
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point pointA = new Point(-2, -2);
        Point pointB = new Point(2, 2);
        double expected = 5.66;
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints11And45Then5() {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(4, 5);
        double expected = 5;
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints000And333Then5Dot196() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(3, 3 , 3);
        double expected = 5.1961;
        double output = pointA.distance3d(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints226And218Then2Dot236() {
        Point pointA = new Point(2, 2, 6);
        Point pointB = new Point(2, 1 , 8);
        double expected = 2.236;
        double output = pointA.distance3d(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints000And000Then0() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(0, 0 , 0);
        double expected = 0;
        double output = pointA.distance3d(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}

