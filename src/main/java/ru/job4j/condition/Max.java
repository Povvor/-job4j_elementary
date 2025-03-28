package ru.job4j.condition;

public class Max {

    public static double Maximum(double first, double second) {
        return(first > second ? first : second);
    }

    public static double Maximum(double first, double second, double third) {
        return(third > Maximum(first, second) ? third : Maximum(first, second));
    }

    public static double Maximum(double first, double second, double third, double fourth) {
        return(fourth > Maximum(first, second, third) ? fourth : Maximum(first, second, third));
    }
}