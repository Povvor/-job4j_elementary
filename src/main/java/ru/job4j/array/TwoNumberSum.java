package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] + array[j] == target && i != j) {
                return new int[]{j, i};
            } else {
                i++;
            }
            if (i == array.length) {
                i = 0;
                j++;
            }
        }
        return new int[0];
    }
}