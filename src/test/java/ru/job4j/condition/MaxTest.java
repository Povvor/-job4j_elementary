package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when0020Then2() {
        double first = 0;
        double second = 0;
        double third = 2;
        double fourth = 0;
        double expected = 2;
        double output = Max.Maximum(first, second, third, fourth);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1539Then9() {
        double first = 1;
        double second = 5;
        double third = 3;
        double fourth = 9;
        double expected = 9;
        double output = Max.Maximum(first, second, third, fourth);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1111Then1() {
        double first = 1;
        double second = 1;
        double third = 1;
        double fourth = 1;
        double expected = 1;
        double output = Max.Maximum(first, second, third, fourth);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
