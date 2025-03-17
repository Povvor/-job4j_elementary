package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5Digit() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Digits() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort9Digits() {
        int[] data = new int[] {3, 4, 1, 2, 5, 8, 9, 7, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortCrazyDigits() {
        int[] data = new int[] {100, 321, 178, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 100, 178, 321};
        assertThat(result).containsExactly(expected);
    }
}
