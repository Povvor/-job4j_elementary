package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    @DisplayName("Test Counter.sum")
    void whenStart4AndFinish8ThenResult30() {
        int start = 4, finish = 8;
        int expected = 30;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test Counter.sumByEven #1")
    void whenStart7AndFinish13ThenResult30() {
        int start = 7, finish = 13;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test Counter.sumByEven #2")
    void whenStartMinus6AndFinish14ThenResult44() {
        int start = -6, finish = 14;
        int expected = 44;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}