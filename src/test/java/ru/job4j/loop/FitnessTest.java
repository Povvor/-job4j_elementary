package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitnessTest {

    @Test
    @DisplayName("Test Fitness.calc #1")
    void whenIvan30AndNik40ThenResult1() {
        int ivan = 30, nik = 40;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    @DisplayName("Test Fitness.calc #2")
    void whenIvan10AndNik30ThenResult1() {
        int ivan = 10, nik = 30;
        int expected = 3;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    @DisplayName("Test Fitness.calc #3")
    void whenIvan50AndNik50ThenResult1() {
        int ivan = 50, nik = 50;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    @DisplayName("Test Fitness.calc #4")
    void whenIvan60AndNik50ThenResult0() {
        int ivan = 60, nik = 50;
        int expected = 0;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);

    }

}