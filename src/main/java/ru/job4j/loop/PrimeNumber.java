package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        int i = 0;
        while (i <= finish) {
           if (CheckPrimeNumber.check(i)) {
               count++;
            }
           i++;
        }
        return count;
    }
}

