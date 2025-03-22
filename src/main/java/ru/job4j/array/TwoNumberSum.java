package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = array.length - 1;
        int j = 0;
        while (i > j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[]{j, i};
            } else if (sum > target) {
                i--;
            } else {
                j++;
            }
        }
        return new int[0];
    }
}