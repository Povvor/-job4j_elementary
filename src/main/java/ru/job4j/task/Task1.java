package ru.job4j.task;

public class Task1 {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int[] output = new int[2];
        while(true) {
            if (nums[i] + nums[j] == target) {
                output[0] = i;
                output[1] = j;
                return output;
            } else if (j == nums.length - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }

    }
}
