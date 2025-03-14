package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int calc = 1;
        for (int i = 1; i <= number; i++) {
            calc = calc * i;

        }
        return calc;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1));

    }
}
