package ru.job4j.task;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Task1Test {

    @Test
    void twoSum1() {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = Task1.twoSum(input, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void twoSum2() {
        int[] input = {3,3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = Task1.twoSum(input, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void twoSum3() {
        int[] input = {3,2,4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = Task1.twoSum(input, target);
        assertThat(result).isEqualTo(expected);
    }
}