package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart4AndFinish8ThenResult30() {
        int start = 4, finish = 8;
        int expected = 30;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart7AndFinish13ThenResult30() {
        int start = 7, finish = 13;
        int expected = 30;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus6AndFinish14ThenResult44() {
        int start = -6, finish = 14;
        int expected = 44;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}