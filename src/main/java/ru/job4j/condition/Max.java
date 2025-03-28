package ru.job4j.condition;

public class Max {

    public  double maximum(double first, double second) {
        return (first > second ? first : second);
    }

    public  double maximum(double first, double second, double third) {
        return (third > maximum(first, second) ? third : maximum(first, second));
    }

    public  double maximum(double first, double second, double third, double fourth) {
        return (fourth > maximum(first, second, third) ? fourth : maximum(first, second, third));
    }
}