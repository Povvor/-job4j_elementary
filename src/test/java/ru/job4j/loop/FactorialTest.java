package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenNumber5then120() {
        int number = 5;
        int expected = 120;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);

    }

    @Test
    void whenNumber0then1() {
        int number = 0;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);

    }

    @Test
    void whenNumber1then1() {
        int number = 1;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);

    }

    @Test
    void whenNumber10then3628800() {
        int number = 10;
        int expected = 3628800;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);

    }
}