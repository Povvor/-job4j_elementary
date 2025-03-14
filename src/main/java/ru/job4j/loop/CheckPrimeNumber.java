package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                 return false;
            }
            i++;
        }
        return true;

    }

}

